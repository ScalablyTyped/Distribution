package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Project is a high-level Google Cloud Platform entity.  It is a container
  * for ACLs, APIs, App Engine Apps, VMs, and other Google Cloud Platform
  * resources.
  */
@js.native
trait SchemaProject extends StObject {
  
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
  var parent: js.UndefOr[SchemaResourceId] = js.native
  
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
object SchemaProject {
  
  @scala.inline
  def apply(): SchemaProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProject]
  }
  
  @scala.inline
  implicit class SchemaProjectMutableBuilder[Self <: SchemaProject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLifecycleState(value: String): Self = StObject.set(x, "lifecycleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleStateUndefined: Self = StObject.set(x, "lifecycleState", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: SchemaResourceId): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
  }
}
