package typings.ftpd

import typings.ftpd.anon.BufferSize
import typings.ftpd.anon.Encoding
import typings.ftpd.anon.EncodingFlag
import typings.ftpd.anon.Flag
import typings.ftpd.anon.Mode
import typings.ftpd.anon.`0`
import typings.ftpd.ftpdInts.`1`
import typings.ftpd.ftpdInts.`2`
import typings.ftpd.ftpdInts.`3`
import typings.ftpd.ftpdInts.`4`
import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.fsMod.ReadStream
import typings.node.fsMod.Stats
import typings.node.fsMod.WriteStream
import typings.node.netMod.Server
import typings.node.netMod.Socket
import typings.node.tlsMod.TlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ftpd", "FtpConnection")
  @js.native
  open class FtpConnection () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    var cwd: String = js.native
    
    var dataSocket: Socket = js.native
    
    var hasQuit: Boolean = js.native
    
    // the actual data socket
    var mode: String = js.native
    
    var pasv: Server = js.native
    
    var pbszReceived: Boolean = js.native
    
    var root: String = js.native
    
    // State for handling TLS upgrades.
    var secure: Boolean = js.native
    
    var server: FtpServer = js.native
    
    var socket: Socket = js.native
    
    var username: String = js.native
  }
  
  @JSImport("ftpd", "FtpServer")
  @js.native
  open class FtpServer protected () extends EventEmitter {
    /**
      * @param host host is a string representation of the IP address clients use to connect to the FTP server.
      *             It's imperative that this actually reflects the remote IP the clients use to access the server,
      *             as this IP will be used in the establishment of PASV data connections. If this IP is not the one clients use to connect,
      *             you will see some strange behavior from the client side (hangs).
      * @param options See test.js for a simple example.
      */
    def this(host: String, options: FtpServerOptions) = this()
    
    /**
      * Stop listening
      */
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Change/Retrieve logLevel at runtime.
      */
    var debugging: LogLevel = js.native
    
    /**
      * Start listening, see net.Server.listen()
      */
    def listen(port: Double): Unit = js.native
    def listen(port: Double, host: String): Unit = js.native
    def listen(port: Double, host: String, backlog: Double): Unit = js.native
    def listen(port: Double, host: String, backlog: Double, listeningListener: js.Function0[Unit]): Unit = js.native
    def listen(port: Double, host: String, backlog: Unit, listeningListener: js.Function0[Unit]): Unit = js.native
    def listen(port: Double, host: Unit, backlog: Double): Unit = js.native
    def listen(port: Double, host: Unit, backlog: Double, listeningListener: js.Function0[Unit]): Unit = js.native
    def listen(port: Double, host: Unit, backlog: Unit, listeningListener: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait FtpFileSystem extends StObject {
    
    def close(fd: Double): Unit = js.native
    def close(fd: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    
    /**
      * if useReadFile option is not set or is false
      */
    var createReadStream: js.UndefOr[
        js.Function2[/* path */ String, /* options */ js.UndefOr[BufferSize], ReadStream]
      ] = js.native
    
    /**
      * if useWriteFile option is not set or is false
      */
    var createWriteStream: js.UndefOr[js.Function2[/* path */ String, /* options */ js.UndefOr[Encoding], WriteStream]] = js.native
    
    var mkdir: (js.Function2[
        /* path */ String, 
        /* callback */ js.UndefOr[js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]], 
        Unit
      ]) | (js.Function3[
        /* path */ String, 
        (/* mode */ Double) | (/* mode */ String), 
        js.UndefOr[js.Function1[js.UndefOr[ErrnoException], Unit]], 
        Unit
      ]) = js.native
    
    var open: (js.Function3[
        /* path */ String, 
        /* flags */ String, 
        /* callback */ js.UndefOr[
          js.Function2[/* err */ js.UndefOr[ErrnoException], /* fd */ js.UndefOr[Double], Any]
        ], 
        Unit
      ]) | (js.Function4[
        /* path */ String, 
        /* flags */ String, 
        (/* mode */ Double) | (/* mode */ String), 
        js.UndefOr[js.Function2[js.UndefOr[ErrnoException], js.UndefOr[Double], Any]], 
        Unit
      ]) = js.native
    
    /**
      * if useReadFile option is set to 'true'
      */
    var readFile: js.UndefOr[
        (js.Function3[
          /* filename */ String, 
          (/* options */ `0`) | (/* options */ Flag) | (/* encoding */ String), 
          /* callback */ js.Function2[/* err */ ErrnoException, (/* data */ Buffer) | (/* data */ String), Unit], 
          Unit
        ]) | (js.Function2[
          /* filename */ String, 
          /* callback */ js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit], 
          Unit
        ])
      ] = js.native
    
    def readdir(path: String): Unit = js.native
    def readdir(
      path: String,
      callback: js.Function2[/* err */ js.UndefOr[ErrnoException], /* files */ js.UndefOr[js.Array[String]], Unit]
    ): Unit = js.native
    
    def rename(oldPath: String, newPath: String): Unit = js.native
    def rename(
      oldPath: String,
      newPath: String,
      callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
    ): Unit = js.native
    
    def rmdir(path: String): Unit = js.native
    def rmdir(path: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    
    /**
      * specific object properties: { mode, isDirectory(), size, mtime }
      */
    def stat(path: String): Unit = js.native
    def stat(
      path: String,
      callback: js.Function2[/* err */ js.UndefOr[ErrnoException], /* stats */ js.UndefOr[Stats], Any]
    ): Unit = js.native
    
    def unlink(path: String): Unit = js.native
    def unlink(path: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
    
    /**
      * if useWriteFile option is set to 'true'
      */
    var writeFile: js.UndefOr[
        (js.Function3[
          /* filename */ String, 
          /* data */ Any, 
          /* callback */ js.UndefOr[js.Function1[/* err */ ErrnoException, Unit]], 
          Unit
        ]) | (js.Function4[
          /* filename */ String, 
          /* data */ Any, 
          (/* options */ EncodingFlag) | (/* options */ Mode), 
          js.UndefOr[js.Function1[/* err */ ErrnoException, Unit]], 
          Unit
        ])
      ] = js.native
  }
  
  @js.native
  trait FtpServerOptions extends StObject {
    
    /**
      * I obviously set this to true when tlsOnly is on -someone needs to update this.
      */
    var allowUnauthorizedTls: js.UndefOr[Boolean] = js.native
    
    /**
      * If this is set, then filenames are not sorted in responses to the LIST and NLST commands.
      */
    var dontSortFilenames: js.UndefOr[Boolean] = js.native
    
    /**
      * A function which can be used as the argument of an array's sort method. Used to sort filenames for directory listings.
      * See [https://developer.mozilla.org/en-US/docs/JavaScript/Reference/Global_Objects/Array/sort] for more info.
      */
    var filenameSortFunc: js.UndefOr[js.Function2[/* a */ String, /* b */ String, Double]] = js.native
    
    /**
      * A function which is applied to each filename before sorting.
      * If set to false, filenames are unaltered.
      */
    var filenameSortMap: js.UndefOr[(js.Function1[/* a */ String, String]) | Boolean] = js.native
    
    /**
      * Gets the initial working directory for the user. Called after user is authenticated
      * Typical cases where you would want/need the callback involve retrieving configurations from external datasources and suchlike.
      */
    def getInitialCwd(connection: FtpConnection): Unit | String = js.native
    def getInitialCwd(connection: FtpConnection, callback: js.Function2[/* error */ js.Error, /* path */ String, Unit]): Unit | String = js.native
    
    /**
      * Gets the root directory for the user relative to the CWD. Called after getInitialCwd. The user is not able to escape this directory.
      * Typical cases where you would want/need the callback involve retrieving configurations from external datasources and suchlike.
      */
    def getRoot(connection: FtpConnection): Unit | String = js.native
    def getRoot(connection: FtpConnection, callback: js.Function2[/* error */ js.Error, /* path */ String, Unit]): Unit | String = js.native
    
    /**
      * Integer from 0-4 representing the Log Level to show.
      */
    var logLevel: js.UndefOr[LogLevel] = js.native
    
    /**
      * The maximum number of concurrent calls to fs.stat which will be made when processing a LIST request. Default 5.
      */
    var maxStatsAtOnce: js.UndefOr[Double] = js.native
    
    /**
      * If set to true, then LIST and NLST treat the characters ? and * as literals instead of as wildcards.
      */
    var noWildcards: js.UndefOr[Boolean] = js.native
    
    /**
      * Integer, specifies the upper-bound port (max port) for creating PASV connections
      */
    var pasvPortRangeEnd: js.UndefOr[Double] = js.native
    
    /**
      * Integer, specifies the lower-bound port (min port) for creating PASV connections
      */
    var pasvPortRangeStart: js.UndefOr[Double] = js.native
    
    /**
      * If this is set to true, and tlsOptions is also set, then the server will not allow logins over non-secure connections.
      * Default false
      */
    var tlsOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * If this is set, the server will allow explicit TLS authentication. Value should be a dictionary which is suitable as the options argument of tls.createServer.
      */
    var tlsOptions: js.UndefOr[TlsOptions] = js.native
    
    /**
      * Determines the maximum file size (in bytes) for which uploads are buffered in memory before being written to disk.
      * Has an effect only if useWriteFile is set to true.
      * If uploadMaxSlurpSize is not set, then there is no limit on buffer size.
      */
    var uploadMaxSlurpSize: js.UndefOr[Double] = js.native
    
    /**
      * If set to true, then files which the client uploads are slurped using 'readFile'.
      * If false, files are read using readStream.
      */
    var useReadFile: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to true, then files which the client uploads are buffered in memory and then written to disk using writeFile.
      * If false, files are written using writeStream.
      */
    var useWriteFile: js.UndefOr[Boolean] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ftpd.ftpdInts.`0`
    - typings.ftpd.ftpdInts.`1`
    - typings.ftpd.ftpdInts.`2`
    - typings.ftpd.ftpdInts.`3`
    - typings.ftpd.ftpdInts.`4`
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def DEBUG: `3` = 3.asInstanceOf[`3`]
    
    inline def ERROR: typings.ftpd.ftpdInts.`0` = 0.asInstanceOf[typings.ftpd.ftpdInts.`0`]
    
    inline def INFO: `2` = 2.asInstanceOf[`2`]
    
    inline def TRACE: `4` = 4.asInstanceOf[`4`]
    
    inline def WARN: `1` = 1.asInstanceOf[`1`]
  }
}
