package typings.atEdtrDashIoMathquill

import typings.atEdtrDashIoMathquill.atEdtrDashIoMathquillMod.MQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var edit: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.undefined
  var enter: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.undefined
  var moveOutOf: js.UndefOr[js.Function2[/* direction */ Double, /* mathField */ MQ, _]] = js.undefined
  var upOutOf: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.undefined
}

object Anon_Direction {
  @scala.inline
  def apply(
    edit: /* mathField */ MQ => _ = null,
    enter: /* mathField */ MQ => _ = null,
    moveOutOf: (/* direction */ Double, /* mathField */ MQ) => _ = null,
    upOutOf: /* mathField */ MQ => _ = null
  ): Anon_Direction = {
    val __obj = js.Dynamic.literal()
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction1(edit))
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction1(enter))
    if (moveOutOf != null) __obj.updateDynamic("moveOutOf")(js.Any.fromFunction2(moveOutOf))
    if (upOutOf != null) __obj.updateDynamic("upOutOf")(js.Any.fromFunction1(upOutOf))
    __obj.asInstanceOf[Anon_Direction]
  }
}

