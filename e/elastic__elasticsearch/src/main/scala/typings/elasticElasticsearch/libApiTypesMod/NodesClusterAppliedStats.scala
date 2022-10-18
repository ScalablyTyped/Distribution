package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesClusterAppliedStats extends StObject {
  
  var recordings: js.UndefOr[js.Array[NodesRecording]] = js.undefined
}
object NodesClusterAppliedStats {
  
  inline def apply(): NodesClusterAppliedStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesClusterAppliedStats]
  }
  
  extension [Self <: NodesClusterAppliedStats](x: Self) {
    
    inline def setRecordings(value: js.Array[NodesRecording]): Self = StObject.set(x, "recordings", value.asInstanceOf[js.Any])
    
    inline def setRecordingsUndefined: Self = StObject.set(x, "recordings", js.undefined)
    
    inline def setRecordingsVarargs(value: NodesRecording*): Self = StObject.set(x, "recordings", js.Array(value*))
  }
}
