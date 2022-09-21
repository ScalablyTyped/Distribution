package typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildOperationMetadata extends StObject {
  
  /**
    * The build that the operation is tracking.
    */
  var build: js.UndefOr[SchemaBuild] = js.undefined
}
object SchemaBuildOperationMetadata {
  
  inline def apply(): SchemaBuildOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildOperationMetadata]
  }
  
  extension [Self <: SchemaBuildOperationMetadata](x: Self) {
    
    inline def setBuild(value: SchemaBuild): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
  }
}
