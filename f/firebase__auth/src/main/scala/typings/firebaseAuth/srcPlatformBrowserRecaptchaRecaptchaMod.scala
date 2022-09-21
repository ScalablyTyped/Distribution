package typings.firebaseAuth

import typings.firebaseAuth.srcModelPublicTypesMod.RecaptchaParameters
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPlatformBrowserRecaptchaRecaptchaMod {
  
  trait Recaptcha extends StObject {
    
    def execute(id: Double): Any
    
    def getResponse(id: Double): String
    
    def render(container: HTMLElement, parameters: RecaptchaParameters): Double
    
    def reset(id: Double): Any
  }
  object Recaptcha {
    
    inline def apply(
      execute: Double => Any,
      getResponse: Double => String,
      render: (HTMLElement, RecaptchaParameters) => Double,
      reset: Double => Any
    ): Recaptcha = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getResponse = js.Any.fromFunction1(getResponse), render = js.Any.fromFunction2(render), reset = js.Any.fromFunction1(reset))
      __obj.asInstanceOf[Recaptcha]
    }
    
    extension [Self <: Recaptcha](x: Self) {
      
      inline def setExecute(value: Double => Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setGetResponse(value: Double => String): Self = StObject.set(x, "getResponse", js.Any.fromFunction1(value))
      
      inline def setRender(value: (HTMLElement, RecaptchaParameters) => Double): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setReset(value: Double => Any): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    }
  }
}
