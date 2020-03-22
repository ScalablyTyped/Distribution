package typings.formsyReact.mod

import typings.formsyReact.interfacesMod.IUpdateInputsWithError
import typings.formsyReact.interfacesMod.IUpdateInputsWithValue
import typings.formsyReact.interfacesMod.InputComponent
import typings.formsyReact.wrapperMod.PassDownProps
import typings.formsyReact.wrapperMod.WrapperState
import typings.react.mod.Component
import typings.std.InstanceType
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formsy
  extends Component[FormsyProps, FormsyState, js.Any] {
  var emptyArray: js.Array[_] = js.native
  var inputs: js.Array[InstanceType[js.Any with PassDownProps[_]]] = js.native
  var prevInputNames: js.Array[_] | Null = js.native
  var resetInternal: js.Any = js.native
  var resetModel: js.Any = js.native
  var updateInputsWithError: IUpdateInputsWithError = js.native
  var updateInputsWithValue: IUpdateInputsWithValue[_] = js.native
  def attachToForm(component: js.Any): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MFormsy(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MFormsy(prevProps: FormsyProps): Unit = js.native
  def detachFromForm[V](component: InputComponent[V]): Unit = js.native
  def getCurrentValues(): js.Any = js.native
  def getModel(): js.Any = js.native
  def getPristineValues(): js.Any = js.native
  def isChanged(): Boolean = js.native
  def isFormDisabled(): Boolean = js.native
  def isValidValue(component: js.Any, value: js.Any): Boolean = js.native
  def mapModel(model: js.Any): js.Any = js.native
  def reset(): Unit = js.native
  def reset(model: js.Any): Unit = js.native
  def runValidation[V](component: InputComponent[V]): Partial[WrapperState[V]] = js.native
  def runValidation[V](component: InputComponent[V], value: V): Partial[WrapperState[V]] = js.native
  def setFormPristine(isPristine: Boolean): Unit = js.native
  def setFormValidState(allIsValid: Boolean): Unit = js.native
  def setInputValidationErrors(errors: js.Any): Unit = js.native
  def submit(): Unit = js.native
  def submit(event: js.Any): Unit = js.native
  def validate[V](component: InputComponent[V]): Unit = js.native
  def validateForm(): Unit = js.native
}

