package typings.ethers.anon

import typings.ethers.ethersStrings.sendCcipReadFetchRequest
import typings.ethers.typesProvidersAbstractProviderMod.DebugEventAbstractProvider
import typings.ethers.typesUtilsMod.FetchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action
  extends StObject
     with DebugEventAbstractProvider {
  
  var action: sendCcipReadFetchRequest
  
  var index: Double
  
  var request: FetchRequest
  
  var urls: js.Array[String]
}
object Action {
  
  inline def apply(index: Double, request: FetchRequest, urls: js.Array[String]): Action = {
    val __obj = js.Dynamic.literal(action = "sendCcipReadFetchRequest", index = index.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    inline def setAction(value: sendCcipReadFetchRequest): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: FetchRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
