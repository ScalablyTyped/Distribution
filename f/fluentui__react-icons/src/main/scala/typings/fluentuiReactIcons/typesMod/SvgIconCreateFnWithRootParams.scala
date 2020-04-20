package typings.fluentuiReactIcons.typesMod

import typings.fluentuiReactIcons.svgIconTypesMod.ISvgIconProps
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgIconCreateFnWithRootParams[TProps] extends js.Object {
  var children: SvgIconChildrenFnWithRoot[TProps with ISvgIconProps]
  var displayName: String
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
}

