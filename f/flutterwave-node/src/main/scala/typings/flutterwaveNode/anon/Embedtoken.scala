package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Embedtoken extends StObject {
  
  var embedtoken: String
  
  var expiry: String
  
  var shortcode: String
}
object Embedtoken {
  
  inline def apply(embedtoken: String, expiry: String, shortcode: String): Embedtoken = {
    val __obj = js.Dynamic.literal(embedtoken = embedtoken.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], shortcode = shortcode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Embedtoken]
  }
  
  extension [Self <: Embedtoken](x: Self) {
    
    inline def setEmbedtoken(value: String): Self = StObject.set(x, "embedtoken", value.asInstanceOf[js.Any])
    
    inline def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setShortcode(value: String): Self = StObject.set(x, "shortcode", value.asInstanceOf[js.Any])
  }
}
