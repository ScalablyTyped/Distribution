package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  mergerequestIId ? :number} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait mergerequestIIdnumberBase
  extends /* key */ StringDictionary[js.Any] {
  var mergerequestIId: js.UndefOr[Double] = js.undefined
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object mergerequestIIdnumberBase {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    mergerequestIId: js.UndefOr[Double] = js.undefined,
    sudo: String | Double = null
  ): mergerequestIIdnumberBase = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(mergerequestIId)) __obj.updateDynamic("mergerequestIId")(mergerequestIId.get.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[mergerequestIIdnumberBase]
  }
}

