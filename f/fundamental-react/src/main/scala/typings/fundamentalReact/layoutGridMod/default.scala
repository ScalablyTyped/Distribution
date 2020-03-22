package typings.fundamentalReact.layoutGridMod

import typings.fundamentalReact.PartialLayoutGridProps
import typings.fundamentalReact.WeakValidationMapLayoutGr
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/LayoutGrid/LayoutGrid", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialLayoutGridProps] = js.native
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.LayoutGridProps | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapLayoutGr] = js.native
  def apply(props: PropsWithChildren[LayoutGridProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[LayoutGridProps], context: js.Any): ReactElement | Null = js.native
}

