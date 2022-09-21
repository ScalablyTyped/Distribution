package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialButtonGroupProps
import typings.fundamentalReact.anon.WeakValidationMapButtonGr
import typings.fundamentalReact.buttonGroupMod.ButtonGroupProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Button/ButtonGroup.ButtonGroupProps> & {  displayName :'ButtonGroup'} */
object ButtonGroup {
  
  inline def apply(props: ButtonGroupProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: ButtonGroupProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "ButtonGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "ButtonGroup.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "ButtonGroup.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialButtonGroupProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialButtonGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "ButtonGroup.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.ButtonGroup | String] = js.native
  inline def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.ButtonGroup | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "ButtonGroup.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapButtonGr] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapButtonGr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
