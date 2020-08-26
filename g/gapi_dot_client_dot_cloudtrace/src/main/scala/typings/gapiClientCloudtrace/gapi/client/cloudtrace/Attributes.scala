package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  /**
    * The set of attributes. Each attribute's key can be up to 128 bytes
    * long. The value can be a string up to 256 bytes, an integer, or the
    * Boolean values `true` and `false`. For example:
    *
    * "/instance_id": "my-instance"
    * "/http/user_agent": ""
    * "/http/request_bytes": 300
    * "abc.com/myattribute": true
    */
  var attributeMap: js.UndefOr[Record[String, AttributeValue]] = js.native
  /**
    * The number of attributes that were discarded. Attributes can be discarded
    * because their keys are too long or because there are too many attributes.
    * If this value is 0 then all attributes are valid.
    */
  var droppedAttributesCount: js.UndefOr[Double] = js.native
}

object Attributes {
  @scala.inline
  def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
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
    def setAttributeMap(value: Record[String, AttributeValue]): Self = this.set("attributeMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeMap: Self = this.set("attributeMap", js.undefined)
    @scala.inline
    def setDroppedAttributesCount(value: Double): Self = this.set("droppedAttributesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDroppedAttributesCount: Self = this.set("droppedAttributesCount", js.undefined)
  }
  
}

