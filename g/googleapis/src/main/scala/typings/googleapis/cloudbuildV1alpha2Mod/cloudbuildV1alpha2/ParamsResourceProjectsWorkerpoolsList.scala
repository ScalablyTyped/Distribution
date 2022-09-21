package typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsWorkerpoolsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent, which owns this collection of `WorkerPools`. Format: projects/{project\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsWorkerpoolsList {
  
  inline def apply(): ParamsResourceProjectsWorkerpoolsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsWorkerpoolsList]
  }
  
  extension [Self <: ParamsResourceProjectsWorkerpoolsList](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
