package typings.evernote.evernoteMod.Evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Evernote.Client")
@js.native
class Client protected () extends js.Object {
  def this(config: ClientConfig) = this()
  def getNoteStore(): NoteStoreClient = js.native
  def getUserStore(): UserStoreClient = js.native
}

/* static members */
@JSImport("evernote", "Evernote.Client")
@js.native
object Client extends js.Object {
  def `new`(config: ClientConfig): Client = js.native
}

