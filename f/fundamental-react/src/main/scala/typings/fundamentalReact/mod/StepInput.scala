package typings.fundamentalReact.mod

import typings.fundamentalReact.anon.PartialStepInputProps
import typings.fundamentalReact.anon.WeakValidationMapStepInpu
import typings.fundamentalReact.stepInputMod.StepInputProps
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<fundamental-react.fundamental-react/lib/StepInput/StepInput.StepInputProps> & {  displayName :'StepInput'} */
object StepInput {
  
  inline def apply(props: StepInputProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def apply(props: StepInputProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @JSImport("fundamental-react", "StepInput")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "StepInput.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "StepInput.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialStepInputProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialStepInputProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "StepInput.displayName")
  @js.native
  def displayName: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.StepInput | String] = js.native
  inline def displayName_=(x: js.UndefOr[typings.fundamentalReact.fundamentalReactStrings.StepInput | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "StepInput.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapStepInpu] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapStepInpu]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
