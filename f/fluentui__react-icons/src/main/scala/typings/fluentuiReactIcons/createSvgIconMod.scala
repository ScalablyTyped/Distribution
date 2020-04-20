package typings.fluentuiReactIcons

import typings.fluentuiReactIcons.svgIconTypesMod.ISvgIconProps
import typings.fluentuiReactIcons.typesMod.SvgIconCreateFnParams
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fluentui/react-icons/lib/utils/createSvgIcon", JSImport.Namespace)
@js.native
object createSvgIconMod extends js.Object {
  def default[TProps](hasSvgDisplayName: SvgIconCreateFnParams[TProps]): FC[HTMLAttributes[HTMLSpanElement] with TProps with ISvgIconProps] = js.native
}

