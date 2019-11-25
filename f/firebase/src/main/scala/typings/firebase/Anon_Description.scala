package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description
  extends /* key */ StringDictionary[js.Any] {
  var description: js.UndefOr[String] = js.undefined
  var fatal: js.UndefOr[Boolean] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    description: String = null,
    fatal: js.UndefOr[Boolean] = js.undefined
  ): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(fatal)) __obj.updateDynamic("fatal")(fatal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Description]
  }
}

