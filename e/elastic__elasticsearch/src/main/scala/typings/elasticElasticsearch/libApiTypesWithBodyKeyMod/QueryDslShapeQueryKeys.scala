package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslShapeQueryKeys
  extends StObject
     with QueryDslQueryBase {
  
  var ignore_unmapped: js.UndefOr[Boolean] = js.undefined
}
object QueryDslShapeQueryKeys {
  
  inline def apply(): QueryDslShapeQueryKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslShapeQueryKeys]
  }
  
  extension [Self <: QueryDslShapeQueryKeys](x: Self) {
    
    inline def setIgnore_unmapped(value: Boolean): Self = StObject.set(x, "ignore_unmapped", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unmappedUndefined: Self = StObject.set(x, "ignore_unmapped", js.undefined)
  }
}
