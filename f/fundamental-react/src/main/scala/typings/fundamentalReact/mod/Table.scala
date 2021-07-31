package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialTableProps
import typings.fundamentalReact.anon.WeakValidationMapTablePro
import typings.fundamentalReact.tableMod.TableProps
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Table/Table.TableProps> & {  displayName :'Table'} */
object Table {
  
  @scala.inline
  def apply(props: PropsWithChildren[TableProps]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  @scala.inline
  def apply(props: PropsWithChildren[TableProps], context: js.Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "Table")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Table.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Table.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialTableProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialTableProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Table.displayName")
  @js.native
  def displayName: js.UndefOr[String | typings.fundamentalReact.fundamentalReactStrings.Table] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[String | typings.fundamentalReact.fundamentalReactStrings.Table]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Table.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapTablePro] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapTablePro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
