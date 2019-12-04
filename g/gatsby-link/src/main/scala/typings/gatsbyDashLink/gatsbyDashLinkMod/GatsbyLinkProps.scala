package typings.gatsbyDashLink.gatsbyDashLinkMod

import typings.atReachRouter.atReachRouterMod.LinkGetProps
import typings.atReachRouter.atReachRouterMod.LinkProps
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyLinkProps[TState] extends LinkProps[TState] {
  /** A class to apply when this Link is active */
  var activeClassName: js.UndefOr[String] = js.undefined
  /** Inline styles for when this Link is active */
  var activeStyle: js.UndefOr[js.Object] = js.undefined
  var innerRef: js.UndefOr[js.Function] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], Unit]] = js.undefined
  /** Class the link as highlighted if there is a partial match via a the `to` being prefixed to the current url */
  var partiallyActive: js.UndefOr[Boolean] = js.undefined
}

object GatsbyLinkProps {
  @scala.inline
  def apply[TState](
    to: String,
    activeClassName: String = null,
    activeStyle: js.Object = null,
    getProps: /* props */ LinkGetProps => js.Object = null,
    innerRef: js.Function = null,
    onClick: /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    partiallyActive: js.UndefOr[Boolean] = js.undefined,
    replace: js.UndefOr[Boolean] = js.undefined,
    state: TState = null
  ): GatsbyLinkProps[TState] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName.asInstanceOf[js.Any])
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (getProps != null) __obj.updateDynamic("getProps")(js.Any.fromFunction1(getProps))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(partiallyActive)) __obj.updateDynamic("partiallyActive")(partiallyActive.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyLinkProps[TState]]
  }
}

