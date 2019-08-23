package typings.expoDashLocation.expoDashLocationMod

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
    val __obj = js.Dynamic.literal(accuracy = accuracy, magHeading = magHeading, trueHeading = trueHeading)
  
    __obj.asInstanceOf[HeadingData]
  }
}

