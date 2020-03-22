package typings.fundamentalReact.mod

import typings.fundamentalReact.PartialLayoutGridProps
import typings.fundamentalReact.WeakValidationMapLayoutGr
import typings.fundamentalReact.fundamentalReactStrings.LayoutGridProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "LayoutGrid")
@js.native
object LayoutGrid extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialLayoutGridProps] = js.native
  var displayName: js.UndefOr[LayoutGridProps | String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapLayoutGr] = js.native
  def apply(props: PropsWithChildren[typings.fundamentalReact.layoutGridMod.LayoutGridProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[typings.fundamentalReact.layoutGridMod.LayoutGridProps], context: js.Any): ReactElement | Null = js.native
}

