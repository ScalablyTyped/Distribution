package typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options allows customized resource handling by Deployment Manager.
  */
@js.native
trait Schema$Options extends js.Object {
  /**
    * Options regarding how to thread async requests.
    */
  var asyncOptions: js.UndefOr[js.Array[Schema$AsyncOptions]] = js.native
  /**
    * The mappings that apply for requests.
    */
  var inputMappings: js.UndefOr[js.Array[Schema$InputMapping]] = js.native
  /**
    * The json path to the field in the resource JSON body into which the
    * resource name should be mapped. Leaving this empty indicates that there
    * should be no mapping performed.
    */
  var nameProperty: js.UndefOr[String] = js.native
  /**
    * Options for how to validate and process properties on a resource.
    */
  var validationOptions: js.UndefOr[Schema$ValidationOptions] = js.native
}

object Schema$Options {
  @scala.inline
  def apply(
    asyncOptions: js.Array[Schema$AsyncOptions] = null,
    inputMappings: js.Array[Schema$InputMapping] = null,
    nameProperty: String = null,
    validationOptions: Schema$ValidationOptions = null
  ): Schema$Options = {
    val __obj = js.Dynamic.literal()
    if (asyncOptions != null) __obj.updateDynamic("asyncOptions")(asyncOptions.asInstanceOf[js.Any])
    if (inputMappings != null) __obj.updateDynamic("inputMappings")(inputMappings.asInstanceOf[js.Any])
    if (nameProperty != null) __obj.updateDynamic("nameProperty")(nameProperty.asInstanceOf[js.Any])
    if (validationOptions != null) __obj.updateDynamic("validationOptions")(validationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Options]
  }
}

