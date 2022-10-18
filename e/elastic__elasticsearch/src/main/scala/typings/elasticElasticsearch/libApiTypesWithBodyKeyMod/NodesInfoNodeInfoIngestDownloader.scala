package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoIngestDownloader extends StObject {
  
  var enabled: String
}
object NodesInfoNodeInfoIngestDownloader {
  
  inline def apply(enabled: String): NodesInfoNodeInfoIngestDownloader = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoIngestDownloader]
  }
  
  extension [Self <: NodesInfoNodeInfoIngestDownloader](x: Self) {
    
    inline def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
