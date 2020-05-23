package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checkoutstep
  extends /* key */ StringDictionary[js.Any] {
  var checkout_option: js.UndefOr[String] = js.undefined
  var checkout_step: js.UndefOr[Double] = js.undefined
}

object Checkoutstep {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    checkout_option: String = null,
    checkout_step: js.UndefOr[Double] = js.undefined
  ): Checkoutstep = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (checkout_option != null) __obj.updateDynamic("checkout_option")(checkout_option.asInstanceOf[js.Any])
    if (!js.isUndefined(checkout_step)) __obj.updateDynamic("checkout_step")(checkout_step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkoutstep]
  }
}

