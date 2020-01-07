package typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for how to validate and process properties on a resource.
  */
@js.native
trait Schema$ValidationOptions extends js.Object {
  /**
    * Customize how deployment manager will validate the resource against
    * schema errors.
    */
  var schemaValidation: js.UndefOr[String] = js.native
  /**
    * Specify what to do with extra properties when executing a request.
    */
  var undeclaredProperties: js.UndefOr[String] = js.native
}

object Schema$ValidationOptions {
  @scala.inline
  def apply(schemaValidation: String = null, undeclaredProperties: String = null): Schema$ValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (schemaValidation != null) __obj.updateDynamic("schemaValidation")(schemaValidation.asInstanceOf[js.Any])
    if (undeclaredProperties != null) __obj.updateDynamic("undeclaredProperties")(undeclaredProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ValidationOptions]
  }
}

