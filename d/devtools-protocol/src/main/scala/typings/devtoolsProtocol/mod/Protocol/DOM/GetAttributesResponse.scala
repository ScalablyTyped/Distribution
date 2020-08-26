package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAttributesResponse extends js.Object {
  /**
    * An interleaved array of node attribute names and values.
    */
  var attributes: js.Array[String] = js.native
}

object GetAttributesResponse {
  @scala.inline
  def apply(attributes: js.Array[String]): GetAttributesResponse = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributesResponse]
  }
  @scala.inline
  implicit class GetAttributesResponseOps[Self <: GetAttributesResponse] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
  }
  
}

