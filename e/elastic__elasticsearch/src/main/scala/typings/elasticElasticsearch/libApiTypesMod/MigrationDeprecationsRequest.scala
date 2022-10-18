package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationDeprecationsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var index: js.UndefOr[IndexName] = js.undefined
}
object MigrationDeprecationsRequest {
  
  inline def apply(): MigrationDeprecationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationDeprecationsRequest]
  }
  
  extension [Self <: MigrationDeprecationsRequest](x: Self) {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
