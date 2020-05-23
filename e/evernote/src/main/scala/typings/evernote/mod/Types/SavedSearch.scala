package typings.evernote.mod.Types

import typings.evernote.anon.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.SavedSearch")
@js.native
class SavedSearch () extends js.Object {
  def this(args: Format) = this()
  var format: js.UndefOr[QueryFormat] = js.native
  var guid: js.UndefOr[Guid] = js.native
  var name: js.UndefOr[String] = js.native
  var query: js.UndefOr[String] = js.native
  var scope: js.UndefOr[SavedSearchScope] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
}

