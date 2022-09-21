package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChatContentExtension extends StObject {
  
  /**
    * Annotations to decorate this event.
    */
  var annotation: js.UndefOr[js.Array[SchemaEventAnnotation]] = js.undefined
  
  /**
    * This metadata informs how the placeholder string will be localized dynamically in Hangouts. See go/localization-of-system-messages. This is only used as part of REGULAR_CHAT_MESSAGE events.
    */
  var dynamitePlaceholderMetadata: js.UndefOr[SchemaChatConserverDynamitePlaceholderMetadata] = js.undefined
  
  /**
    * Is this event OnTR or OffTR? Since some events can be ON_THE_RECORD and have an expiration_timestamp (for example enterprise retention users) we need to store the otr status.
    */
  var eventOtrStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Group-link sharing toggle event.
    */
  var groupLinkSharingModificationEvent: js.UndefOr[SchemaGroupLinkSharingModificationEvent] = js.undefined
  
  /**
    * Audio/video Hangout event.
    */
  var hangoutEvent: js.UndefOr[SchemaHangoutEvent] = js.undefined
  
  /**
    * Invite accepted events. Note: this is only used ephemerally to sync to Gmail. No actual cent is stored in Papyrus.
    */
  var inviteAcceptedEvent: js.UndefOr[SchemaInviteAcceptedEvent] = js.undefined
  
  /**
    * Join/leave events.
    */
  var membershipChangeEvent: js.UndefOr[SchemaMembershipChangeEvent] = js.undefined
  
  /**
    * Metadata for off-the-record message.
    */
  var otrChatMessageEvent: js.UndefOr[SchemaOtrChatMessageEvent] = js.undefined
  
  var otrModificationEvent: js.UndefOr[SchemaOtrModificationEvent] = js.undefined
  
  var renameEvent: js.UndefOr[SchemaRenameEvent] = js.undefined
}
object SchemaChatContentExtension {
  
  inline def apply(): SchemaChatContentExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChatContentExtension]
  }
  
  extension [Self <: SchemaChatContentExtension](x: Self) {
    
    inline def setAnnotation(value: js.Array[SchemaEventAnnotation]): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
    
    inline def setAnnotationVarargs(value: SchemaEventAnnotation*): Self = StObject.set(x, "annotation", js.Array(value*))
    
    inline def setDynamitePlaceholderMetadata(value: SchemaChatConserverDynamitePlaceholderMetadata): Self = StObject.set(x, "dynamitePlaceholderMetadata", value.asInstanceOf[js.Any])
    
    inline def setDynamitePlaceholderMetadataUndefined: Self = StObject.set(x, "dynamitePlaceholderMetadata", js.undefined)
    
    inline def setEventOtrStatus(value: String): Self = StObject.set(x, "eventOtrStatus", value.asInstanceOf[js.Any])
    
    inline def setEventOtrStatusNull: Self = StObject.set(x, "eventOtrStatus", null)
    
    inline def setEventOtrStatusUndefined: Self = StObject.set(x, "eventOtrStatus", js.undefined)
    
    inline def setGroupLinkSharingModificationEvent(value: SchemaGroupLinkSharingModificationEvent): Self = StObject.set(x, "groupLinkSharingModificationEvent", value.asInstanceOf[js.Any])
    
    inline def setGroupLinkSharingModificationEventUndefined: Self = StObject.set(x, "groupLinkSharingModificationEvent", js.undefined)
    
    inline def setHangoutEvent(value: SchemaHangoutEvent): Self = StObject.set(x, "hangoutEvent", value.asInstanceOf[js.Any])
    
    inline def setHangoutEventUndefined: Self = StObject.set(x, "hangoutEvent", js.undefined)
    
    inline def setInviteAcceptedEvent(value: SchemaInviteAcceptedEvent): Self = StObject.set(x, "inviteAcceptedEvent", value.asInstanceOf[js.Any])
    
    inline def setInviteAcceptedEventUndefined: Self = StObject.set(x, "inviteAcceptedEvent", js.undefined)
    
    inline def setMembershipChangeEvent(value: SchemaMembershipChangeEvent): Self = StObject.set(x, "membershipChangeEvent", value.asInstanceOf[js.Any])
    
    inline def setMembershipChangeEventUndefined: Self = StObject.set(x, "membershipChangeEvent", js.undefined)
    
    inline def setOtrChatMessageEvent(value: SchemaOtrChatMessageEvent): Self = StObject.set(x, "otrChatMessageEvent", value.asInstanceOf[js.Any])
    
    inline def setOtrChatMessageEventUndefined: Self = StObject.set(x, "otrChatMessageEvent", js.undefined)
    
    inline def setOtrModificationEvent(value: SchemaOtrModificationEvent): Self = StObject.set(x, "otrModificationEvent", value.asInstanceOf[js.Any])
    
    inline def setOtrModificationEventUndefined: Self = StObject.set(x, "otrModificationEvent", js.undefined)
    
    inline def setRenameEvent(value: SchemaRenameEvent): Self = StObject.set(x, "renameEvent", value.asInstanceOf[js.Any])
    
    inline def setRenameEventUndefined: Self = StObject.set(x, "renameEvent", js.undefined)
  }
}
