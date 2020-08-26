package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /** The input features for this instance. */
  var csvInstance: js.UndefOr[js.Array[_]] = js.native
  /** The generic output value - could be regression or class label. */
  var output: js.UndefOr[String] = js.native
}

object Output {
  @scala.inline
  def apply(): Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Output]
  }
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
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
    def setCsvInstanceVarargs(value: js.Any*): Self = this.set("csvInstance", js.Array(value :_*))
    @scala.inline
    def setCsvInstance(value: js.Array[_]): Self = this.set("csvInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsvInstance: Self = this.set("csvInstance", js.undefined)
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
  
}

