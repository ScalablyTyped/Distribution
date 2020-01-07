package typings.googleapis.buildSrcApisCloudresourcemanagerV1beta1Mod.cloudresourcemanager_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Project is a high-level Google Cloud Platform entity.  It is a container
  * for ACLs, APIs, App Engine Apps, VMs, and other Google Cloud Platform
  * resources.
  */
@js.native
trait Schema$Project extends js.Object {
  /**
    * Creation time.  Read-only.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The labels associated with this Project.  Label keys must be between 1
    * and 63 characters long and must conform to the following regular
    * expression: \[a-z\](\[-a-z0-9\]*\[a-z0-9\])?.  Label values must be
    * between 0 and 63 characters long and must conform to the regular
    * expression (\[a-z\](\[-a-z0-9\]*\[a-z0-9\])?)?. A label value can be
    * empty.  No more than 256 labels can be associated with a given resource.
    * Clients should store labels in a representation such as JSON that does
    * not depend on specific characters being disallowed.  Example:
    * &lt;code&gt;&quot;environment&quot; : &quot;dev&quot;&lt;/code&gt;
    * Read-write.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The Project lifecycle state.  Read-only.
    */
  var lifecycleState: js.UndefOr[String] = js.native
  /**
    * The optional user-assigned display name of the Project. When present it
    * must be between 4 to 30 characters. Allowed characters are: lowercase and
    * uppercase letters, numbers, hyphen, single-quote, double-quote, space,
    * and exclamation point.  Example: &lt;code&gt;My Project&lt;/code&gt;
    * Read-write.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An optional reference to a parent Resource.  Supported parent types
    * include &quot;organization&quot; and &quot;folder&quot;. Once set, the
    * parent cannot be cleared. The `parent` can be set on creation or using
    * the `UpdateProject` method; the end user must have the
    * `resourcemanager.projects.create` permission on the parent.  Read-write.
    */
  var parent: js.UndefOr[Schema$ResourceId] = js.native
  /**
    * The unique, user-assigned ID of the Project. It must be 6 to 30 lowercase
    * letters, digits, or hyphens. It must start with a letter. Trailing
    * hyphens are prohibited.  Example: &lt;code&gt;tokyo-rain-123&lt;/code&gt;
    * Read-only after creation.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The number uniquely identifying the project.  Example:
    * &lt;code&gt;415104041262&lt;/code&gt; Read-only.
    */
  var projectNumber: js.UndefOr[String] = js.native
}

object Schema$Project {
  @scala.inline
  def apply(
    createTime: String = null,
    labels: StringDictionary[String] = null,
    lifecycleState: String = null,
    name: String = null,
    parent: Schema$ResourceId = null,
    projectId: String = null,
    projectNumber: String = null
  ): Schema$Project = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (lifecycleState != null) __obj.updateDynamic("lifecycleState")(lifecycleState.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (projectNumber != null) __obj.updateDynamic("projectNumber")(projectNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Project]
  }
}

