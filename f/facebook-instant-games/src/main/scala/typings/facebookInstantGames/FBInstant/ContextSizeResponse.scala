package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The answer field is true if the current context size is between the minSize and maxSize values that are specified in the object, and false otherwise.
  */
trait ContextSizeResponse extends StObject {
  
  var answer: Boolean
  
  var maxSize: js.UndefOr[Double] = js.undefined
  
  var minSize: js.UndefOr[Double] = js.undefined
}
object ContextSizeResponse {
  
  inline def apply(answer: Boolean): ContextSizeResponse = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextSizeResponse]
  }
  
  extension [Self <: ContextSizeResponse](x: Self) {
    
    inline def setAnswer(value: Boolean): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
