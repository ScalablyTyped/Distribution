package typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BaseType that describes a service-backed Type.
  */
@js.native
trait Schema$ConfigurableService extends js.Object {
  /**
    * Allows resource handling overrides for specific collections
    */
  var collectionOverrides: js.UndefOr[js.Array[Schema$CollectionOverride]] = js.native
  /**
    * Credential used when interacting with this type.
    */
  var credential: js.UndefOr[Schema$Credential] = js.native
  /**
    * Descriptor Url for the this type.
    */
  var descriptorUrl: js.UndefOr[String] = js.native
  /**
    * Options to apply when handling any resources in this service.
    */
  var options: js.UndefOr[Schema$Options] = js.native
}

object Schema$ConfigurableService {
  @scala.inline
  def apply(
    collectionOverrides: js.Array[Schema$CollectionOverride] = null,
    credential: Schema$Credential = null,
    descriptorUrl: String = null,
    options: Schema$Options = null
  ): Schema$ConfigurableService = {
    val __obj = js.Dynamic.literal()
    if (collectionOverrides != null) __obj.updateDynamic("collectionOverrides")(collectionOverrides.asInstanceOf[js.Any])
    if (credential != null) __obj.updateDynamic("credential")(credential.asInstanceOf[js.Any])
    if (descriptorUrl != null) __obj.updateDynamic("descriptorUrl")(descriptorUrl.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ConfigurableService]
  }
}

