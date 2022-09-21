package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBiEngineStatistics extends StObject {
  
  /**
    * [Output-only] Specifies which mode of BI Engine acceleration was performed (if any).
    */
  var biEngineMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * In case of DISABLED or PARTIAL bi_engine_mode, these contain the explanatory reasons as to why BI Engine could not accelerate. In case the full query was accelerated, this field is not populated.
    */
  var biEngineReasons: js.UndefOr[js.Array[SchemaBiEngineReason]] = js.undefined
}
object SchemaBiEngineStatistics {
  
  inline def apply(): SchemaBiEngineStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBiEngineStatistics]
  }
  
  extension [Self <: SchemaBiEngineStatistics](x: Self) {
    
    inline def setBiEngineMode(value: String): Self = StObject.set(x, "biEngineMode", value.asInstanceOf[js.Any])
    
    inline def setBiEngineModeNull: Self = StObject.set(x, "biEngineMode", null)
    
    inline def setBiEngineModeUndefined: Self = StObject.set(x, "biEngineMode", js.undefined)
    
    inline def setBiEngineReasons(value: js.Array[SchemaBiEngineReason]): Self = StObject.set(x, "biEngineReasons", value.asInstanceOf[js.Any])
    
    inline def setBiEngineReasonsUndefined: Self = StObject.set(x, "biEngineReasons", js.undefined)
    
    inline def setBiEngineReasonsVarargs(value: SchemaBiEngineReason*): Self = StObject.set(x, "biEngineReasons", js.Array(value*))
  }
}
