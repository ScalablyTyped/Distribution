package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialActionBarProps
import typings.fundamentalReact.anon.WeakValidationMapActionBa
import typings.fundamentalReact.libActionBarActionBarMod.ActionBarProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/ActionBar/ActionBar.ActionBarProps> & {  displayName :'ActionBar'} */
object ActionBar {
  
  inline def apply(props: ActionBarProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: ActionBarProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "ActionBar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "ActionBar.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "ActionBar.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialActionBarProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialActionBarProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "ActionBar.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.ActionBar | String] = js.native
  inline def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.ActionBar | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "ActionBar.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapActionBa] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapActionBa]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
