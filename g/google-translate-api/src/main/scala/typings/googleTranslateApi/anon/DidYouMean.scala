package typings.googleTranslateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidYouMean extends js.Object {
  var didYouMean: Boolean
  var iso: String
}

object DidYouMean {
  @scala.inline
  def apply(didYouMean: Boolean, iso: String): DidYouMean = {
    val __obj = js.Dynamic.literal(didYouMean = didYouMean.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidYouMean]
  }
}

