package typings.gitlab

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  userId ? :number} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait userIdnumberBaseRequestOp
  extends /* key */ StringDictionary[js.Any] {
  var sudo: js.UndefOr[String | Double] = js.undefined
  var userId: js.UndefOr[Double] = js.undefined
}

object userIdnumberBaseRequestOp {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    sudo: String | Double = null,
    userId: Int | Double = null
  ): userIdnumberBaseRequestOp = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[userIdnumberBaseRequestOp]
  }
}

