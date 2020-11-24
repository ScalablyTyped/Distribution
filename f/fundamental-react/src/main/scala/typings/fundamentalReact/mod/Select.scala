package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialSelectProps
import typings.fundamentalReact.anon.WeakValidationMapSelectPr
import typings.fundamentalReact.selectMod.SelectProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react", "Select")
@js.native
object Select extends js.Object {
  
  def apply(props: PropsWithChildren[SelectProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[SelectProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialSelectProps] = js.native
  
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Select | String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapSelectPr] = js.native
}
