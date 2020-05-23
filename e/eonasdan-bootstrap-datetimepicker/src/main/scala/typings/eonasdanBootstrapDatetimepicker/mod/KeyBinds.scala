package typings.eonasdanBootstrapDatetimepicker.mod

import typings.eonasdanBootstrapDatetimepicker.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyBinds extends js.Object {
  var `control down`: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
  var `control space`: js.UndefOr[js.Function1[/* widget */ JQuery, _]] = js.undefined
  var `control up`: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
  var delete: js.UndefOr[js.Function0[_]] = js.undefined
  var down: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
  var enter: js.UndefOr[js.Function0[_]] = js.undefined
  var escape: js.UndefOr[js.Function0[_]] = js.undefined
  var left: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
  var pageDown: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
  var pageUp: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
  var right: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
  var t: js.UndefOr[js.Function0[_]] = js.undefined
  var up: js.UndefOr[js.Function1[/* widget */ JQuery | Boolean, _]] = js.undefined
}

object KeyBinds {
  @scala.inline
  def apply(
    `control down`: /* widget */ JQuery | Boolean => _ = null,
    `control space`: /* widget */ JQuery => _ = null,
    `control up`: /* widget */ JQuery | Boolean => _ = null,
    delete: () => _ = null,
    down: /* widget */ JQuery | Boolean => _ = null,
    enter: () => _ = null,
    escape: () => _ = null,
    left: /* widget */ JQuery | Boolean => _ = null,
    pageDown: /* widget */ JQuery | Boolean => _ = null,
    pageUp: /* widget */ JQuery | Boolean => _ = null,
    right: /* widget */ JQuery | Boolean => _ = null,
    t: () => _ = null,
    up: /* widget */ JQuery | Boolean => _ = null
  ): KeyBinds = {
    val __obj = js.Dynamic.literal()
    if (`control down` != null) __obj.updateDynamic("control down")(js.Any.fromFunction1(`control down`))
    if (`control space` != null) __obj.updateDynamic("control space")(js.Any.fromFunction1(`control space`))
    if (`control up` != null) __obj.updateDynamic("control up")(js.Any.fromFunction1(`control up`))
    if (delete != null) __obj.updateDynamic("delete")(js.Any.fromFunction0(delete))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction1(down))
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction0(enter))
    if (escape != null) __obj.updateDynamic("escape")(js.Any.fromFunction0(escape))
    if (left != null) __obj.updateDynamic("left")(js.Any.fromFunction1(left))
    if (pageDown != null) __obj.updateDynamic("pageDown")(js.Any.fromFunction1(pageDown))
    if (pageUp != null) __obj.updateDynamic("pageUp")(js.Any.fromFunction1(pageUp))
    if (right != null) __obj.updateDynamic("right")(js.Any.fromFunction1(right))
    if (t != null) __obj.updateDynamic("t")(js.Any.fromFunction0(t))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction1(up))
    __obj.asInstanceOf[KeyBinds]
  }
}

