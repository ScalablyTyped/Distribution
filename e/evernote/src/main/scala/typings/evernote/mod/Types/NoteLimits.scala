package typings.evernote.mod.Types

import typings.evernote.anon.NoteSizeMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.NoteLimits")
@js.native
class NoteLimits () extends js.Object {
  def this(args: NoteSizeMax) = this()
  var noteResourceCountMax: js.UndefOr[Double] = js.native
  var noteSizeMax: js.UndefOr[Double] = js.native
  var resourceSizeMax: js.UndefOr[Double] = js.native
  var uploadLimit: js.UndefOr[Double] = js.native
  var uploaded: js.UndefOr[Double] = js.native
}

