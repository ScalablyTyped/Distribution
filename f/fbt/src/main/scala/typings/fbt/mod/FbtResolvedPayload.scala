package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FbtResolvedPayload extends StObject {
  
  var contents: Any
  
  var errorListener: Any
  
  var patternHash: js.UndefOr[String] = js.undefined
  
  var patternString: String
}
object FbtResolvedPayload {
  
  inline def apply(contents: Any, errorListener: Any, patternString: String): FbtResolvedPayload = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], errorListener = errorListener.asInstanceOf[js.Any], patternString = patternString.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbtResolvedPayload]
  }
  
  extension [Self <: FbtResolvedPayload](x: Self) {
    
    inline def setContents(value: Any): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setErrorListener(value: Any): Self = StObject.set(x, "errorListener", value.asInstanceOf[js.Any])
    
    inline def setPatternHash(value: String): Self = StObject.set(x, "patternHash", value.asInstanceOf[js.Any])
    
    inline def setPatternHashUndefined: Self = StObject.set(x, "patternHash", js.undefined)
    
    inline def setPatternString(value: String): Self = StObject.set(x, "patternString", value.asInstanceOf[js.Any])
  }
}
