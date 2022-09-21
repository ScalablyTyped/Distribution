package typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsWorkerpoolsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The field will contain name of the resource requested, for example: "projects/project-1/workerPools/workerpool-name"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsWorkerpoolsDelete {
  
  inline def apply(): ParamsResourceProjectsWorkerpoolsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsWorkerpoolsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsWorkerpoolsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
