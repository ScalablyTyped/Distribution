package typings.gatsby.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atReachRouter.atReachRouterMod.LinkGetProps
import typings.gatsbyDashLink.gatsbyDashLinkMod.GatsbyLinkProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.gatsby.gatsbyMod.Link[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typings.gatsby.gatsbyMod.Link[js.Any]].asInstanceOf[String | js.Object]
  def apply[TState](
    to_GatsbyLinkProps: String,
    activeClassName: String = null,
    activeStyle: js.Object = null,
    getProps: /* props */ LinkGetProps => js.Object = null,
    innerRef: js.Function = null,
    onClick: /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit = null,
    partiallyActive: js.UndefOr[Boolean] = js.undefined,
    replace: js.UndefOr[Boolean] = js.undefined,
    state: TState = null,
    to: String = null
  ): BuildingComponent[tag.type, typings.gatsby.gatsbyMod.Link[js.Any]] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("to")(to_GatsbyLinkProps)
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle)
    if (getProps != null) __obj.updateDynamic("getProps")(js.Any.fromFunction1(getProps))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(partiallyActive)) __obj.updateDynamic("partiallyActive")(partiallyActive)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typings.gatsby.gatsbyMod.Link[js.Any]]]
  }
  type Props = GatsbyLinkProps[js.Any]
}

