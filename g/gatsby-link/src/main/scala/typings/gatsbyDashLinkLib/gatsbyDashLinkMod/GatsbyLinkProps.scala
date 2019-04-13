package typings
package gatsbyDashLinkLib.gatsbyDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyLinkProps[TState]
  extends atReachRouterLib.atReachRouterMod.LinkProps[TState] {
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  var activeStyle: js.UndefOr[js.Object] = js.undefined
  var innerRef: js.UndefOr[js.Function] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLAnchorElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var partiallyActive: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("to")
  var to_GatsbyLinkProps: java.lang.String
}

object GatsbyLinkProps {
  @scala.inline
  def apply[TState](
    to: java.lang.String,
    activeClassName: java.lang.String = null,
    activeStyle: js.Object = null,
    getProps: /* props */ atReachRouterLib.atReachRouterMod.LinkGetProps => js.Object = null,
    innerRef: js.Function = null,
    onClick: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLAnchorElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    partiallyActive: js.UndefOr[scala.Boolean] = js.undefined,
    replace: js.UndefOr[scala.Boolean] = js.undefined,
    state: TState = null
  ): GatsbyLinkProps[TState] = {
    val __obj = js.Dynamic.literal(to = to)
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle)
    if (getProps != null) __obj.updateDynamic("getProps")(js.Any.fromFunction1(getProps))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(partiallyActive)) __obj.updateDynamic("partiallyActive")(partiallyActive)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyLinkProps[TState]]
  }
}

