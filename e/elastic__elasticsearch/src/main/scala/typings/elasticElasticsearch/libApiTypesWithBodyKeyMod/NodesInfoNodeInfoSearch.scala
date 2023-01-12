package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoSearch extends StObject {
  
  var remote: NodesInfoNodeInfoSearchRemote
}
object NodesInfoNodeInfoSearch {
  
  inline def apply(remote: NodesInfoNodeInfoSearchRemote): NodesInfoNodeInfoSearch = {
    val __obj = js.Dynamic.literal(remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoSearch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoSearch] (val x: Self) extends AnyVal {
    
    inline def setRemote(value: NodesInfoNodeInfoSearchRemote): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
  }
}
