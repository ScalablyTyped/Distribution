package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessApprovalSettings extends StObject {
  
  /**
    * The asymmetric crypto key version to use for signing approval requests. Empty active_key_version indicates that a Google-managed key should be used for signing. This property will be ignored if set by an ancestor of this resource, and new non-empty values may not be set.
    */
  var activeKeyVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. This field is read only (not settable via UpdateAccessApprovalSettings method). If the field is true, that indicates that an ancestor of this Project or Folder has set active_key_version (this field will always be unset for the organization since organizations do not have ancestors).
    */
  var ancestorHasActiveKeyVersion: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. This field is read only (not settable via UpdateAccessApprovalSettings method). If the field is true, that indicates that at least one service is enrolled for Access Approval in one or more ancestors of the Project or Folder (this field will always be unset for the organization since organizations do not have ancestors).
    */
  var enrolledAncestor: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A list of Google Cloud Services for which the given resource has Access Approval enrolled. Access requests for the resource given by name against any of these services contained here will be required to have explicit approval. If name refers to an organization, enrollment can be done for individual services. If name refers to a folder or project, enrollment can only be done on an all or nothing basis. If a cloud_product is repeated in this list, the first entry will be honored and all following entries will be discarded. A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
    */
  var enrolledServices: js.UndefOr[js.Array[SchemaEnrolledService]] = js.undefined
  
  /**
    * Output only. This field is read only (not settable via UpdateAccessApprovalSettings method). If the field is true, that indicates that there is some configuration issue with the active_key_version configured at this level in the resource hierarchy (e.g. it doesn't exist or the Access Approval service account doesn't have the correct permissions on it, etc.) This key version is not necessarily the effective key version at this level, as key versions are inherited top-down.
    */
  var invalidKeyVersion: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The resource name of the settings. Format is one of: * "projects/{project\}/accessApprovalSettings" * "folders/{folder\}/accessApprovalSettings" * "organizations/{organization\}/accessApprovalSettings"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of email addresses to which notifications relating to approval requests should be sent. Notifications relating to a resource will be sent to all emails in the settings of ancestor resources of that resource. A maximum of 50 email addresses are allowed.
    */
  var notificationEmails: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAccessApprovalSettings {
  
  inline def apply(): SchemaAccessApprovalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessApprovalSettings]
  }
  
  extension [Self <: SchemaAccessApprovalSettings](x: Self) {
    
    inline def setActiveKeyVersion(value: String): Self = StObject.set(x, "activeKeyVersion", value.asInstanceOf[js.Any])
    
    inline def setActiveKeyVersionNull: Self = StObject.set(x, "activeKeyVersion", null)
    
    inline def setActiveKeyVersionUndefined: Self = StObject.set(x, "activeKeyVersion", js.undefined)
    
    inline def setAncestorHasActiveKeyVersion(value: Boolean): Self = StObject.set(x, "ancestorHasActiveKeyVersion", value.asInstanceOf[js.Any])
    
    inline def setAncestorHasActiveKeyVersionNull: Self = StObject.set(x, "ancestorHasActiveKeyVersion", null)
    
    inline def setAncestorHasActiveKeyVersionUndefined: Self = StObject.set(x, "ancestorHasActiveKeyVersion", js.undefined)
    
    inline def setEnrolledAncestor(value: Boolean): Self = StObject.set(x, "enrolledAncestor", value.asInstanceOf[js.Any])
    
    inline def setEnrolledAncestorNull: Self = StObject.set(x, "enrolledAncestor", null)
    
    inline def setEnrolledAncestorUndefined: Self = StObject.set(x, "enrolledAncestor", js.undefined)
    
    inline def setEnrolledServices(value: js.Array[SchemaEnrolledService]): Self = StObject.set(x, "enrolledServices", value.asInstanceOf[js.Any])
    
    inline def setEnrolledServicesUndefined: Self = StObject.set(x, "enrolledServices", js.undefined)
    
    inline def setEnrolledServicesVarargs(value: SchemaEnrolledService*): Self = StObject.set(x, "enrolledServices", js.Array(value*))
    
    inline def setInvalidKeyVersion(value: Boolean): Self = StObject.set(x, "invalidKeyVersion", value.asInstanceOf[js.Any])
    
    inline def setInvalidKeyVersionNull: Self = StObject.set(x, "invalidKeyVersion", null)
    
    inline def setInvalidKeyVersionUndefined: Self = StObject.set(x, "invalidKeyVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationEmails(value: js.Array[String]): Self = StObject.set(x, "notificationEmails", value.asInstanceOf[js.Any])
    
    inline def setNotificationEmailsNull: Self = StObject.set(x, "notificationEmails", null)
    
    inline def setNotificationEmailsUndefined: Self = StObject.set(x, "notificationEmails", js.undefined)
    
    inline def setNotificationEmailsVarargs(value: String*): Self = StObject.set(x, "notificationEmails", js.Array(value*))
  }
}
