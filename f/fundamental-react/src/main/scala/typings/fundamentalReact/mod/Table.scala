package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialTableProps
import typings.fundamentalReact.anon.WeakValidationMapTablePro
import typings.fundamentalReact.libTableTableMod.TableProps
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Table/Table.TableProps> & {  displayName :'Table'} */
object Table {
  
  inline def apply(props: TableProps): ReactNode = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def apply(props: TableProps, context: Any): ReactNode = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  @JSImport("fundamental-react", "Table")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Table.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Table.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialTableProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialTableProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Table.displayName")
  @js.native
  def displayName: js.UndefOr[String | typings.fundamentalReact.fundamentalReactStrings.Table] = js.native
  inline def displayName_=(x: js.UndefOr[String | typings.fundamentalReact.fundamentalReactStrings.Table]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Table.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapTablePro] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapTablePro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
