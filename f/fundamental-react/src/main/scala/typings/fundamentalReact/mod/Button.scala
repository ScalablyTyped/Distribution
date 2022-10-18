package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialButtonProps
import typings.fundamentalReact.anon.WeakValidationMapButtonPr
import typings.fundamentalReact.libButtonButtonMod.ButtonProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/Button/Button.ButtonProps> & {  displayName :'Button'} */
object Button {
  
  inline def apply(props: ButtonProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: ButtonProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "Button")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Button.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Button.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialButtonProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialButtonProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Button.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Button | String] = js.native
  inline def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.Button | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Button.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapButtonPr] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapButtonPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
