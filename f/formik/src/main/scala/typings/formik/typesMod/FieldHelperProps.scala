package typings.formik.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldHelperProps[Value] extends js.Object {
  
  /** Set the field's error value */
  def setError(value: Value): Unit = js.native
  
  /** Set the field's touched value */
  def setTouched(value: Boolean): Unit = js.native
  def setTouched(value: Boolean, shouldValidate: Boolean): Unit = js.native
  
  /** Set the field's value */
  def setValue(value: Value): Unit = js.native
  def setValue(value: Value, shouldValidate: Boolean): Unit = js.native
}
