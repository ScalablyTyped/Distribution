package typings.devtoolsProtocol.mod.Protocol.Memory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingProfileNode extends js.Object {
  /**
    * Size of the sampled allocation.
    */
  var size: Double = js.native
  /**
    * Execution stack at the point of allocation.
    */
  var stack: js.Array[String] = js.native
  /**
    * Total bytes attributed to this sample.
    */
  var total: Double = js.native
}

object SamplingProfileNode {
  @scala.inline
  def apply(size: Double, stack: js.Array[String], total: Double): SamplingProfileNode = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingProfileNode]
  }
  @scala.inline
  implicit class SamplingProfileNodeOps[Self <: SamplingProfileNode] (val x: Self) extends AnyVal {
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackVarargs(value: String*): Self = this.set("stack", js.Array(value :_*))
    @scala.inline
    def setStack(value: js.Array[String]): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

