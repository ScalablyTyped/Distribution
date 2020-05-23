package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description
  extends /* key */ StringDictionary[js.Any] {
  var description: js.UndefOr[String] = js.undefined
  var fatal: js.UndefOr[Boolean] = js.undefined
}

object Description {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    description: String = null,
    fatal: js.UndefOr[Boolean] = js.undefined
  ): Description = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(fatal)) __obj.updateDynamic("fatal")(fatal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

