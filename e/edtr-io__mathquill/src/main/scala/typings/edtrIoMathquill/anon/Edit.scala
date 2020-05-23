package typings.edtrIoMathquill.anon

import typings.edtrIoMathquill.mod.MQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edit extends js.Object {
  var edit: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.undefined
  var enter: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.undefined
  var moveOutOf: js.UndefOr[js.Function2[/* direction */ Double, /* mathField */ MQ, _]] = js.undefined
  var upOutOf: js.UndefOr[js.Function1[/* mathField */ MQ, _]] = js.undefined
}

object Edit {
  @scala.inline
  def apply(
    edit: /* mathField */ MQ => _ = null,
    enter: /* mathField */ MQ => _ = null,
    moveOutOf: (/* direction */ Double, /* mathField */ MQ) => _ = null,
    upOutOf: /* mathField */ MQ => _ = null
  ): Edit = {
    val __obj = js.Dynamic.literal()
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction1(edit))
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction1(enter))
    if (moveOutOf != null) __obj.updateDynamic("moveOutOf")(js.Any.fromFunction2(moveOutOf))
    if (upOutOf != null) __obj.updateDynamic("upOutOf")(js.Any.fromFunction1(upOutOf))
    __obj.asInstanceOf[Edit]
  }
}

