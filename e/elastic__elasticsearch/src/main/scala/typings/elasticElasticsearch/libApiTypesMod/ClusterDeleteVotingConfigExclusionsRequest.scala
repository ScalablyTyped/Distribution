package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterDeleteVotingConfigExclusionsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var wait_for_removal: js.UndefOr[Boolean] = js.undefined
}
object ClusterDeleteVotingConfigExclusionsRequest {
  
  inline def apply(): ClusterDeleteVotingConfigExclusionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterDeleteVotingConfigExclusionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterDeleteVotingConfigExclusionsRequest] (val x: Self) extends AnyVal {
    
    inline def setWait_for_removal(value: Boolean): Self = StObject.set(x, "wait_for_removal", value.asInstanceOf[js.Any])
    
    inline def setWait_for_removalUndefined: Self = StObject.set(x, "wait_for_removal", js.undefined)
  }
}
