package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRepositoriesMavenartifactsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the maven artifact.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRepositoriesMavenartifactsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsRepositoriesMavenartifactsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRepositoriesMavenartifactsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRepositoriesMavenartifactsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
