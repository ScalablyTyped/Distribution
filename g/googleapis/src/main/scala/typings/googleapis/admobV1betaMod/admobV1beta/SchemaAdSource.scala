package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdSource extends StObject {
  
  /**
    * ID of this ad source.
    */
  var adSourceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of this ad source. Format is: accounts/{publisher_id\}/adSources/{ad_source_id\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display name of this ad source.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdSource {
  
  inline def apply(): SchemaAdSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdSource]
  }
  
  extension [Self <: SchemaAdSource](x: Self) {
    
    inline def setAdSourceId(value: String): Self = StObject.set(x, "adSourceId", value.asInstanceOf[js.Any])
    
    inline def setAdSourceIdNull: Self = StObject.set(x, "adSourceId", null)
    
    inline def setAdSourceIdUndefined: Self = StObject.set(x, "adSourceId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
