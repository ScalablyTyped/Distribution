package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialColumnProps
import typings.fundamentalReact.anon.WeakValidationMapColumnPr
import typings.fundamentalReact.libColumnColumnMod.ColumnProps
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Column/Column.ColumnProps> & {  displayName :'Column'} */
object Column {
  
  inline def apply(props: ColumnProps): ReactNode = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def apply(props: ColumnProps, context: Any): ReactNode = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  @JSImport("fundamental-react", "Column")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Column.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Column.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialColumnProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialColumnProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Column.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Column | String] = js.native
  inline def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Column | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Column.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapColumnPr] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapColumnPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
