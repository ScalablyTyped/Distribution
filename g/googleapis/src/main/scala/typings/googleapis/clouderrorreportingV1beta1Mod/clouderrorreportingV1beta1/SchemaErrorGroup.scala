package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of a group of similar error events.
  */
@js.native
trait SchemaErrorGroup extends js.Object {
  
  /**
    * Group IDs are unique for a given project. If the same kind of error
    * occurs in different service contexts, it will receive the same group ID.
    */
  var groupId: js.UndefOr[String] = js.native
  
  /**
    * The group resource name. Example:
    * &lt;code&gt;projects/my-project-123/groups/my-groupid&lt;/code&gt;
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Associated tracking issues.
    */
  var trackingIssues: js.UndefOr[js.Array[SchemaTrackingIssue]] = js.native
}
object SchemaErrorGroup {
  
  @scala.inline
  def apply(): SchemaErrorGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorGroup]
  }
  
  @scala.inline
  implicit class SchemaErrorGroupOps[Self <: SchemaErrorGroup] (val x: Self) extends AnyVal {
    
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
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTrackingIssuesVarargs(value: SchemaTrackingIssue*): Self = this.set("trackingIssues", js.Array(value :_*))
    
    @scala.inline
    def setTrackingIssues(value: js.Array[SchemaTrackingIssue]): Self = this.set("trackingIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingIssues: Self = this.set("trackingIssues", js.undefined)
  }
}
