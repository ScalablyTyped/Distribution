package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.FunctionComponentBreadcru
import typings.fundamentalReact.anon.PartialBreadcrumbProps
import typings.fundamentalReact.anon.WeakValidationMapBreadcru
import typings.fundamentalReact.breadcrumbMod.BreadcrumbProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fundamental-react", "Breadcrumb")
@js.native
object Breadcrumb extends js.Object {
  
  def apply(props: PropsWithChildren[BreadcrumbProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[BreadcrumbProps], context: js.Any): ReactElement | Null = js.native
  
  var Item: FunctionComponentBreadcru = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialBreadcrumbProps] = js.native
  
  var displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Breadcrumb | String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapBreadcru] = js.native
}
