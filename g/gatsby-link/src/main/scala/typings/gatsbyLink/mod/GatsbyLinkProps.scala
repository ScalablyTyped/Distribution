package typings.gatsbyLink.mod

import typings.reachRouter.mod.LinkProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatsbyLinkProps[TState] extends LinkProps[TState] {
  /** A class to apply when this Link is active */
  var activeClassName: js.UndefOr[String] = js.native
  /** Inline styles for when this Link is active */
  var activeStyle: js.UndefOr[js.Object] = js.native
  @JSName("onClick")
  var onClick_GatsbyLinkProps: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], Unit]] = js.native
  /** Class the link as highlighted if there is a partial match via a the `to` being prefixed to the current url */
  var partiallyActive: js.UndefOr[Boolean] = js.native
}

object GatsbyLinkProps {
  @scala.inline
  def apply[TState](to: String): GatsbyLinkProps[TState] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyLinkProps[TState]]
  }
  @scala.inline
  implicit class GatsbyLinkPropsOps[Self <: GatsbyLinkProps[_], TState] (val x: Self with GatsbyLinkProps[TState]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveClassName(value: String): Self = this.set("activeClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveClassName: Self = this.set("activeClassName", js.undefined)
    @scala.inline
    def setActiveStyle(value: js.Object): Self = this.set("activeStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveStyle: Self = this.set("activeStyle", js.undefined)
    @scala.inline
    def setOnClick(value: /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setPartiallyActive(value: Boolean): Self = this.set("partiallyActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartiallyActive: Self = this.set("partiallyActive", js.undefined)
  }
  
}

