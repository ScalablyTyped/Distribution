package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Instance Template resource. (== resource_for beta.instanceTemplates ==)
  * (== resource_for v1.instanceTemplates ==)
  */
@js.native
trait SchemaInstanceTemplate extends js.Object {
  /**
    * [Output Only] The creation timestamp for this instance template in
    * RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] A unique identifier for this instance template. The server
    * defines this identifier.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] The resource type, which is always compute#instanceTemplate
    * for instance templates.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource; provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The instance properties for this instance template.
    */
  var properties: js.UndefOr[SchemaInstanceProperties] = js.native
  /**
    * [Output Only] The URL for this instance template. The server defines this
    * URL.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The source instance used to create the template. You can provide this as
    * a partial or full URL to the resource. For example, the following are
    * valid values:   -
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance
    * - projects/project/zones/zone/instances/instance
    */
  var sourceInstance: js.UndefOr[String] = js.native
  /**
    * The source instance params to use to create this instance template.
    */
  var sourceInstanceParams: js.UndefOr[SchemaSourceInstanceParams] = js.native
}

object SchemaInstanceTemplate {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    properties: SchemaInstanceProperties = null,
    selfLink: String = null,
    sourceInstance: String = null,
    sourceInstanceParams: SchemaSourceInstanceParams = null
  ): SchemaInstanceTemplate = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (sourceInstance != null) __obj.updateDynamic("sourceInstance")(sourceInstance.asInstanceOf[js.Any])
    if (sourceInstanceParams != null) __obj.updateDynamic("sourceInstanceParams")(sourceInstanceParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceTemplate]
  }
}

