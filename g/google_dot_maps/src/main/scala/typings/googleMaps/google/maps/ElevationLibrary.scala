package typings.googleMaps.google.maps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationLibrary extends StObject {
  
  var ElevationService: Instantiable0[typings.googleMaps.google.maps.ElevationService]
  
  var ElevationStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.ElevationStatus */ Any
}
object ElevationLibrary {
  
  inline def apply(
    ElevationService: Instantiable0[ElevationService],
    ElevationStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.ElevationStatus */ Any
  ): ElevationLibrary = {
    val __obj = js.Dynamic.literal(ElevationService = ElevationService.asInstanceOf[js.Any], ElevationStatus = ElevationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationLibrary] (val x: Self) extends AnyVal {
    
    inline def setElevationService(value: Instantiable0[ElevationService]): Self = StObject.set(x, "ElevationService", value.asInstanceOf[js.Any])
    
    inline def setElevationStatus(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.ElevationStatus */ Any
    ): Self = StObject.set(x, "ElevationStatus", value.asInstanceOf[js.Any])
  }
}
