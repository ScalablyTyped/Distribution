package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetprojectsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the projectSettings resource.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetprojectsettings {
  
  inline def apply(): ParamsResourceProjectsGetprojectsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetprojectsettings]
  }
  
  extension [Self <: ParamsResourceProjectsGetprojectsettings](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
