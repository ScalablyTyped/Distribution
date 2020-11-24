package typings.expressValidator.anon

import typings.expressValidator.validationResultMod.ResultFactory
import typings.expressValidator.validationResultMod.ResultFactoryBuilderOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithDefaults extends js.Object {
  
  def withDefaults[T](): ResultFactory[T] = js.native
  def withDefaults[T](options: Partial[ResultFactoryBuilderOptions[T]]): ResultFactory[T] = js.native
  @JSName("withDefaults")
  var withDefaults_Original: FnCall = js.native
}
