package typings.firebase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckoutoptionCheckoutstep
  extends /* key */ StringDictionary[js.Any] {
  var checkout_option: js.UndefOr[String] = js.undefined
  var checkout_step: js.UndefOr[Double] = js.undefined
}

object Anon_CheckoutoptionCheckoutstep {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    checkout_option: String = null,
    checkout_step: Int | Double = null
  ): Anon_CheckoutoptionCheckoutstep = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (checkout_option != null) __obj.updateDynamic("checkout_option")(checkout_option)
    if (checkout_step != null) __obj.updateDynamic("checkout_step")(checkout_step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CheckoutoptionCheckoutstep]
  }
}

