package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialLayoutGridProps
import typings.fundamentalReact.anon.WeakValidationMapLayoutGr
import typings.fundamentalReact.libLayoutGridLayoutGridMod.LayoutGridProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/LayoutGrid/LayoutGrid.LayoutGridProps> & {  displayName :'LayoutGridProps'} */
object LayoutGrid {
  
  inline def apply(props: LayoutGridProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: LayoutGridProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "LayoutGrid")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "LayoutGrid.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "LayoutGrid.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialLayoutGridProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialLayoutGridProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "LayoutGrid.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.LayoutGridProps | String] = js.native
  inline def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.LayoutGridProps | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "LayoutGrid.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapLayoutGr] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapLayoutGr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
