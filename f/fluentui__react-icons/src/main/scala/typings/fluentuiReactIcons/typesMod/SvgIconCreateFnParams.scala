package typings.fluentuiReactIcons.typesMod

import typings.fluentuiReactIcons.svgIconTypesMod.ISvgIconProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvgIconCreateFnParams[TProps] extends js.Object {
  var displayName: String = js.native
  var svg: SvgIconChildrenFn[TProps with ISvgIconProps] = js.native
}

object SvgIconCreateFnParams {
  @scala.inline
  def apply[TProps](displayName: String, svg: /* svgIcon */ SvgIconFuncArg[TProps with ISvgIconProps] => ReactNode): SvgIconCreateFnParams[TProps] = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], svg = js.Any.fromFunction1(svg))
    __obj.asInstanceOf[SvgIconCreateFnParams[TProps]]
  }
  @scala.inline
  implicit class SvgIconCreateFnParamsOps[Self <: SvgIconCreateFnParams[_], TProps] (val x: Self with SvgIconCreateFnParams[TProps]) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvg(value: /* svgIcon */ SvgIconFuncArg[TProps with ISvgIconProps] => ReactNode): Self = this.set("svg", js.Any.fromFunction1(value))
  }
  
}

