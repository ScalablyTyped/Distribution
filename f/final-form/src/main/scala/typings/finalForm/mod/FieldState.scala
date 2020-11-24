package typings.finalForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldState[FieldValue] extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  def blur(): Unit = js.native
  
  def change(): Unit = js.native
  def change(value: FieldValue): Unit = js.native
  
  var data: js.UndefOr[AnyObject] = js.native
  
  var dirty: js.UndefOr[Boolean] = js.native
  
  var dirtySinceLastSubmit: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  def focus(): Unit = js.native
  
  var initial: js.UndefOr[FieldValue] = js.native
  
  var invalid: js.UndefOr[Boolean] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var modified: js.UndefOr[Boolean] = js.native
  
  var modifiedSinceLastSubmit: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  var pristine: js.UndefOr[Boolean] = js.native
  
  var submitError: js.UndefOr[js.Any] = js.native
  
  var submitFailed: js.UndefOr[Boolean] = js.native
  
  var submitSucceeded: js.UndefOr[Boolean] = js.native
  
  var submitting: js.UndefOr[Boolean] = js.native
  
  var touched: js.UndefOr[Boolean] = js.native
  
  var valid: js.UndefOr[Boolean] = js.native
  
  var validating: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[FieldValue] = js.native
  
  var visited: js.UndefOr[Boolean] = js.native
}
