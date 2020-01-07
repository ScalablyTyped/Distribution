package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MainPageSuffix extends js.Object {
  var mainPageSuffix: js.UndefOr[String] = js.native
  var notFoundPage: js.UndefOr[String] = js.native
}

object Anon_MainPageSuffix {
  @scala.inline
  def apply(mainPageSuffix: String = null, notFoundPage: String = null): Anon_MainPageSuffix = {
    val __obj = js.Dynamic.literal()
    if (mainPageSuffix != null) __obj.updateDynamic("mainPageSuffix")(mainPageSuffix.asInstanceOf[js.Any])
    if (notFoundPage != null) __obj.updateDynamic("notFoundPage")(notFoundPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MainPageSuffix]
  }
}

