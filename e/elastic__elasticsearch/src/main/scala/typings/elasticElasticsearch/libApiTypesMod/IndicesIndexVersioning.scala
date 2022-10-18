package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexVersioning extends StObject {
  
  var created: js.UndefOr[VersionString] = js.undefined
}
object IndicesIndexVersioning {
  
  inline def apply(): IndicesIndexVersioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesIndexVersioning]
  }
  
  extension [Self <: IndicesIndexVersioning](x: Self) {
    
    inline def setCreated(value: VersionString): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
  }
}
