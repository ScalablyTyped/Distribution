package typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPoolOption extends StObject {
  
  /**
    * The `WorkerPool` resource to execute the build on. You must have `cloudbuild.workerpools.use` on the project hosting the WorkerPool. Format projects/{project\}/locations/{location\}/workerPools/{workerPoolId\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaPoolOption {
  
  inline def apply(): SchemaPoolOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoolOption]
  }
  
  extension [Self <: SchemaPoolOption](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
