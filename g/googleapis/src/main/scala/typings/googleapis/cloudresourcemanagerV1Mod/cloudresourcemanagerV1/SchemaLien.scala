package typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Lien represents an encumbrance on the actions that can be performed on a
  * resource.
  */
trait SchemaLien extends StObject {
  
  /**
    * The creation time of this Lien.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * A system-generated unique identifier for this Lien.  Example:
    * `liens/1234abcd`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A stable, user-visible/meaningful string identifying the origin of the
    * Lien, intended to be inspected programmatically. Maximum length of 200
    * characters.  Example: &#39;compute.googleapis.com&#39;
    */
  var origin: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to the resource this Lien is attached to. The server will
    * validate the parent against those for which Liens are supported. Example:
    * `projects/1234`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Concise user-visible strings indicating why an action cannot be performed
    * on a resource. Maximum length of 200 characters.  Example: &#39;Holds
    * production API key&#39;
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The types of operations which should be blocked as a result of this Lien.
    * Each value should correspond to an IAM permission. The server will
    * validate the permissions against those for which Liens are supported.  An
    * empty list is meaningless and will be rejected.  Example:
    * [&#39;resourcemanager.projects.delete&#39;]
    */
  var restrictions: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaLien {
  
  @scala.inline
  def apply(): SchemaLien = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLien]
  }
  
  @scala.inline
  implicit class SchemaLienMutableBuilder[Self <: SchemaLien] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setRestrictions(value: js.Array[String]): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    @scala.inline
    def setRestrictionsVarargs(value: String*): Self = StObject.set(x, "restrictions", js.Array(value :_*))
  }
}
