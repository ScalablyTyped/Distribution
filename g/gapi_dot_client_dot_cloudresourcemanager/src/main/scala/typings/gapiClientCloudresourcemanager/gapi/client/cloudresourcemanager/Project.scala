package typings.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  /**
    * Creation time.
    *
    * Read-only.
    */
  var createTime: js.UndefOr[String] = js.native
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
  var labels: js.UndefOr[Record[String, String]] = js.native
  /**
    * The Project lifecycle state.
    *
    * Read-only.
    */
  var lifecycleState: js.UndefOr[String] = js.native
  /**
    * The user-assigned display name of the Project.
    * It must be 4 to 30 characters.
    * Allowed characters are: lowercase and uppercase letters, numbers,
    * hyphen, single-quote, double-quote, space, and exclamation point.
    *
    * Example: <code>My Project</code>
    * Read-write.
    */
  var name: js.UndefOr[String] = js.native
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
  var parent: js.UndefOr[ResourceId] = js.native
  /**
    * The unique, user-assigned ID of the Project.
    * It must be 6 to 30 lowercase letters, digits, or hyphens.
    * It must start with a letter.
    * Trailing hyphens are prohibited.
    *
    * Example: <code>tokyo-rain-123</code>
    * Read-only after creation.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The number uniquely identifying the project.
    *
    * Example: <code>415104041262</code>
    * Read-only.
    */
  var projectNumber: js.UndefOr[String] = js.native
}

object Project {
  @scala.inline
  def apply(): Project = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Project]
  }
  @scala.inline
  implicit class ProjectOps[Self <: Project] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setLifecycleState(value: String): Self = this.set("lifecycleState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleState: Self = this.set("lifecycleState", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParent(value: ResourceId): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setProjectNumber(value: String): Self = this.set("projectNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectNumber: Self = this.set("projectNumber", js.undefined)
  }
  
}

