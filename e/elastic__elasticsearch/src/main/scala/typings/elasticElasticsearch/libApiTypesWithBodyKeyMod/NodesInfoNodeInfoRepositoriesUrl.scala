package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoRepositoriesUrl extends StObject {
  
  var allowed_urls: String
}
object NodesInfoNodeInfoRepositoriesUrl {
  
  inline def apply(allowed_urls: String): NodesInfoNodeInfoRepositoriesUrl = {
    val __obj = js.Dynamic.literal(allowed_urls = allowed_urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoRepositoriesUrl]
  }
  
  extension [Self <: NodesInfoNodeInfoRepositoriesUrl](x: Self) {
    
    inline def setAllowed_urls(value: String): Self = StObject.set(x, "allowed_urls", value.asInstanceOf[js.Any])
  }
}
