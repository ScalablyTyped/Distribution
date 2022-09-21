package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleOperations extends StObject {
  
  /**
    * The list of emails which correspond to the users directly affected by the incident.
    */
  var affectedUserEmails: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Application-specific data for an incident, provided when the Google Workspace application which reported the incident cannot be completely restored to a valid state.
    */
  var attachmentData: js.UndefOr[SchemaAttachment] = js.undefined
  
  /**
    * A detailed, freeform incident description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Customer domain for email template personalization.
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A header to display above the incident message. Typically used to attach a localized notice on the timeline for followup comms translations.
    */
  var header: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A one-line incident description.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleOperations {
  
  inline def apply(): SchemaGoogleOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleOperations]
  }
  
  extension [Self <: SchemaGoogleOperations](x: Self) {
    
    inline def setAffectedUserEmails(value: js.Array[String]): Self = StObject.set(x, "affectedUserEmails", value.asInstanceOf[js.Any])
    
    inline def setAffectedUserEmailsNull: Self = StObject.set(x, "affectedUserEmails", null)
    
    inline def setAffectedUserEmailsUndefined: Self = StObject.set(x, "affectedUserEmails", js.undefined)
    
    inline def setAffectedUserEmailsVarargs(value: String*): Self = StObject.set(x, "affectedUserEmails", js.Array(value*))
    
    inline def setAttachmentData(value: SchemaAttachment): Self = StObject.set(x, "attachmentData", value.asInstanceOf[js.Any])
    
    inline def setAttachmentDataUndefined: Self = StObject.set(x, "attachmentData", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderNull: Self = StObject.set(x, "header", null)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
