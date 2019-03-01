package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  /**
    * Creation time.
    *
    * Read-only.
    */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The labels associated with this Project.
    *
    * Label keys must be between 1 and 63 characters long and must conform
    * to the following regular expression: \[a-z\](\[-a-z0-9\]&#42;\[a-z0-9\])?.
    *
    * Label values must be between 0 and 63 characters long and must conform
    * to the regular expression (\[a-z\](\[-a-z0-9\]&#42;\[a-z0-9\])?)?.
    *
    * No more than 256 labels can be associated with a given resource.
    *
    * Clients should store labels in a representation such as JSON that does not
    * depend on specific characters being disallowed.
    *
    * Example: <code>"environment" : "dev"</code>
    * Read-write.
    */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
    * The Project lifecycle state.
    *
    * Read-only.
    */
  var lifecycleState: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user-assigned display name of the Project.
    * It must be 4 to 30 characters.
    * Allowed characters are: lowercase and uppercase letters, numbers,
    * hyphen, single-quote, double-quote, space, and exclamation point.
    *
    * Example: <code>My Project</code>
    * Read-write.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An optional reference to a parent Resource.
    *
    * The only supported parent type is "organization". Once set, the parent
    * cannot be modified. The `parent` can be set on creation or using the
    * `UpdateProject` method; the end user must have the
    * `resourcemanager.projects.create` permission on the parent.
    *
    * Read-write.
    */
  var parent: js.UndefOr[ResourceId] = js.undefined
  /**
    * The unique, user-assigned ID of the Project.
    * It must be 6 to 30 lowercase letters, digits, or hyphens.
    * It must start with a letter.
    * Trailing hyphens are prohibited.
    *
    * Example: <code>tokyo-rain-123</code>
    * Read-only after creation.
    */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number uniquely identifying the project.
    *
    * Example: <code>415104041262</code>
    * Read-only.
    */
  var projectNumber: js.UndefOr[java.lang.String] = js.undefined
}

object Project {
  @scala.inline
  def apply(
    createTime: java.lang.String = null,
    labels: stdLib.Record[java.lang.String, java.lang.String] = null,
    lifecycleState: java.lang.String = null,
    name: java.lang.String = null,
    parent: ResourceId = null,
    projectId: java.lang.String = null,
    projectNumber: java.lang.String = null
  ): Project = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (lifecycleState != null) __obj.updateDynamic("lifecycleState")(lifecycleState)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (projectNumber != null) __obj.updateDynamic("projectNumber")(projectNumber)
    __obj.asInstanceOf[Project]
  }
}

