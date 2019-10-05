package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_Identifier
import typings.thrift.thriftMod.Thrift.TException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This exception is thrown by EDAM procedures when a caller asks to perform
  * an operation on an object that does not exist.    This may be thrown based on an invalid
  * primary identifier (e.g. a bad GUID), or when the caller refers to an object
  * by another unique identifier (e.g. a User's email address).
  *
  * identifier:    A description of the object that was not found on the server.
  *     For example, "Note.notebookGuid" when a caller attempts to create a note in a
  *     notebook that does not exist in the user's account.
  *
  * key:    The value passed from the client in the identifier, which was not
  *     found. For example, the GUID that was not found.
  */
@JSImport("evernote", "Evernote.EDAMNotFoundException")
@js.native
class EDAMNotFoundException () extends TException {
  def this(args: Anon_Identifier) = this()
  var identifier: String = js.native
  var key: String = js.native
}

