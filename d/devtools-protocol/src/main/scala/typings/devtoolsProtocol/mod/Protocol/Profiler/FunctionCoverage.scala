package typings.devtoolsProtocol.mod.Protocol.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionCoverage extends js.Object {
  /**
    * JavaScript function name.
    */
  var functionName: String = js.native
  /**
    * Whether coverage data for this function has block granularity.
    */
  var isBlockCoverage: Boolean = js.native
  /**
    * Source ranges inside the function with coverage data.
    */
  var ranges: js.Array[CoverageRange] = js.native
}

object FunctionCoverage {
  @scala.inline
  def apply(functionName: String, isBlockCoverage: Boolean, ranges: js.Array[CoverageRange]): FunctionCoverage = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], isBlockCoverage = isBlockCoverage.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionCoverage]
  }
  @scala.inline
  implicit class FunctionCoverageOps[Self <: FunctionCoverage] (val x: Self) extends AnyVal {
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
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBlockCoverage(value: Boolean): Self = this.set("isBlockCoverage", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangesVarargs(value: CoverageRange*): Self = this.set("ranges", js.Array(value :_*))
    @scala.inline
    def setRanges(value: js.Array[CoverageRange]): Self = this.set("ranges", value.asInstanceOf[js.Any])
  }
  
}

