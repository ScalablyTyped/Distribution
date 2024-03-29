package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesClusterAppliedStats] (val x: Self) extends AnyVal {
    
    inline def setRecordings(value: js.Array[NodesRecording]): Self = StObject.set(x, "recordings", value.asInstanceOf[js.Any])
    
    inline def setRecordingsUndefined: Self = StObject.set(x, "recordings", js.undefined)
    
    inline def setRecordingsVarargs(value: NodesRecording*): Self = StObject.set(x, "recordings", js.Array(value*))
  }
}
