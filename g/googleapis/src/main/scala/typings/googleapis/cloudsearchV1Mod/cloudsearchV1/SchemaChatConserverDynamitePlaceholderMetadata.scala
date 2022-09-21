package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChatConserverDynamitePlaceholderMetadata extends StObject {
  
  var attachmentMetadata: js.UndefOr[SchemaChatConserverDynamitePlaceholderMetadataAttachmentMetadata] = js.undefined
  
  var botMessageMetadata: js.UndefOr[SchemaChatConserverDynamitePlaceholderMetadataBotMessageMetadata] = js.undefined
  
  var calendarEventMetadata: js.UndefOr[SchemaChatConserverDynamitePlaceholderMetadataCalendarEventMetadata] = js.undefined
  
  var deleteMetadata: js.UndefOr[SchemaChatConserverDynamitePlaceholderMetadataDeleteMetadata] = js.undefined
  
  var editMetadata: js.UndefOr[SchemaChatConserverDynamitePlaceholderMetadataEditMetadata] = js.undefined
  
  /**
    * The space URL embedded in the localized string.
    */
  var spaceUrl: js.UndefOr[String | Null] = js.undefined
  
  var tasksMetadata: js.UndefOr[SchemaChatConserverDynamitePlaceholderMetadataTasksMetadata] = js.undefined
  
  var videoCallMetadata: js.UndefOr[SchemaChatConserverDynamitePlaceholderMetadataVideoCallMetadata] = js.undefined
}
object SchemaChatConserverDynamitePlaceholderMetadata {
  
  inline def apply(): SchemaChatConserverDynamitePlaceholderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChatConserverDynamitePlaceholderMetadata]
  }
  
  extension [Self <: SchemaChatConserverDynamitePlaceholderMetadata](x: Self) {
    
    inline def setAttachmentMetadata(value: SchemaChatConserverDynamitePlaceholderMetadataAttachmentMetadata): Self = StObject.set(x, "attachmentMetadata", value.asInstanceOf[js.Any])
    
    inline def setAttachmentMetadataUndefined: Self = StObject.set(x, "attachmentMetadata", js.undefined)
    
    inline def setBotMessageMetadata(value: SchemaChatConserverDynamitePlaceholderMetadataBotMessageMetadata): Self = StObject.set(x, "botMessageMetadata", value.asInstanceOf[js.Any])
    
    inline def setBotMessageMetadataUndefined: Self = StObject.set(x, "botMessageMetadata", js.undefined)
    
    inline def setCalendarEventMetadata(value: SchemaChatConserverDynamitePlaceholderMetadataCalendarEventMetadata): Self = StObject.set(x, "calendarEventMetadata", value.asInstanceOf[js.Any])
    
    inline def setCalendarEventMetadataUndefined: Self = StObject.set(x, "calendarEventMetadata", js.undefined)
    
    inline def setDeleteMetadata(value: SchemaChatConserverDynamitePlaceholderMetadataDeleteMetadata): Self = StObject.set(x, "deleteMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeleteMetadataUndefined: Self = StObject.set(x, "deleteMetadata", js.undefined)
    
    inline def setEditMetadata(value: SchemaChatConserverDynamitePlaceholderMetadataEditMetadata): Self = StObject.set(x, "editMetadata", value.asInstanceOf[js.Any])
    
    inline def setEditMetadataUndefined: Self = StObject.set(x, "editMetadata", js.undefined)
    
    inline def setSpaceUrl(value: String): Self = StObject.set(x, "spaceUrl", value.asInstanceOf[js.Any])
    
    inline def setSpaceUrlNull: Self = StObject.set(x, "spaceUrl", null)
    
    inline def setSpaceUrlUndefined: Self = StObject.set(x, "spaceUrl", js.undefined)
    
    inline def setTasksMetadata(value: SchemaChatConserverDynamitePlaceholderMetadataTasksMetadata): Self = StObject.set(x, "tasksMetadata", value.asInstanceOf[js.Any])
    
    inline def setTasksMetadataUndefined: Self = StObject.set(x, "tasksMetadata", js.undefined)
    
    inline def setVideoCallMetadata(value: SchemaChatConserverDynamitePlaceholderMetadataVideoCallMetadata): Self = StObject.set(x, "videoCallMetadata", value.asInstanceOf[js.Any])
    
    inline def setVideoCallMetadataUndefined: Self = StObject.set(x, "videoCallMetadata", js.undefined)
  }
}
