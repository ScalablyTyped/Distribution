package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoRepositories extends StObject {
  
  var url: NodesInfoNodeInfoRepositoriesUrl
}
object NodesInfoNodeInfoRepositories {
  
  inline def apply(url: NodesInfoNodeInfoRepositoriesUrl): NodesInfoNodeInfoRepositories = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoRepositories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoRepositories] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: NodesInfoNodeInfoRepositoriesUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
