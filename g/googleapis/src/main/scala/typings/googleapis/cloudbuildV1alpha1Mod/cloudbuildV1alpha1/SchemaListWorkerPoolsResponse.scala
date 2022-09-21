package typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListWorkerPoolsResponse extends StObject {
  
  /**
    * `WorkerPools` for the project.
    */
  var workerPools: js.UndefOr[js.Array[SchemaWorkerPool]] = js.undefined
}
object SchemaListWorkerPoolsResponse {
  
  inline def apply(): SchemaListWorkerPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWorkerPoolsResponse]
  }
  
  extension [Self <: SchemaListWorkerPoolsResponse](x: Self) {
    
    inline def setWorkerPools(value: js.Array[SchemaWorkerPool]): Self = StObject.set(x, "workerPools", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolsUndefined: Self = StObject.set(x, "workerPools", js.undefined)
    
    inline def setWorkerPoolsVarargs(value: SchemaWorkerPool*): Self = StObject.set(x, "workerPools", js.Array(value*))
  }
}
