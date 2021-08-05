package typings.forestExpressMongoose.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionOptions extends StObject {
  
  var actions: js.UndefOr[js.Array[SmartActionOptions]] = js.undefined
  
  var fields: js.UndefOr[js.Array[SmartFieldOptions]] = js.undefined
  
  var segments: js.UndefOr[js.Array[SmartSegmentOptions]] = js.undefined
}
object CollectionOptions {
  
  inline def apply(): CollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionOptions]
  }
  
  extension [Self <: CollectionOptions](x: Self) {
    
    inline def setActions(value: js.Array[SmartActionOptions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: SmartActionOptions*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setFields(value: js.Array[SmartFieldOptions]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SmartFieldOptions*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setSegments(value: js.Array[SmartSegmentOptions]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: SmartSegmentOptions*): Self = StObject.set(x, "segments", js.Array(value :_*))
  }
}
