package typings.googleMaps.google.maps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.googleMaps.anon.TypeofOverlayView
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreetViewLibrary extends StObject {
  
  var InfoWindow: Instantiable1[
    /* opts */ js.UndefOr[InfoWindowOptions | Null], 
    typings.googleMaps.google.maps.InfoWindow
  ]
  
  var OverlayView: TypeofOverlayView
  
  var StreetViewCoverageLayer: Instantiable0[typings.googleMaps.google.maps.StreetViewCoverageLayer]
  
  var StreetViewPanorama: Instantiable2[
    /* container */ HTMLElement, 
    /* opts */ js.UndefOr[StreetViewPanoramaOptions | Null], 
    typings.googleMaps.google.maps.StreetViewPanorama
  ]
  
  var StreetViewPreference: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.StreetViewPreference */ Any
  
  var StreetViewService: Instantiable0[typings.googleMaps.google.maps.StreetViewService]
  
  var StreetViewSource: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.StreetViewSource */ Any
  
  var StreetViewStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.StreetViewStatus */ Any
}
object StreetViewLibrary {
  
  inline def apply(
    InfoWindow: Instantiable1[/* opts */ js.UndefOr[InfoWindowOptions | Null], InfoWindow],
    OverlayView: TypeofOverlayView,
    StreetViewCoverageLayer: Instantiable0[StreetViewCoverageLayer],
    StreetViewPanorama: Instantiable2[
      /* container */ HTMLElement, 
      /* opts */ js.UndefOr[StreetViewPanoramaOptions | Null], 
      StreetViewPanorama
    ],
    StreetViewPreference: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.StreetViewPreference */ Any,
    StreetViewService: Instantiable0[StreetViewService],
    StreetViewSource: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.StreetViewSource */ Any,
    StreetViewStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.StreetViewStatus */ Any
  ): StreetViewLibrary = {
    val __obj = js.Dynamic.literal(InfoWindow = InfoWindow.asInstanceOf[js.Any], OverlayView = OverlayView.asInstanceOf[js.Any], StreetViewCoverageLayer = StreetViewCoverageLayer.asInstanceOf[js.Any], StreetViewPanorama = StreetViewPanorama.asInstanceOf[js.Any], StreetViewPreference = StreetViewPreference.asInstanceOf[js.Any], StreetViewService = StreetViewService.asInstanceOf[js.Any], StreetViewSource = StreetViewSource.asInstanceOf[js.Any], StreetViewStatus = StreetViewStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreetViewLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreetViewLibrary] (val x: Self) extends AnyVal {
    
    inline def setInfoWindow(value: Instantiable1[/* opts */ js.UndefOr[InfoWindowOptions | Null], InfoWindow]): Self = StObject.set(x, "InfoWindow", value.asInstanceOf[js.Any])
    
    inline def setOverlayView(value: TypeofOverlayView): Self = StObject.set(x, "OverlayView", value.asInstanceOf[js.Any])
    
    inline def setStreetViewCoverageLayer(value: Instantiable0[StreetViewCoverageLayer]): Self = StObject.set(x, "StreetViewCoverageLayer", value.asInstanceOf[js.Any])
    
    inline def setStreetViewPanorama(
      value: Instantiable2[
          /* container */ HTMLElement, 
          /* opts */ js.UndefOr[StreetViewPanoramaOptions | Null], 
          StreetViewPanorama
        ]
    ): Self = StObject.set(x, "StreetViewPanorama", value.asInstanceOf[js.Any])
    
    inline def setStreetViewPreference(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.StreetViewPreference */ Any
    ): Self = StObject.set(x, "StreetViewPreference", value.asInstanceOf[js.Any])
    
    inline def setStreetViewService(value: Instantiable0[StreetViewService]): Self = StObject.set(x, "StreetViewService", value.asInstanceOf[js.Any])
    
    inline def setStreetViewSource(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.StreetViewSource */ Any
    ): Self = StObject.set(x, "StreetViewSource", value.asInstanceOf[js.Any])
    
    inline def setStreetViewStatus(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.StreetViewStatus */ Any
    ): Self = StObject.set(x, "StreetViewStatus", value.asInstanceOf[js.Any])
  }
}
