package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBackendbucketsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the BackendBucket resource to return.
    */
  var backendBucket: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceBackendbucketsGet {
  
  inline def apply(): ParamsResourceBackendbucketsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBackendbucketsGet]
  }
  
  extension [Self <: ParamsResourceBackendbucketsGet](x: Self) {
    
    inline def setBackendBucket(value: String): Self = StObject.set(x, "backendBucket", value.asInstanceOf[js.Any])
    
    inline def setBackendBucketUndefined: Self = StObject.set(x, "backendBucket", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
