package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptBase extends StObject {
  
  var params: js.UndefOr[Record[String, Any]] = js.undefined
}
object ScriptBase {
  
  inline def apply(): ScriptBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptBase]
  }
  
  extension [Self <: ScriptBase](x: Self) {
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
