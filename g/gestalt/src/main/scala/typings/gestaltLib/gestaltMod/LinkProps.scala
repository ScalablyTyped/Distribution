package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_Event, scala.Unit]] = js.undefined
  var target: js.UndefOr[
    gestaltLib.gestaltLibStrings.`null` | gestaltLib.gestaltLibStrings.self | gestaltLib.gestaltLibStrings.blank
  ] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    href: java.lang.String = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: /* args */ gestaltLib.Anon_Event => scala.Unit = null,
    target: gestaltLib.gestaltLibStrings.`null` | gestaltLib.gestaltLibStrings.self | gestaltLib.gestaltLibStrings.blank = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps]
  }
}

