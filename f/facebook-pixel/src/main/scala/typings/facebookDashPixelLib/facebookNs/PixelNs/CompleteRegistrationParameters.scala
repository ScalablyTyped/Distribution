package typings
package facebookDashPixelLib.facebookNs.PixelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteRegistrationParameters extends js.Object {
  var content_name: js.UndefOr[java.lang.String] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object CompleteRegistrationParameters {
  @scala.inline
  def apply(
    content_name: java.lang.String = null,
    currency: java.lang.String = null,
    status: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): CompleteRegistrationParameters = {
    val __obj = js.Dynamic.literal()
    if (content_name != null) __obj.updateDynamic("content_name")(content_name)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (status != null) __obj.updateDynamic("status")(status)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteRegistrationParameters]
  }
}

