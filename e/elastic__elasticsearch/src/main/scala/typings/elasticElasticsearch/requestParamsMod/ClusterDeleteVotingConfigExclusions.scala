package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterDeleteVotingConfigExclusions
  extends StObject
     with Generic {
  
  var wait_for_removal: js.UndefOr[Boolean] = js.undefined
}
object ClusterDeleteVotingConfigExclusions {
  
  inline def apply(): ClusterDeleteVotingConfigExclusions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterDeleteVotingConfigExclusions]
  }
  
  extension [Self <: ClusterDeleteVotingConfigExclusions](x: Self) {
    
    inline def setWait_for_removal(value: Boolean): Self = StObject.set(x, "wait_for_removal", value.asInstanceOf[js.Any])
    
    inline def setWait_for_removalUndefined: Self = StObject.set(x, "wait_for_removal", js.undefined)
  }
}
