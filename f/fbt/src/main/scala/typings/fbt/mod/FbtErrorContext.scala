package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FbtErrorContext extends StObject {
  
  var hash: js.UndefOr[String] = js.undefined
  
  var translation: String
}
object FbtErrorContext {
  
  inline def apply(translation: String): FbtErrorContext = {
    val __obj = js.Dynamic.literal(translation = translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbtErrorContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FbtErrorContext] (val x: Self) extends AnyVal {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setTranslation(value: String): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
  }
}
