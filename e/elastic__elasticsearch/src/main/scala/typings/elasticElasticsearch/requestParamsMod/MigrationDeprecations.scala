package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationDeprecations
  extends StObject
     with Generic {
  
  var index: js.UndefOr[String] = js.undefined
}
object MigrationDeprecations {
  
  inline def apply(): MigrationDeprecations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationDeprecations]
  }
  
  extension [Self <: MigrationDeprecations](x: Self) {
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
