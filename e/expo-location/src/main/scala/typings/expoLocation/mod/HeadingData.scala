package typings.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadingData extends js.Object {
  var accuracy: Double
  var magHeading: Double
  var trueHeading: Double
}

object HeadingData {
  @scala.inline
  def apply(accuracy: Double, magHeading: Double, trueHeading: Double): HeadingData = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], magHeading = magHeading.asInstanceOf[js.Any], trueHeading = trueHeading.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeadingData]
  }
}

