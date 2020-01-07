package typings.googleapis.buildSrcApisServicenetworkingV1Mod.servicenetworking_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that describes the schema of a MonitoredResource object using a
  * type name and a set of labels.  For example, the monitored resource
  * descriptor for Google Compute Engine VM instances has a type of
  * `&quot;gce_instance&quot;` and specifies the use of the labels
  * `&quot;instance_id&quot;` and `&quot;zone&quot;` to identify particular VM
  * instances.  Different APIs can support different monitored resource types.
  * APIs generally provide a `list` method that returns the monitored resource
  * descriptors used by the API.
  */
@js.native
trait Schema$MonitoredResourceDescriptor extends js.Object {
  /**
    * Optional. A detailed description of the monitored resource type that
    * might be used in documentation.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Optional. A concise name for the monitored resource type that might be
    * displayed in user interfaces. It should be a Title Cased Noun Phrase,
    * without any article or other determiners. For example, `&quot;Google
    * Cloud SQL Database&quot;`.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Required. A set of labels used to describe instances of this monitored
    * resource type. For example, an individual Google Cloud SQL database is
    * identified by values for the labels `&quot;database_id&quot;` and
    * `&quot;zone&quot;`.
    */
  var labels: js.UndefOr[js.Array[Schema$LabelDescriptor]] = js.native
  /**
    * Optional. The resource name of the monitored resource descriptor:
    * `&quot;projects/{project_id}/monitoredResourceDescriptors/{type}&quot;`
    * where {type} is the value of the `type` field in this object and
    * {project_id} is a project ID that provides API-specific context for
    * accessing the type.  APIs that do not use project information can use the
    * resource name format `&quot;monitoredResourceDescriptors/{type}&quot;`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Required. The monitored resource type. For example, the type
    * `&quot;cloudsql_database&quot;` represents databases in Google Cloud SQL.
    * The maximum length of this value is 256 characters.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$MonitoredResourceDescriptor {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    labels: js.Array[Schema$LabelDescriptor] = null,
    name: String = null,
    `type`: String = null
  ): Schema$MonitoredResourceDescriptor = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MonitoredResourceDescriptor]
  }
}

