package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountInfoOptions extends StObject {
  
  var httpCache: Boolean
}
object AccountInfoOptions {
  
  inline def apply(httpCache: Boolean): AccountInfoOptions = {
    val __obj = js.Dynamic.literal(httpCache = httpCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfoOptions]
  }
  
  extension [Self <: AccountInfoOptions](x: Self) {
    
    inline def setHttpCache(value: Boolean): Self = StObject.set(x, "httpCache", value.asInstanceOf[js.Any])
  }
}
