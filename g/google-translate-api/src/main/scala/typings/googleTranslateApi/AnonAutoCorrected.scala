package typings.googleTranslateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoCorrected extends js.Object {
  var autoCorrected: Boolean
  var didYouMean: Boolean
  var value: String
}

object AnonAutoCorrected {
  @scala.inline
  def apply(autoCorrected: Boolean, didYouMean: Boolean, value: String): AnonAutoCorrected = {
    val __obj = js.Dynamic.literal(autoCorrected = autoCorrected.asInstanceOf[js.Any], didYouMean = didYouMean.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAutoCorrected]
  }
}

