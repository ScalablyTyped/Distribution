package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoDeprecationIndexing extends StObject {
  
  var enabled: Boolean | String
}
object NodesInfoDeprecationIndexing {
  
  inline def apply(enabled: Boolean | String): NodesInfoDeprecationIndexing = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoDeprecationIndexing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoDeprecationIndexing] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean | String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
