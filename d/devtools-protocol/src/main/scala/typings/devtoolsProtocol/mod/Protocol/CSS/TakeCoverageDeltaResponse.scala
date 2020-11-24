package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TakeCoverageDeltaResponse extends js.Object {
  
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
  implicit class TakeCoverageDeltaResponseOps[Self <: TakeCoverageDeltaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoverageVarargs(value: RuleUsage*): Self = this.set("coverage", js.Array(value :_*))
    
    @scala.inline
    def setCoverage(value: js.Array[RuleUsage]): Self = this.set("coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
