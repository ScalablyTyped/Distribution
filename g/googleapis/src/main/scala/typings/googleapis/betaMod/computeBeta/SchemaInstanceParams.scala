package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceParams extends StObject {
  
  /**
    * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id\}`, and values are in the format `tagValues/456`. The field is ignored (both PUT & PATCH) when empty.
    */
  var resourceManagerTags: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaInstanceParams {
  
  inline def apply(): SchemaInstanceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceParams]
  }
  
  extension [Self <: SchemaInstanceParams](x: Self) {
    
    inline def setResourceManagerTags(value: StringDictionary[String]): Self = StObject.set(x, "resourceManagerTags", value.asInstanceOf[js.Any])
    
    inline def setResourceManagerTagsNull: Self = StObject.set(x, "resourceManagerTags", null)
    
    inline def setResourceManagerTagsUndefined: Self = StObject.set(x, "resourceManagerTags", js.undefined)
  }
}
