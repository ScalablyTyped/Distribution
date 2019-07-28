package typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitoredResourceDescriptor extends js.Object {
  /** Optional. A detailed description of the monitored resource type that might be used in documentation. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Optional. A concise name for the monitored resource type that might be displayed in user interfaces. It should be a Title Cased Noun Phrase, without
    * any article or other determiners. For example, "Google Cloud SQL Database".
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Required. A set of labels used to describe instances of this monitored resource type. For example, an individual Google Cloud SQL database is
    * identified by values for the labels "database_id" and "zone".
    */
  var labels: js.UndefOr[js.Array[LabelDescriptor]] = js.undefined
  /**
    * Optional. The resource name of the monitored resource descriptor: "projects/{project_id}/monitoredResourceDescriptors/{type}" where {type} is the value
    * of the type field in this object and {project_id} is a project ID that provides API-specific context for accessing the type. APIs that do not use
    * project information can use the resource name format "monitoredResourceDescriptors/{type}".
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Required. The monitored resource type. For example, the type "cloudsql_database" represents databases in Google Cloud SQL. The maximum length of this
    * value is 256 characters.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object MonitoredResourceDescriptor {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    labels: js.Array[LabelDescriptor] = null,
    name: String = null,
    `type`: String = null
  ): MonitoredResourceDescriptor = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MonitoredResourceDescriptor]
  }
}

