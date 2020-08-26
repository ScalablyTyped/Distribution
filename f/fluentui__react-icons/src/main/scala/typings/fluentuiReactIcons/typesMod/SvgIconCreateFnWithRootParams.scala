package typings.fluentuiReactIcons.typesMod

import typings.fluentuiReactIcons.svgIconTypesMod.ISvgIconProps
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvgIconCreateFnWithRootParams[TProps] extends js.Object {
  var children: SvgIconChildrenFnWithRoot[TProps with ISvgIconProps] = js.native
  var displayName: String = js.native
}

object SvgIconCreateFnWithRootParams {
  @scala.inline
  def apply[TProps](
    children: /* svgIcon */ SvgIconFuncWithRootArg[TProps with ISvgIconProps] => ReactElement,
    displayName: String
  ): SvgIconCreateFnWithRootParams[TProps] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgIconCreateFnWithRootParams[TProps]]
  }
  @scala.inline
  implicit class SvgIconCreateFnWithRootParamsOps[Self <: SvgIconCreateFnWithRootParams[_], TProps] (val x: Self with SvgIconCreateFnWithRootParams[TProps]) extends AnyVal {
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
    def setChildren(value: /* svgIcon */ SvgIconFuncWithRootArg[TProps with ISvgIconProps] => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
  }
  
}

