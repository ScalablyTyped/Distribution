package typings.ftp.ftpMod

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
@JSImport("ftp", JSImport.Namespace)
@js.native
/**
  * Creates and returns a new FTP client instance.
  */
class ^ () extends Client

