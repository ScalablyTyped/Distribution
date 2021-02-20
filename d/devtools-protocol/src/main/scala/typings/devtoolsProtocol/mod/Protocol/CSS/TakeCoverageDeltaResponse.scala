package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TakeCoverageDeltaResponse extends StObject {
  
  var coverage: js.Array[RuleUsage] = js.native
  
  /**
    * Monotonically increasing time, in seconds.
    */
  var timestamp: Double = js.native
}
object TakeCoverageDeltaResponse {
  
  @scala.inline
  def apply(coverage: js.Array[RuleUsage], timestamp: Double): TakeCoverageDeltaResponse = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakeCoverageDeltaResponse]
  }
  
  @scala.inline
  implicit class TakeCoverageDeltaResponseMutableBuilder[Self <: TakeCoverageDeltaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoverage(value: js.Array[RuleUsage]): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageVarargs(value: RuleUsage*): Self = StObject.set(x, "coverage", js.Array(value :_*))
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
