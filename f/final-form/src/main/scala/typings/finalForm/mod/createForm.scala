package typings.finalForm.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("final-form", "createForm")
@js.native
object createForm extends js.Object {
  
  def apply[FormValues, InitialFormValues](config: Config[FormValues, Partial[FormValues]]): FormApi[FormValues, InitialFormValues] = js.native
}
