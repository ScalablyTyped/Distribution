package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioVideoFilter extends js.Object {
  var filter: java.lang.String
  var options: java.lang.String | js.Array[java.lang.String] | js.Object
}

object AudioVideoFilter {
  @scala.inline
  def apply(filter: java.lang.String, options: java.lang.String | js.Array[java.lang.String] | js.Object): AudioVideoFilter = {
    val __obj = js.Dynamic.literal(filter = filter, options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AudioVideoFilter]
  }
}

