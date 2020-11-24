package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Lien represents an encumbrance on the actions that can be performed on a
  * resource.
  */
@js.native
trait SchemaLien extends js.Object {
  
  /**
    * The creation time of this Lien.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * A system-generated unique identifier for this Lien.  Example:
    * `liens/1234abcd`
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A stable, user-visible/meaningful string identifying the origin of the
    * Lien, intended to be inspected programmatically. Maximum length of 200
    * characters.  Example: &#39;compute.googleapis.com&#39;
    */
  var origin: js.UndefOr[String] = js.native
  
  /**
    * A reference to the resource this Lien is attached to. The server will
    * validate the parent against those for which Liens are supported. Example:
    * `projects/1234`
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Concise user-visible strings indicating why an action cannot be performed
    * on a resource. Maximum length of 200 characters.  Example: &#39;Holds
    * production API key&#39;
    */
  var reason: js.UndefOr[String] = js.native
  
  /**
    * The types of operations which should be blocked as a result of this Lien.
    * Each value should correspond to an IAM permission. The server will
    * validate the permissions against those for which Liens are supported.  An
    * empty list is meaningless and will be rejected.  Example:
    * [&#39;resourcemanager.projects.delete&#39;]
    */
  var restrictions: js.UndefOr[js.Array[String]] = js.native
}
object SchemaLien {
  
  @scala.inline
  def apply(): SchemaLien = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLien]
  }
  
  @scala.inline
  implicit class SchemaLienOps[Self <: SchemaLien] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setRestrictionsVarargs(value: String*): Self = this.set("restrictions", js.Array(value :_*))
    
    @scala.inline
    def setRestrictions(value: js.Array[String]): Self = this.set("restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictions: Self = this.set("restrictions", js.undefined)
  }
}
