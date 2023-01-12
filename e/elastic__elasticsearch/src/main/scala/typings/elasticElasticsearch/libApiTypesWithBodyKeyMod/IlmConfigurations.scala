package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmConfigurations extends StObject {
  
  var forcemerge: js.UndefOr[IlmForceMergeConfiguration] = js.undefined
  
  var rollover: js.UndefOr[IndicesRolloverRolloverConditions] = js.undefined
  
  var shrink: js.UndefOr[IlmShrinkConfiguration] = js.undefined
}
object IlmConfigurations {
  
  inline def apply(): IlmConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IlmConfigurations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IlmConfigurations] (val x: Self) extends AnyVal {
    
    inline def setForcemerge(value: IlmForceMergeConfiguration): Self = StObject.set(x, "forcemerge", value.asInstanceOf[js.Any])
    
    inline def setForcemergeUndefined: Self = StObject.set(x, "forcemerge", js.undefined)
    
    inline def setRollover(value: IndicesRolloverRolloverConditions): Self = StObject.set(x, "rollover", value.asInstanceOf[js.Any])
    
    inline def setRolloverUndefined: Self = StObject.set(x, "rollover", js.undefined)
    
    inline def setShrink(value: IlmShrinkConfiguration): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
    
    inline def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
  }
}
