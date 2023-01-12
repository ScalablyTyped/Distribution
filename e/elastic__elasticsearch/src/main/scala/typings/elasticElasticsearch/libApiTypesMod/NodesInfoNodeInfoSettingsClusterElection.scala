package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoSettingsClusterElection extends StObject {
  
  var strategy: Name
}
object NodesInfoNodeInfoSettingsClusterElection {
  
  inline def apply(strategy: Name): NodesInfoNodeInfoSettingsClusterElection = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoSettingsClusterElection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesInfoNodeInfoSettingsClusterElection] (val x: Self) extends AnyVal {
    
    inline def setStrategy(value: Name): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
