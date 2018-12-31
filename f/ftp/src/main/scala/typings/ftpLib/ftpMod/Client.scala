package typings
package ftpLib.ftpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Client
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * Aborts the current data transfer (e.g. from get(), put(), or list())
    */
  def abort(callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def append(
    input: java.lang.String,
    destPath: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def append(
    input: java.lang.String,
    destPath: java.lang.String,
    useCompression: scala.Boolean,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def append(
    input: nodeLib.Buffer,
    destPath: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def append(
    input: nodeLib.Buffer,
    destPath: java.lang.String,
    useCompression: scala.Boolean,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def append(
    input: nodeLib.NodeJSNs.ReadableStream,
    destPath: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Same as put(), except if destPath already exists, it will be appended to instead of overwritten.
    * @param input can be a ReadableStream, a Buffer, or a path to a local file.
    * @param destPath
    * @param useCompression defaults to false.
    */
  def append(
    input: nodeLib.NodeJSNs.ReadableStream,
    destPath: java.lang.String,
    useCompression: scala.Boolean,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the transfer data type to ASCII.
    */
  def ascii(callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
    * Sets the transfer data type to binary (default at time of connection).
    */
  def binary(callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Changes the working directory to the parent of the current directory
    */
  def cdup(callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
    * Connects to an FTP server.
    */
  def connect(): scala.Unit = js.native
  def connect(config: ftpLib.ftpMod.ClientNs.Options): scala.Unit = js.native
  /**
    * Changes the current working directory to path. callback has 2 parameters: < Error >err, < string >currentDir.
    * Note: currentDir is only given if the server replies with the path in the response text.
    */
  def cwd(
    path: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* currentDir */ js.UndefOr[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Delete a file on the server
    */
  def delete(path: java.lang.String, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
    * Closes the connection to the server immediately.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Closes the connection to the server after any/all enqueued commands have been executed.
    */
  def end(): scala.Unit = js.native
  /**
    * Retrieves a file at path from the server. useCompression defaults to false
    */
  def get(
    path: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* stream */ nodeLib.NodeJSNs.ReadableStream, scala.Unit]
  ): scala.Unit = js.native
  def get(
    path: java.lang.String,
    useCompression: scala.Boolean,
    callback: js.Function2[/* error */ nodeLib.Error, /* stream */ nodeLib.NodeJSNs.ReadableStream, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Extended commands (RFC 3659)
    * Retrieves the last modified date and time for path
    */
  def lastMod(
    path: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* lastMod */ stdLib.Date, scala.Unit]
  ): scala.Unit = js.native
  def list(
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* listing */ js.Array[ftpLib.ftpMod.ClientNs.ListingElement], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def list(
    path: java.lang.String,
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* listing */ js.Array[ftpLib.ftpMod.ClientNs.ListingElement], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Retrieves the directory listing of path.
    * @param path defaults to the current working directory.
    * @param useCompression defaults to false.
    */
  def list(
    path: java.lang.String,
    useCompression: scala.Boolean,
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* listing */ js.Array[ftpLib.ftpMod.ClientNs.ListingElement], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def list(
    useCompression: scala.Boolean,
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* listing */ js.Array[ftpLib.ftpMod.ClientNs.ListingElement], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def listSafe(
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* listing */ js.Array[ftpLib.ftpMod.ClientNs.ListingElement], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def listSafe(
    path: java.lang.String,
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* listing */ js.Array[ftpLib.ftpMod.ClientNs.ListingElement], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Similar to list(), except the directory is temporarily changed to path to retrieve the directory listing.
    * This is useful for servers that do not handle characters like spaces and quotes in directory names well for the LIST command.
    * This function is "optional" because it relies on pwd() being available.
    */
  def listSafe(
    path: java.lang.String,
    useCompression: scala.Boolean,
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* listing */ js.Array[ftpLib.ftpMod.ClientNs.ListingElement], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def listSafe(
    useCompression: scala.Boolean,
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* listing */ js.Array[ftpLib.ftpMod.ClientNs.ListingElement], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Logout the user from the server.
    */
  def logout(callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def mkdir(path: java.lang.String, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Creates a new directory, path, on the server. recursive is for enabling a 'mkdir -p' algorithm and defaults to false
    */
  def mkdir(
    path: java.lang.String,
    recursive: scala.Boolean,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def put(
    input: java.lang.String,
    destPath: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def put(
    input: java.lang.String,
    destPath: java.lang.String,
    useCompression: scala.Boolean,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def put(
    input: nodeLib.Buffer,
    destPath: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def put(
    input: nodeLib.Buffer,
    destPath: java.lang.String,
    useCompression: scala.Boolean,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def put(
    input: nodeLib.NodeJSNs.ReadableStream,
    destPath: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sends data to the server to be stored as destPath.
    * @param input can be a ReadableStream, a Buffer, or a path to a local file.
    * @param destPath
    * @param useCompression defaults to false.
    */
  def put(
    input: nodeLib.NodeJSNs.ReadableStream,
    destPath: java.lang.String,
    useCompression: scala.Boolean,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Retrieves the current working directory
    */
  def pwd(callback: js.Function2[/* error */ nodeLib.Error, /* path */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Renames oldPath to newPath on the server
    */
  def rename(
    oldPath: java.lang.String,
    newPath: java.lang.String,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Extended commands (RFC 3659)
    * Sets the file byte offset for the next file transfer action (get/put) to byteOffset
    */
  def restart(byteOffset: scala.Double, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def rmdir(path: java.lang.String, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Removes a directory, path, on the server. If recursive, this call will delete the contents of the directory if it is not empty
    */
  def rmdir(
    path: java.lang.String,
    recursive: scala.Boolean,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sends command (e.g. 'CHMOD 755 foo', 'QUOTA') using SITE. callback has 3 parameters:
    * < Error >err, < _string >responseText, < integer >responseCode.
    */
  def site(
    command: java.lang.String,
    callback: js.Function3[
      /* error */ nodeLib.Error, 
      /* responseText */ java.lang.String, 
      /* responseCode */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Extended commands (RFC 3659)
    * Retrieves the size of path
    */
  def size(
    path: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* size */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Retrieves human-readable information about the server's status.
    */
  def status(callback: js.Function2[/* error */ nodeLib.Error, /* status */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Optional "standard" commands (RFC 959)
    * Retrieves the server's operating system.
    */
  def system(callback: js.Function2[/* error */ nodeLib.Error, /* OS */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

