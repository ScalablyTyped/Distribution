package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSavedQuery extends StObject {
  
  /**
    * The query content.
    */
  var content: js.UndefOr[SchemaQueryContent] = js.undefined
  
  /**
    * Output only. The create time of this saved query.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The account's email address who has created this saved query.
    */
  var creator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The description of this saved query. This value should be fewer than 255 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels applied on the resource. This value should not contain more than 10 entries. The key and value of each entry must be non-empty and fewer than 64 characters.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The last update time of this saved query.
    */
  var lastUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The account's email address who has updated this saved query most recently.
    */
  var lastUpdater: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the saved query. The format must be: * projects/project_number/savedQueries/saved_query_id * folders/folder_number/savedQueries/saved_query_id * organizations/organization_number/savedQueries/saved_query_id
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaSavedQuery {
  
  inline def apply(): SchemaSavedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedQuery]
  }
  
  extension [Self <: SchemaSavedQuery](x: Self) {
    
    inline def setContent(value: SchemaQueryContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorNull: Self = StObject.set(x, "creator", null)
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeNull: Self = StObject.set(x, "lastUpdateTime", null)
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setLastUpdater(value: String): Self = StObject.set(x, "lastUpdater", value.asInstanceOf[js.Any])
    
    inline def setLastUpdaterNull: Self = StObject.set(x, "lastUpdater", null)
    
    inline def setLastUpdaterUndefined: Self = StObject.set(x, "lastUpdater", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
