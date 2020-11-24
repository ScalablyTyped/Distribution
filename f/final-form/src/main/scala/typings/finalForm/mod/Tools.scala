package typings.finalForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tools[FormValues, InitialFormValues] extends js.Object {
  
  def changeValue(
    state: MutableState[FormValues, InitialFormValues],
    name: String,
    mutate: js.Function1[/* value */ js.Any, _]
  ): Unit = js.native
  @JSName("changeValue")
  var changeValue_Original: ChangeValue[FormValues, InitialFormValues] = js.native
  
  def getIn(state: js.Object, complexKey: String): js.Any = js.native
  @JSName("getIn")
  var getIn_Original: GetIn_ = js.native
  
  def renameField(state: MutableState[FormValues, InitialFormValues], from: String, to: String): Unit = js.native
  @JSName("renameField")
  var renameField_Original: RenameField[FormValues, InitialFormValues] = js.native
  
  def resetFieldState(name: String): Unit = js.native
  
  def setIn(state: js.Object, key: String, value: js.Any): js.Object = js.native
  @JSName("setIn")
  var setIn_Original: SetIn_ = js.native
  
  def shallowEqual(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("shallowEqual")
  var shallowEqual_Original: IsEqual = js.native
}
