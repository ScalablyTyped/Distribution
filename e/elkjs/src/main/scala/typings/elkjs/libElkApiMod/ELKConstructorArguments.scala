package typings.elkjs.libElkApiMod

import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ELKConstructorArguments extends StObject {
  
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  
  var defaultLayoutOptions: js.UndefOr[LayoutOptions] = js.undefined
  
  var workerFactory: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Worker]] = js.undefined
  
  var workerUrl: js.UndefOr[String] = js.undefined
}
object ELKConstructorArguments {
  
  inline def apply(): ELKConstructorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ELKConstructorArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ELKConstructorArguments] (val x: Self) extends AnyVal {
    
    inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
    
    inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value*))
    
    inline def setDefaultLayoutOptions(value: LayoutOptions): Self = StObject.set(x, "defaultLayoutOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultLayoutOptionsUndefined: Self = StObject.set(x, "defaultLayoutOptions", js.undefined)
    
    inline def setWorkerFactory(value: /* url */ js.UndefOr[String] => Worker): Self = StObject.set(x, "workerFactory", js.Any.fromFunction1(value))
    
    inline def setWorkerFactoryUndefined: Self = StObject.set(x, "workerFactory", js.undefined)
    
    inline def setWorkerUrl(value: String): Self = StObject.set(x, "workerUrl", value.asInstanceOf[js.Any])
    
    inline def setWorkerUrlUndefined: Self = StObject.set(x, "workerUrl", js.undefined)
  }
}
