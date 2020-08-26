package typings.dwt.webTwainAcquireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapabilityDetails extends js.Object {
  /**
    * The Capability.
    */
  var capability: ValueAndLabel = js.native
  /**
    * The container type of the Capability
    */
  var conType: ValueAndLabel = js.native
  /**
    * The index for the current value of the Capability
    */
  var curIndex: Double = js.native
  /**
    * The current value of the Capability
    */
  var curValue: ValueAndLabel = js.native
  /**
    * The index for the default value of the Capability
    */
  var defIndex: Double = js.native
  /**
    * The operation types that are supported by the Capability. Types include {"get", "set", "reset" "getdefault", "getcurrent"}
    */
  var query: js.Array[String] = js.native
  /**
    * The value type of the Capability. Value types include
    * TWTY_BOOL: 6
    * TWTY_FIX32: 7
    * TWTY_FRAME: 8
    * TWTY_INT8: 0
    * TWTY_INT16: 1
    * TWTY_INT32: 2
    * TWTY_STR32: 9
    * TWTY_STR64: 10
    * TWTY_STR128: 11
    * TWTY_STR255: 12
    * TWTY_UINT8: 3
    * TWTY_UINT16: 4
    * TWTY_int: 5
    */
  var valueType: ValueAndLabel = js.native
  /**
    * The available values of the Capability
    */
  var values: js.Array[ValueAndLabel] = js.native
}

object CapabilityDetails {
  @scala.inline
  def apply(
    capability: ValueAndLabel,
    conType: ValueAndLabel,
    curIndex: Double,
    curValue: ValueAndLabel,
    defIndex: Double,
    query: js.Array[String],
    valueType: ValueAndLabel,
    values: js.Array[ValueAndLabel]
  ): CapabilityDetails = {
    val __obj = js.Dynamic.literal(capability = capability.asInstanceOf[js.Any], conType = conType.asInstanceOf[js.Any], curIndex = curIndex.asInstanceOf[js.Any], curValue = curValue.asInstanceOf[js.Any], defIndex = defIndex.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityDetails]
  }
  @scala.inline
  implicit class CapabilityDetailsOps[Self <: CapabilityDetails] (val x: Self) extends AnyVal {
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
    def setCapability(value: ValueAndLabel): Self = this.set("capability", value.asInstanceOf[js.Any])
    @scala.inline
    def setConType(value: ValueAndLabel): Self = this.set("conType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurIndex(value: Double): Self = this.set("curIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurValue(value: ValueAndLabel): Self = this.set("curValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefIndex(value: Double): Self = this.set("defIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryVarargs(value: String*): Self = this.set("query", js.Array(value :_*))
    @scala.inline
    def setQuery(value: js.Array[String]): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueType(value: ValueAndLabel): Self = this.set("valueType", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: ValueAndLabel*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[ValueAndLabel]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

