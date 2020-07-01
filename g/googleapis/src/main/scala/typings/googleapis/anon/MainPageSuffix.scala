package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MainPageSuffix extends js.Object {
  var mainPageSuffix: js.UndefOr[String] = js.native
  var notFoundPage: js.UndefOr[String] = js.native
}

object MainPageSuffix {
  @scala.inline
  def apply(mainPageSuffix: String = null, notFoundPage: String = null): MainPageSuffix = {
    val __obj = js.Dynamic.literal()
    if (mainPageSuffix != null) __obj.updateDynamic("mainPageSuffix")(mainPageSuffix.asInstanceOf[js.Any])
    if (notFoundPage != null) __obj.updateDynamic("notFoundPage")(notFoundPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainPageSuffix]
  }
}

