package typings.forestExpressSequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionOptions extends StObject {
  
  var actions: js.UndefOr[js.Array[SmartActionOptions]] = js.undefined
  
  var fields: js.UndefOr[js.Array[SmartFieldOptions]] = js.undefined
  
  var segments: js.UndefOr[js.Array[SmartSegmentOptions]] = js.undefined
}
object CollectionOptions {
  
  @scala.inline
  def apply(): CollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionOptions]
  }
  
  @scala.inline
  implicit class CollectionOptionsMutableBuilder[Self <: CollectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[SmartActionOptions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: SmartActionOptions*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[SmartFieldOptions]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: SmartFieldOptions*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[SmartSegmentOptions]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: SmartSegmentOptions*): Self = StObject.set(x, "segments", js.Array(value :_*))
  }
}
