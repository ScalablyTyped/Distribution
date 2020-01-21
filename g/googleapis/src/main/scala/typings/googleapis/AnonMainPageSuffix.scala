package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMainPageSuffix extends js.Object {
  var mainPageSuffix: js.UndefOr[String] = js.native
  var notFoundPage: js.UndefOr[String] = js.native
}

object AnonMainPageSuffix {
  @scala.inline
  def apply(mainPageSuffix: String = null, notFoundPage: String = null): AnonMainPageSuffix = {
    val __obj = js.Dynamic.literal()
    if (mainPageSuffix != null) __obj.updateDynamic("mainPageSuffix")(mainPageSuffix.asInstanceOf[js.Any])
    if (notFoundPage != null) __obj.updateDynamic("notFoundPage")(notFoundPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMainPageSuffix]
  }
}

