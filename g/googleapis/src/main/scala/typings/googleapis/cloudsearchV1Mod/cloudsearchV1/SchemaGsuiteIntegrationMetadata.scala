package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGsuiteIntegrationMetadata extends StObject {
  
  var activityFeedData: js.UndefOr[SchemaAppsDynamiteSharedActivityFeedAnnotationData] = js.undefined
  
  var assistantData: js.UndefOr[SchemaAppsDynamiteSharedAssistantAnnotationData] = js.undefined
  
  var calendarEventData: js.UndefOr[SchemaAppsDynamiteSharedCalendarEventAnnotationData] = js.undefined
  
  /**
    * Data used to render call artifacts.
    */
  var callData: js.UndefOr[SchemaAppsDynamiteSharedCallAnnotationData] = js.undefined
  
  var clientType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of all strings that are to be indexed for this 1P chip. Each string in this list would be the contents of a single string field in the 1P chip. Eg. For Tasks[title = “hello world”, description = “good bye”]. If we want to index only the title, this would be set to [“hello world”]. If both title and description, then this would be [“hello world”, “good bye”]. Please make sure that the contents of this field is a subset of strings that are rendered as part of the 1P Chip.
    */
  var indexableTexts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var tasksData: js.UndefOr[SchemaAppsDynamiteSharedTasksAnnotationData] = js.undefined
}
object SchemaGsuiteIntegrationMetadata {
  
  inline def apply(): SchemaGsuiteIntegrationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGsuiteIntegrationMetadata]
  }
  
  extension [Self <: SchemaGsuiteIntegrationMetadata](x: Self) {
    
    inline def setActivityFeedData(value: SchemaAppsDynamiteSharedActivityFeedAnnotationData): Self = StObject.set(x, "activityFeedData", value.asInstanceOf[js.Any])
    
    inline def setActivityFeedDataUndefined: Self = StObject.set(x, "activityFeedData", js.undefined)
    
    inline def setAssistantData(value: SchemaAppsDynamiteSharedAssistantAnnotationData): Self = StObject.set(x, "assistantData", value.asInstanceOf[js.Any])
    
    inline def setAssistantDataUndefined: Self = StObject.set(x, "assistantData", js.undefined)
    
    inline def setCalendarEventData(value: SchemaAppsDynamiteSharedCalendarEventAnnotationData): Self = StObject.set(x, "calendarEventData", value.asInstanceOf[js.Any])
    
    inline def setCalendarEventDataUndefined: Self = StObject.set(x, "calendarEventData", js.undefined)
    
    inline def setCallData(value: SchemaAppsDynamiteSharedCallAnnotationData): Self = StObject.set(x, "callData", value.asInstanceOf[js.Any])
    
    inline def setCallDataUndefined: Self = StObject.set(x, "callData", js.undefined)
    
    inline def setClientType(value: String): Self = StObject.set(x, "clientType", value.asInstanceOf[js.Any])
    
    inline def setClientTypeNull: Self = StObject.set(x, "clientType", null)
    
    inline def setClientTypeUndefined: Self = StObject.set(x, "clientType", js.undefined)
    
    inline def setIndexableTexts(value: js.Array[String]): Self = StObject.set(x, "indexableTexts", value.asInstanceOf[js.Any])
    
    inline def setIndexableTextsNull: Self = StObject.set(x, "indexableTexts", null)
    
    inline def setIndexableTextsUndefined: Self = StObject.set(x, "indexableTexts", js.undefined)
    
    inline def setIndexableTextsVarargs(value: String*): Self = StObject.set(x, "indexableTexts", js.Array(value*))
    
    inline def setTasksData(value: SchemaAppsDynamiteSharedTasksAnnotationData): Self = StObject.set(x, "tasksData", value.asInstanceOf[js.Any])
    
    inline def setTasksDataUndefined: Self = StObject.set(x, "tasksData", js.undefined)
  }
}
