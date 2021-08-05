package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseLegacySql extends StObject {
  
  var useLegacySql: js.UndefOr[Boolean] = js.undefined
}
object UseLegacySql {
  
  inline def apply(): UseLegacySql = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseLegacySql]
  }
  
  extension [Self <: UseLegacySql](x: Self) {
    
    inline def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
    
    inline def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
  }
}
