package typings.expressValidator.anon

import typings.expressValidator.validationResultMod.ResultFactory
import typings.expressValidator.validationResultMod.ResultFactoryBuilderOptions
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithDefaults extends StObject {
  
  def withDefaults[T](): ResultFactory[T]
  def withDefaults[T](options: Partial[ResultFactoryBuilderOptions[T]]): ResultFactory[T]
  @JSName("withDefaults")
  var withDefaults_Original: FnCall
}
object WithDefaults {
  
  @scala.inline
  def apply(withDefaults: FnCall): WithDefaults = {
    val __obj = js.Dynamic.literal(withDefaults = withDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithDefaults]
  }
  
  @scala.inline
  implicit class WithDefaultsMutableBuilder[Self <: WithDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWithDefaults(value: FnCall): Self = StObject.set(x, "withDefaults", value.asInstanceOf[js.Any])
  }
}
