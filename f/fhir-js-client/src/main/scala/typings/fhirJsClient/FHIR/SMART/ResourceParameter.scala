package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Resource type with ID
  * Used by the get method
  */
trait ResourceParameter extends js.Object {
  /**
    * Resource ID
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Name of the resource type
    */
  var resource: String
}

object ResourceParameter {
  @scala.inline
  def apply(resource: String, id: String = null): ResourceParameter = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceParameter]
  }
}

