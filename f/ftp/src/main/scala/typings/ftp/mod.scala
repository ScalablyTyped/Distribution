package typings.ftp

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.eventsMod.EventEmitter
import typings.node.tlsMod.ConnectionOptions
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * FTP client.
    *
    * Events:
    * @event greeting(< string >msg) - Emitted after connection. msg is the text the server sent upon connection.
    * @event ready() - Emitted when connection and authentication were sucessful.
    * @event close(< boolean >hadErr) - Emitted when the connection has fully closed.
    * @event end() - Emitted when the connection has ended.
    * @event error(< Error >err) - Emitted when an error occurs. In case of protocol-level errors, err contains
    *                              a 'code' property that references the related 3-digit FTP response code.
    */
  @JSImport("ftp", JSImport.Namespace)
  @js.native
  /**
    * Creates and returns a new FTP client instance.
    */
  class ^ () extends Client
  
  /**
    * FTP client.
    *
    * Events:
    * @event greeting(< string >msg) - Emitted after connection. msg is the text the server sent upon connection.
    * @event ready() - Emitted when connection and authentication were sucessful.
    * @event close(< boolean >hadErr) - Emitted when the connection has fully closed.
    * @event end() - Emitted when the connection has ended.
    * @event error(< Error >err) - Emitted when an error occurs. In case of protocol-level errors, err contains
    *                              a 'code' property that references the related 3-digit FTP response code.
    */
  @js.native
  trait Client extends EventEmitter {
    
    /**
      * Aborts the current data transfer (e.g. from get(), put(), or list())
      */
    def abort(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    def append(input: String, destPath: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    def append(
      input: String,
      destPath: String,
      useCompression: Boolean,
      callback: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
    def append(input: Buffer, destPath: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    def append(
      input: Buffer,
      destPath: String,
      useCompression: Boolean,
      callback: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
    def append(input: ReadableStream, destPath: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    /**
      * Same as put(), except if destPath already exists, it will be appended to instead of overwritten.
      * @param input can be a ReadableStream, a Buffer, or a path to a local file.
      * @param destPath
      * @param useCompression defaults to false.
      */
    def append(
      input: ReadableStream,
      destPath: String,
      useCompression: Boolean,
      callback: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
    
    /**
      * Sets the transfer data type to ASCII.
      */
    def ascii(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    /**
      * Sets the transfer data type to binary (default at time of connection).
      */
    def binary(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    /**
      * Optional "standard" commands (RFC 959)
      * Changes the working directory to the parent of the current directory
      */
    def cdup(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    /**
      * Connects to an FTP server.
      */
    def connect(): Unit = js.native
    def connect(config: Options): Unit = js.native
    
    /**
      * Changes the current working directory to path. callback has 2 parameters: < Error >err, < string >currentDir.
      * Note: currentDir is only given if the server replies with the path in the response text.
      */
    def cwd(path: String, callback: js.Function2[/* error */ Error, /* currentDir */ js.UndefOr[String], Unit]): Unit = js.native
    
    /**
      * Delete a file on the server
      */
    def delete(path: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    /**
      * Closes the connection to the server immediately.
      */
    def destroy(): Unit = js.native
    
    /**
      * Closes the connection to the server after any/all enqueued commands have been executed.
      */
    def end(): Unit = js.native
    
    /**
      * Retrieves a file at path from the server. useCompression defaults to false
      */
    def get(path: String, callback: js.Function2[/* error */ Error, /* stream */ ReadableStream, Unit]): Unit = js.native
    def get(
      path: String,
      useCompression: Boolean,
      callback: js.Function2[/* error */ Error, /* stream */ ReadableStream, Unit]
    ): Unit = js.native
    
    /**
      * Extended commands (RFC 3659)
      * Retrieves the last modified date and time for path
      */
    def lastMod(path: String, callback: js.Function2[/* error */ Error, /* lastMod */ Date, Unit]): Unit = js.native
    
    def list(callback: js.Function2[/* error */ Error, /* listing */ js.Array[ListingElement], Unit]): Unit = js.native
    def list(
      path: String,
      callback: js.Function2[/* error */ Error, /* listing */ js.Array[ListingElement], Unit]
    ): Unit = js.native
    /**
      * Retrieves the directory listing of path.
      * @param path defaults to the current working directory.
      * @param useCompression defaults to false.
      */
    def list(
      path: String,
      useCompression: Boolean,
      callback: js.Function2[/* error */ Error, /* listing */ js.Array[ListingElement], Unit]
    ): Unit = js.native
    def list(
      useCompression: Boolean,
      callback: js.Function2[/* error */ Error, /* listing */ js.Array[ListingElement], Unit]
    ): Unit = js.native
    
    def listSafe(callback: js.Function2[/* error */ Error, /* listing */ js.Array[ListingElement], Unit]): Unit = js.native
    def listSafe(
      path: String,
      callback: js.Function2[/* error */ Error, /* listing */ js.Array[ListingElement], Unit]
    ): Unit = js.native
    /**
      * Optional "standard" commands (RFC 959)
      * Similar to list(), except the directory is temporarily changed to path to retrieve the directory listing.
      * This is useful for servers that do not handle characters like spaces and quotes in directory names well for the LIST command.
      * This function is "optional" because it relies on pwd() being available.
      */
    def listSafe(
      path: String,
      useCompression: Boolean,
      callback: js.Function2[/* error */ Error, /* listing */ js.Array[ListingElement], Unit]
    ): Unit = js.native
    def listSafe(
      useCompression: Boolean,
      callback: js.Function2[/* error */ Error, /* listing */ js.Array[ListingElement], Unit]
    ): Unit = js.native
    
    /**
      * Logout the user from the server.
      */
    def logout(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    def mkdir(path: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    /**
      * Optional "standard" commands (RFC 959)
      * Creates a new directory, path, on the server. recursive is for enabling a 'mkdir -p' algorithm and defaults to false
      */
    def mkdir(path: String, recursive: Boolean, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    def put(input: String, destPath: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    def put(
      input: String,
      destPath: String,
      useCompression: Boolean,
      callback: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
    def put(input: Buffer, destPath: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    def put(
      input: Buffer,
      destPath: String,
      useCompression: Boolean,
      callback: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
    def put(input: ReadableStream, destPath: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    /**
      * Sends data to the server to be stored as destPath.
      * @param input can be a ReadableStream, a Buffer, or a path to a local file.
      * @param destPath
      * @param useCompression defaults to false.
      */
    def put(
      input: ReadableStream,
      destPath: String,
      useCompression: Boolean,
      callback: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
    
    /**
      * Optional "standard" commands (RFC 959)
      * Retrieves the current working directory
      */
    def pwd(callback: js.Function2[/* error */ Error, /* path */ String, Unit]): Unit = js.native
    
    /**
      * Renames oldPath to newPath on the server
      */
    def rename(oldPath: String, newPath: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    /**
      * Extended commands (RFC 3659)
      * Sets the file byte offset for the next file transfer action (get/put) to byteOffset
      */
    def restart(byteOffset: Double, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    def rmdir(path: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    /**
      * Optional "standard" commands (RFC 959)
      * Removes a directory, path, on the server. If recursive, this call will delete the contents of the directory if it is not empty
      */
    def rmdir(path: String, recursive: Boolean, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    /**
      * Sends command (e.g. 'CHMOD 755 foo', 'QUOTA') using SITE. callback has 3 parameters:
      * < Error >err, < _string >responseText, < integer >responseCode.
      */
    def site(
      command: String,
      callback: js.Function3[/* error */ Error, /* responseText */ String, /* responseCode */ Double, Unit]
    ): Unit = js.native
    
    /**
      * Extended commands (RFC 3659)
      * Retrieves the size of path
      */
    def size(path: String, callback: js.Function2[/* error */ Error, /* size */ Double, Unit]): Unit = js.native
    
    /**
      * Retrieves human-readable information about the server's status.
      */
    def status(callback: js.Function2[/* error */ Error, /* status */ String, Unit]): Unit = js.native
    
    /**
      * Optional "standard" commands (RFC 959)
      * Retrieves the server's operating system.
      */
    def system(callback: js.Function2[/* error */ Error, /* OS */ String, Unit]): Unit = js.native
  }
  
  @js.native
  trait FilePermissions extends StObject {
    
    /**
      * An empty string or any combination of 'r', 'w', 'x'.
      */
    var group: String = js.native
    
    /**
      * An empty string or any combination of 'r', 'w', 'x'.
      */
    var other: String = js.native
    
    /**
      * An empty string or any combination of 'r', 'w', 'x'.
      */
    var user: String = js.native
  }
  object FilePermissions {
    
    @scala.inline
    def apply(group: String, other: String, user: String): FilePermissions = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePermissions]
    }
    
    @scala.inline
    implicit class FilePermissionsMutableBuilder[Self <: FilePermissions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListingElement extends StObject {
    
    /**
      * The last modified date of the entry
      */
    var date: Date = js.native
    
    /**
      * The group name or ID that this entry belongs to **(*NIX only)**.
      */
    var group: js.UndefOr[String] = js.native
    
    /**
      * The name of the entry
      */
    var name: String = js.native
    
    /**
      * The user name or ID that this entry belongs to **(*NIX only)**.
      */
    var owner: js.UndefOr[String] = js.native
    
    /**
      * The various permissions for this entry **(*NIX only)**
      */
    var rights: js.UndefOr[FilePermissions] = js.native
    
    /**
      * The size of the entry in bytes
      */
    var size: Double = js.native
    
    /**
      * True if the sticky bit is set for this entry **(*NIX only)**.
      */
    var sticky: js.UndefOr[Boolean] = js.native
    
    /**
      * For symlink entries, this is the symlink's target **(*NIX only)**.
      */
    var target: js.UndefOr[String] = js.native
    
    /**
      * A single character denoting the entry type: 'd' for directory, '-' for file (or 'l' for symlink on **\*NIX only**).
      */
    var `type`: String = js.native
  }
  object ListingElement {
    
    @scala.inline
    def apply(date: Date, name: String, size: Double, `type`: String): ListingElement = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListingElement]
    }
    
    @scala.inline
    implicit class ListingElementMutableBuilder[Self <: ListingElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      @scala.inline
      def setRights(value: FilePermissions): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightsUndefined: Self = StObject.set(x, "rights", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * How long (in milliseconds) to wait for the control connection to be established. Default: 10000
      */
    var connTimeout: js.UndefOr[Double] = js.native
    
    /**
      * Debug function to invoke to enable debug logging.
      */
    var debug: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
    
    /**
      * The hostname or IP address of the FTP server. Default: 'localhost'
      */
    var host: js.UndefOr[String] = js.native
    
    /**
      * How often (in milliseconds) to send a 'dummy' (NOOP) command to keep the connection alive. Default: 10000
      */
    var keepalive: js.UndefOr[Double] = js.native
    
    /**
      * Password for authentication. Default: 'anonymous@'
      */
    var password: js.UndefOr[String] = js.native
    
    /**
      * How long (in milliseconds) to wait for a PASV data connection to be established. Default: 10000
      */
    var pasvTimeout: js.UndefOr[Double] = js.native
    
    /**
      * The port of the FTP server. Default: 21
      */
    var port: js.UndefOr[Double] = js.native
    
    /**
      * Set to true for both control and data connection encryption, 'control' for control connection encryption only, or 'implicit' for
      * implicitly encrypted control connection (this mode is deprecated in modern times, but usually uses port 990) Default: false
      */
    var secure: js.UndefOr[String | Boolean] = js.native
    
    /**
      * Additional options to be passed to tls.connect(). Default: (none)
      */
    var secureOptions: js.UndefOr[ConnectionOptions] = js.native
    
    /**
      * Username for authentication. Default: 'anonymous'
      */
    var user: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnTimeout(value: Double): Self = StObject.set(x, "connTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnTimeoutUndefined: Self = StObject.set(x, "connTimeout", js.undefined)
      
      @scala.inline
      def setDebug(value: /* message */ String => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setKeepalive(value: Double): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPasvTimeout(value: Double): Self = StObject.set(x, "pasvTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasvTimeoutUndefined: Self = StObject.set(x, "pasvTimeout", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSecure(value: String | Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureOptions(value: ConnectionOptions): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
