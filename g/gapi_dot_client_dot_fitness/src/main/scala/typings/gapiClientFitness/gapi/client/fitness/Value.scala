package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  /** Floating point value. When this is set, other values must not be set. */
  var fpVal: js.UndefOr[Double] = js.native
  /** Integer value. When this is set, other values must not be set. */
  var intVal: js.UndefOr[Double] = js.native
  /**
    * Map value. The valid key space and units for the corresponding value of each entry should be documented as part of the data type definition. Keys
    * should be kept small whenever possible. Data streams with large keys and high data frequency may be down sampled.
    */
  var mapVal: js.UndefOr[js.Array[ValueMapValEntry]] = js.native
  /**
    * String value. When this is set, other values must not be set. Strings should be kept small whenever possible. Data streams with large string values and
    * high data frequency may be down sampled.
    */
  var stringVal: js.UndefOr[String] = js.native
}

object Value {
  @scala.inline
  def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
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
    def setFpVal(value: Double): Self = this.set("fpVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFpVal: Self = this.set("fpVal", js.undefined)
    @scala.inline
    def setIntVal(value: Double): Self = this.set("intVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntVal: Self = this.set("intVal", js.undefined)
    @scala.inline
    def setMapValVarargs(value: ValueMapValEntry*): Self = this.set("mapVal", js.Array(value :_*))
    @scala.inline
    def setMapVal(value: js.Array[ValueMapValEntry]): Self = this.set("mapVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapVal: Self = this.set("mapVal", js.undefined)
    @scala.inline
    def setStringVal(value: String): Self = this.set("stringVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringVal: Self = this.set("stringVal", js.undefined)
  }
  
}

