package typings.dropboxjs.DropboxNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Http.RangeInfo")
@js.native
class RangeInfo () extends js.Object {
  var end: Double = js.native
  var size: Double = js.native
  var start: Double = js.native
}

/* static members */
@JSGlobal("Dropbox.Http.RangeInfo")
@js.native
object RangeInfo extends js.Object {
  def parse(headerValue: String): RangeInfo = js.native
}

