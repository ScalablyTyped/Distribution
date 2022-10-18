package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

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
  
  extension [Self <: NodesInfoNodeInfoSettingsClusterElection](x: Self) {
    
    inline def setStrategy(value: Name): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
