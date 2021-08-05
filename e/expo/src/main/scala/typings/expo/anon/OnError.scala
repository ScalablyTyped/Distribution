package typings.expo.anon

import typings.expo.appLoadingMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnError
  extends StObject
     with Props {
  
  var onError: Null
  
  var onFinish: Null
  
  var startAsync: Null
}
object OnError {
  
  inline def apply(onError: Null, onFinish: Null, startAsync: Null): OnError = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onFinish = onFinish.asInstanceOf[js.Any], startAsync = startAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnError]
  }
  
  extension [Self <: OnError](x: Self) {
    
    inline def setOnError(value: Null): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOnFinish(value: Null): Self = StObject.set(x, "onFinish", value.asInstanceOf[js.Any])
    
    inline def setStartAsync(value: Null): Self = StObject.set(x, "startAsync", value.asInstanceOf[js.Any])
  }
}
