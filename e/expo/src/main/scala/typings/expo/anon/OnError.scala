package typings.expo.anon

import typings.expo.appLoadingMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnError extends Props {
  
  var onError: Null = js.native
  
  var onFinish: Null = js.native
  
  var startAsync: Null = js.native
}
object OnError {
  
  @scala.inline
  def apply(onError: Null, onFinish: Null, startAsync: Null): OnError = {
    val __obj = js.Dynamic.literal(onError = onError.asInstanceOf[js.Any], onFinish = onFinish.asInstanceOf[js.Any], startAsync = startAsync.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnError]
  }
  
  @scala.inline
  implicit class OnErrorMutableBuilder[Self <: OnError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnError(value: Null): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFinish(value: Null): Self = StObject.set(x, "onFinish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAsync(value: Null): Self = StObject.set(x, "startAsync", value.asInstanceOf[js.Any])
  }
}
