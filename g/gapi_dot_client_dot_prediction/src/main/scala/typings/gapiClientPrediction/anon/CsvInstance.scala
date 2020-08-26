package typings.gapiClientPrediction.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CsvInstance extends js.Object {
  /** A list of input features, these can be strings or doubles. */
  var csvInstance: js.UndefOr[js.Array[_]] = js.native
}

object CsvInstance {
  @scala.inline
  def apply(): CsvInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvInstance]
  }
  @scala.inline
  implicit class CsvInstanceOps[Self <: CsvInstance] (val x: Self) extends AnyVal {
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
  }
  
}

