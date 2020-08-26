package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Resource type with ID
  * Used by the get method
  */
@js.native
trait ResourceParameter extends js.Object {
  /**
    * Resource ID
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of the resource type
    */
  var resource: String = js.native
}

object ResourceParameter {
  @scala.inline
  def apply(resource: String): ResourceParameter = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceParameter]
  }
  @scala.inline
  implicit class ResourceParameterOps[Self <: ResourceParameter] (val x: Self) extends AnyVal {
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
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

