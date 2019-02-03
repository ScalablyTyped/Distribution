package typings
package dropboxjsLib.DropboxNs.HttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Http.RangeInfo")
@js.native
class RangeInfo () extends js.Object {
  var end: scala.Double = js.native
  var size: scala.Double = js.native
  var start: scala.Double = js.native
}

/* static members */
@JSGlobal("Dropbox.Http.RangeInfo")
@js.native
object RangeInfo extends js.Object {
  def parse(headerValue: java.lang.String): dropboxjsLib.DropboxNs.HttpNs.RangeInfo = js.native
}

