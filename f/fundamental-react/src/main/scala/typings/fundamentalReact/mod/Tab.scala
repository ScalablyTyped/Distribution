package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialTabProps
import typings.fundamentalReact.anon.WeakValidationMapTabProps
import typings.fundamentalReact.tabMod.TabProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Tabs/Tab.TabProps> & {  displayName :'Tab'} */
object Tab {
  
  inline def apply(props: TabProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: TabProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "Tab")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Tab.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tab.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialTabProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialTabProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tab.displayName")
  @js.native
  def displayName: js.UndefOr[String | typings.fundamentalReact.fundamentalReactStrings.Tab] = js.native
  inline def displayName_=(x: js.UndefOr[String | typings.fundamentalReact.fundamentalReactStrings.Tab]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tab.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapTabProps] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapTabProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
