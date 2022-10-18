package typings.esAggregateError

import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationMod {
  
  @JSImport("es-aggregate-error/implementation", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with AggregateError {
    // Using `any` here, to match Node's own typings:
    def this(errors: js.Array[Any]) = this()
    def this(errors: js.Array[Any], message: String) = this()
    
    /* CompleteClass */
    override val errors: js.Array[Any] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_AggregateError: typings.esAggregateError.esAggregateErrorStrings.AggregateError = js.native
  }
  
  trait AggregateError
    extends StObject
       with ErrnoException {
    
    val errors: js.Array[Any]
    
    @JSName("name")
    val name_AggregateError: typings.esAggregateError.esAggregateErrorStrings.AggregateError
  }
  object AggregateError {
    
    inline def apply(errors: js.Array[Any], message: String): AggregateError = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = "AggregateError")
      __obj.asInstanceOf[AggregateError]
    }
    
    extension [Self <: AggregateError](x: Self) {
      
      inline def setErrors(value: js.Array[Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Any*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setName(value: typings.esAggregateError.esAggregateErrorStrings.AggregateError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
