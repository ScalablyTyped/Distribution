package typings.devtoolsProtocol.mod.Protocol.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPropertiesResponse extends js.Object {
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.native
  /**
    * Internal object properties (only of the element itself).
    */
  var internalProperties: js.UndefOr[js.Array[InternalPropertyDescriptor]] = js.native
  /**
    * Object private properties.
    */
  var privateProperties: js.UndefOr[js.Array[PrivatePropertyDescriptor]] = js.native
  /**
    * Object properties.
    */
  var result: js.Array[PropertyDescriptor] = js.native
}

object GetPropertiesResponse {
  @scala.inline
  def apply(result: js.Array[PropertyDescriptor]): GetPropertiesResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertiesResponse]
  }
  @scala.inline
  implicit class GetPropertiesResponseOps[Self <: GetPropertiesResponse] (val x: Self) extends AnyVal {
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
    def setResultVarargs(value: PropertyDescriptor*): Self = this.set("result", js.Array(value :_*))
    @scala.inline
    def setResult(value: js.Array[PropertyDescriptor]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setExceptionDetails(value: ExceptionDetails): Self = this.set("exceptionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExceptionDetails: Self = this.set("exceptionDetails", js.undefined)
    @scala.inline
    def setInternalPropertiesVarargs(value: InternalPropertyDescriptor*): Self = this.set("internalProperties", js.Array(value :_*))
    @scala.inline
    def setInternalProperties(value: js.Array[InternalPropertyDescriptor]): Self = this.set("internalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalProperties: Self = this.set("internalProperties", js.undefined)
    @scala.inline
    def setPrivatePropertiesVarargs(value: PrivatePropertyDescriptor*): Self = this.set("privateProperties", js.Array(value :_*))
    @scala.inline
    def setPrivateProperties(value: js.Array[PrivatePropertyDescriptor]): Self = this.set("privateProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateProperties: Self = this.set("privateProperties", js.undefined)
  }
  
}

