package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialLayoutGridProps
import typings.fundamentalReact.anon.WeakValidationMapLayoutGr
import typings.fundamentalReact.layoutGridMod.LayoutGridProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react", "LayoutGrid")
@js.native
object LayoutGrid extends js.Object {
  
  def apply(props: PropsWithChildren[LayoutGridProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[LayoutGridProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialLayoutGridProps] = js.native
  
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.LayoutGridProps | String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapLayoutGr] = js.native
}
