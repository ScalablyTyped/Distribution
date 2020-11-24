package typings.formsyReact.withFormsyMod

import typings.formsyReact.interfacesMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapperInstanceMethods[V] extends js.Object {
  
  def getErrorMessage(): Null | ValidationError = js.native
  
  def getErrorMessages(): js.Array[ValidationError] = js.native
  
  def getValue(): V = js.native
  
  def isFormDisabled(): Boolean = js.native
  
  def isFormSubmitted(): Boolean = js.native
  
  def isValid(): Boolean = js.native
  
  def isValidValue(value: V): Boolean = js.native
  
  def setValue(value: V): Unit = js.native
  def setValue(value: V, validate: Boolean): Unit = js.native
}
