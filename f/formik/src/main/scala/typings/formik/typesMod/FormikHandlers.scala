package typings.formik.typesMod

import typings.react.mod.ChangeEvent
import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormikHandlers extends js.Object {
  
  def getFieldHelpers[Value](name: String): FieldHelperProps[Value] = js.native
  
  def getFieldMeta[Value](name: String): FieldMetaProps[Value] = js.native
  
  def getFieldProps[Value](props: js.Any): FieldInputProps[Value] = js.native
  
  def handleBlur(e: FocusEvent[_]): Unit = js.native
  def handleBlur[T](fieldOrEvent: T): Unit | (js.Function1[/* e */ js.Any, Unit]) = js.native
  
  def handleChange(e: ChangeEvent[_]): Unit = js.native
  def handleChange[T](field: T): (js.Function1[/* e */ String | ChangeEvent[_], Unit]) | Unit = js.native
  
  /** Reset form event handler  */
  def handleReset(): Unit = js.native
  def handleReset(e: SyntheticEvent[_, Event]): Unit = js.native
  
  /** Form submit handler */
  def handleSubmit(): Unit = js.native
  def handleSubmit(e: FormEvent[HTMLFormElement]): Unit = js.native
}
