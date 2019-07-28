package typings.fluentDashFfmpeg.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioVideoFilter extends js.Object {
  var filter: String
  var options: String | js.Array[String] | js.Object
}

object AudioVideoFilter {
  @scala.inline
  def apply(filter: String, options: String | js.Array[String] | js.Object): AudioVideoFilter = {
    val __obj = js.Dynamic.literal(filter = filter, options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AudioVideoFilter]
  }
}

