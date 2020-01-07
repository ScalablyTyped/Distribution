package typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type provider that describes a service-backed Type.
  */
@js.native
trait Schema$TypeProvider extends js.Object {
  /**
    * Allows resource handling overrides for specific collections
    */
  var collectionOverrides: js.UndefOr[js.Array[Schema$CollectionOverride]] = js.native
  /**
    * Credential used when interacting with this type.
    */
  var credential: js.UndefOr[Schema$Credential] = js.native
  /**
    * An optional textual description of the resource; provided by the client
    * when the resource is created.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Descriptor Url for the this type provider.
    */
  var descriptorUrl: js.UndefOr[String] = js.native
  /**
    * Output only. Unique identifier for the resource defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. Creation timestamp in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.native
  /**
    * Map of labels; provided by the client when the resource is created or
    * updated. Specifically: Label keys must be between 1 and 63 characters
    * long and must conform to the following regular expression:
    * [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63
    * characters long and must conform to the regular expression
    * ([a-z]([-a-z0-9]*[a-z0-9])?)?
    */
  var labels: js.UndefOr[js.Array[Schema$TypeProviderLabelEntry]] = js.native
  /**
    * Name of the resource; provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The Operation that most recently ran, or is currently
    * running, on this type provider.
    */
  var operation: js.UndefOr[Schema$Operation] = js.native
  /**
    * Options to apply when handling any resources in this service.
    */
  var options: js.UndefOr[Schema$Options] = js.native
  /**
    * Output only. Self link for the type provider.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object Schema$TypeProvider {
  @scala.inline
  def apply(
    collectionOverrides: js.Array[Schema$CollectionOverride] = null,
    credential: Schema$Credential = null,
    description: String = null,
    descriptorUrl: String = null,
    id: String = null,
    insertTime: String = null,
    labels: js.Array[Schema$TypeProviderLabelEntry] = null,
    name: String = null,
    operation: Schema$Operation = null,
    options: Schema$Options = null,
    selfLink: String = null
  ): Schema$TypeProvider = {
    val __obj = js.Dynamic.literal()
    if (collectionOverrides != null) __obj.updateDynamic("collectionOverrides")(collectionOverrides.asInstanceOf[js.Any])
    if (credential != null) __obj.updateDynamic("credential")(credential.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (descriptorUrl != null) __obj.updateDynamic("descriptorUrl")(descriptorUrl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TypeProvider]
  }
}

