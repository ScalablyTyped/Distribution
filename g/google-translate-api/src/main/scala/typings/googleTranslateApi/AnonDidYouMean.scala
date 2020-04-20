package typings.googleTranslateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDidYouMean extends js.Object {
  var didYouMean: Boolean
  var iso: String
}

object AnonDidYouMean {
  @scala.inline
  def apply(didYouMean: Boolean, iso: String): AnonDidYouMean = {
    val __obj = js.Dynamic.literal(didYouMean = didYouMean.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDidYouMean]
  }
}

