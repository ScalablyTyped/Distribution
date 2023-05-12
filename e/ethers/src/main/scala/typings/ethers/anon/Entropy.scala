package typings.ethers.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entropy extends StObject {
  
  var entropy: String
  
  var locale: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object Entropy {
  
  inline def apply(entropy: String): Entropy = {
    val __obj = js.Dynamic.literal(entropy = entropy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entropy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entropy] (val x: Self) extends AnyVal {
    
    inline def setEntropy(value: String): Self = StObject.set(x, "entropy", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
