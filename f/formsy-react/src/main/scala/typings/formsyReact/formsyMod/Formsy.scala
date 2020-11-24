package typings.formsyReact.formsyMod

import typings.formsyReact.anon.Disabled
import typings.formsyReact.anon.IsRequired
import typings.formsyReact.anon.PartialFormsyProps
import typings.formsyReact.interfacesMod.IModel
import typings.formsyReact.interfacesMod.IUpdateInputsWithError
import typings.formsyReact.interfacesMod.IUpdateInputsWithValue
import typings.formsyReact.interfacesMod.InputComponent
import typings.formsyReact.withFormsyMod.PassDownProps
import typings.react.mod.Component
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("formsy-react/dist/Formsy", "Formsy")
@js.native
class Formsy protected ()
  extends Component[FormsyProps, FormsyState, js.Any] {
  def this(props: FormsyProps) = this()
  
  def attachToForm(component: js.Any): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MFormsy(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MFormsy(prevProps: FormsyProps): Unit = js.native
  
  def detachFromForm[V](component: InputComponent[V]): Unit = js.native
  
  var emptyArray: js.Array[_] = js.native
  
  def getCurrentValues(): js.Any = js.native
  
  def getModel(): js.Any = js.native
  
  def getPristineValues(): js.Any = js.native
  
  var inputs: js.Array[InstanceType[js.Any with PassDownProps[_]]] = js.native
  
  def isChanged(): Boolean = js.native
  
  def isFormDisabled(): Boolean = js.native
  
  def isValidValue(component: js.Any, value: js.Any): Boolean = js.native
  
  def mapModel(model: IModel): IModel = js.native
  
  var prevInputNames: js.Array[_] | Null = js.native
  
  def reset(): Unit = js.native
  def reset(model: IModel): Unit = js.native
  
  var resetInternal: js.Any = js.native
  
  var resetModel: js.Any = js.native
  
  def runValidation[V](component: InputComponent[V]): IsRequired = js.native
  def runValidation[V](component: InputComponent[V], value: V): IsRequired = js.native
  
  def setFormPristine(isPristine: Boolean): Unit = js.native
  
  def setFormValidState(allIsValid: Boolean): Unit = js.native
  
  def setInputValidationErrors(errors: js.Any): Unit = js.native
  
  def submit(): Unit = js.native
  def submit(event: SyntheticEvent[Element, Event]): Unit = js.native
  
  val throttledValidateForm: js.Any = js.native
  
  var updateInputsWithError: IUpdateInputsWithError = js.native
  
  var updateInputsWithValue: IUpdateInputsWithValue[_] = js.native
  
  def validate[V](component: InputComponent[V]): Unit = js.native
  
  def validateForm(): Unit = js.native
}
/* static members */
@JSImport("formsy-react/dist/Formsy", "Formsy")
@js.native
object Formsy extends js.Object {
  
  var defaultProps: PartialFormsyProps = js.native
  
  var displayName: String = js.native
  
  var propTypes: Disabled = js.native
}
