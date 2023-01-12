package typings.fastifyError

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(code: String, message: String): FastifyErrorConstructor = (^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[FastifyErrorConstructor]
  inline def apply(code: String, message: String, statusCode: Double): FastifyErrorConstructor = (^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any])).asInstanceOf[FastifyErrorConstructor]
  inline def apply(code: String, message: String, statusCode: Double, Base: js.Error): FastifyErrorConstructor = (^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any], Base.asInstanceOf[js.Any])).asInstanceOf[FastifyErrorConstructor]
  inline def apply(code: String, message: String, statusCode: Unit, Base: js.Error): FastifyErrorConstructor = (^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any], message.asInstanceOf[js.Any], statusCode.asInstanceOf[js.Any], Base.asInstanceOf[js.Any])).asInstanceOf[FastifyErrorConstructor]
  
  @JSImport("fastify-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FastifyError
    extends StObject
       with Error {
    
    var code: String
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object FastifyError {
    
    inline def apply(code: String, message: String, name: String): FastifyError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FastifyError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  @js.native
  trait FastifyErrorConstructor
    extends StObject
       with Instantiable0[FastifyError]
       with Instantiable1[/* a */ Any, FastifyError]
       with Instantiable2[(/* a */ Any) | (/* a */ Unit), /* b */ Any, FastifyError]
       with Instantiable3[
          (/* a */ Any) | (/* a */ Unit), 
          (/* b */ Any) | (/* b */ Unit), 
          /* c */ Any, 
          FastifyError
        ] {
    
    def apply(): FastifyError = js.native
    def apply(a: Any): FastifyError = js.native
    def apply(a: Any, b: Any): FastifyError = js.native
    def apply(a: Any, b: Any, c: Any): FastifyError = js.native
    def apply(a: Any, b: Unit, c: Any): FastifyError = js.native
    def apply(a: Unit, b: Any): FastifyError = js.native
    def apply(a: Unit, b: Any, c: Any): FastifyError = js.native
    def apply(a: Unit, b: Unit, c: Any): FastifyError = js.native
  }
}
