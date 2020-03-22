package typings.evernote.mod.NoteStore

import typings.evernote.AnonCacheKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.RelatedQuery")
@js.native
class RelatedQuery () extends js.Object {
  def this(args: AnonCacheKey) = this()
  var cacheKey: js.UndefOr[String] = js.native
  var context: js.UndefOr[String] = js.native
  var filter: js.UndefOr[NoteFilter] = js.native
  var noteGuid: js.UndefOr[String] = js.native
  var plainText: js.UndefOr[String] = js.native
  var referenceUri: js.UndefOr[String] = js.native
}

