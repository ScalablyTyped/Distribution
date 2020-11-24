package typings.finalForm.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalFieldState[FieldValue] extends js.Object {
  
  var active: Boolean = js.native
  
  def blur(): Unit = js.native
  
  def change(value: js.Any): Unit = js.native
  
  var data: AnyObject = js.native
  
  def focus(): Unit = js.native
  
  def isEqual(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("isEqual")
  var isEqual_Original: IsEqual = js.native
  
  var lastFieldState: js.UndefOr[FieldState[FieldValue]] = js.native
  
  var length: js.UndefOr[js.Any] = js.native
  
  var modified: Boolean = js.native
  
  var modifiedSinceLastSubmit: Boolean = js.native
  
  var name: String = js.native
  
  var touched: Boolean = js.native
  
  var valid: Boolean = js.native
  
  var validateFields: js.UndefOr[js.Array[String]] = js.native
  
  var validating: Boolean = js.native
  
  var validators: NumberDictionary[GetFieldValidator[FieldValue]] = js.native
  
  var visited: Boolean = js.native
}
