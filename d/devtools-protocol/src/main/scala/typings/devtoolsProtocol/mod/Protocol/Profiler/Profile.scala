package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Profile extends StObject {
  
  /**
    * Profiling end timestamp in microseconds.
    */
  var endTime: Double = js.native
  
  /**
    * The list of profile nodes. First item is the root node.
    */
  var nodes: js.Array[ProfileNode] = js.native
  
  /**
    * Ids of samples top nodes.
    */
  var samples: js.UndefOr[js.Array[integer]] = js.native
  
  /**
    * Profiling start timestamp in microseconds.
    */
  var startTime: Double = js.native
  
  /**
    * Time intervals between adjacent samples in microseconds. The first delta is relative to the
    * profile startTime.
    */
  var timeDeltas: js.UndefOr[js.Array[integer]] = js.native
}
object Profile {
  
  @scala.inline
  def apply(endTime: Double, nodes: js.Array[ProfileNode], startTime: Double): Profile = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  
  @scala.inline
  implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: js.Array[ProfileNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: ProfileNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setSamples(value: js.Array[integer]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
    
    @scala.inline
    def setSamplesVarargs(value: integer*): Self = StObject.set(x, "samples", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDeltas(value: js.Array[integer]): Self = StObject.set(x, "timeDeltas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDeltasUndefined: Self = StObject.set(x, "timeDeltas", js.undefined)
    
    @scala.inline
    def setTimeDeltasVarargs(value: integer*): Self = StObject.set(x, "timeDeltas", js.Array(value :_*))
  }
}
