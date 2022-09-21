package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMachineimagesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the machine image.
    */
  var machineImage: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceMachineimagesGet {
  
  inline def apply(): ParamsResourceMachineimagesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMachineimagesGet]
  }
  
  extension [Self <: ParamsResourceMachineimagesGet](x: Self) {
    
    inline def setMachineImage(value: String): Self = StObject.set(x, "machineImage", value.asInstanceOf[js.Any])
    
    inline def setMachineImageUndefined: Self = StObject.set(x, "machineImage", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
