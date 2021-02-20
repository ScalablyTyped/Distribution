package typings.expressValidator.anon

import typings.expressValidator.baseMod.ValidationError
import typings.expressValidator.contextMod.ReadonlyContext
import typings.expressValidator.validationResultMod.ErrorFormatter
import typings.expressValidator.validationResultMod.Result
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined express-validator.express-validator/src/validation-result.Result<any> & {  context :express-validator.express-validator/src/context.ReadonlyContext} */
@js.native
trait ResultanycontextReadonlyC extends StObject {
  
  def array(): js.Array[_] = js.native
  def array(options: OnlyFirstError): js.Array[_] = js.native
  
  var context: ReadonlyContext = js.native
  
  val errors: js.Any = js.native
  
  def formatWith[T2](formatter: ErrorFormatter[T2]): Result[T2] = js.native
  
  var formatter: js.Any = js.native
  
  def isEmpty(): Boolean = js.native
  
  def mapped(): Record[String, _] = js.native
  
  def `throw`(): Unit = js.native
}
