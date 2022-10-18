package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSearchIdle extends StObject {
  
  var after: js.UndefOr[Duration] = js.undefined
}
object IndicesSearchIdle {
  
  inline def apply(): IndicesSearchIdle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesSearchIdle]
  }
  
  extension [Self <: IndicesSearchIdle](x: Self) {
    
    inline def setAfter(value: Duration): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
  }
}
