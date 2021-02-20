package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.FunctionComponentBreadcru
import typings.fundamentalReact.anon.PartialBreadcrumbProps
import typings.fundamentalReact.anon.WeakValidationMapBreadcru
import typings.fundamentalReact.breadcrumbMod.BreadcrumbProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Breadcrumb/Breadcrumb.BreadcrumbProps> & {  displayName :'Breadcrumb',   Item :react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Breadcrumb/Breadcrumb.BreadcrumbItemProps> & {  displayName :'Breadcrumb.Item'}} */
object Breadcrumb {
  
  @JSImport("fundamental-react", "Breadcrumb")
  @js.native
  def apply(props: PropsWithChildren[BreadcrumbProps]): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Breadcrumb")
  @js.native
  def apply(props: PropsWithChildren[BreadcrumbProps], context: js.Any): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Breadcrumb")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Breadcrumb.Item")
  @js.native
  def Item: FunctionComponentBreadcru = js.native
  @scala.inline
  def Item_=(x: FunctionComponentBreadcru): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Breadcrumb.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Breadcrumb.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialBreadcrumbProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialBreadcrumbProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Breadcrumb.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Breadcrumb | String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Breadcrumb | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Breadcrumb.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapBreadcru] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapBreadcru]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
