package typings.googleMaps.google.maps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.googleMaps.anon.TypeofLatLngBounds
import typings.googleMaps.anon.TypeofSettings
import typings.googleMaps.anon.Typeofevent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreLibrary extends StObject {
  
  var ControlPosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.ControlPosition */ Any
  
  var LatLng: Instantiable3[
    /* latOrLatLngOrLatLngLiteral */ Double | LatLngLiteral | typings.googleMaps.google.maps.LatLng, 
    /* lngOrNoClampNoWrap */ js.UndefOr[Double | Boolean | Null], 
    /* noClampNoWrap */ js.UndefOr[Boolean], 
    typings.googleMaps.google.maps.LatLng
  ]
  
  var LatLngAltitude: Instantiable2[
    /* value */ LatLngAltitudeLiteral | LatLngLiteral | LatLng, 
    /* noClampNoWrap */ js.UndefOr[Boolean], 
    typings.googleMaps.google.maps.LatLngAltitude
  ]
  
  var LatLngBounds: TypeofLatLngBounds
  
  var MVCArray: Instantiable1[
    /* array */ js.UndefOr[
      (js.Array[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]) | Null
    ], 
    typings.googleMaps.google.maps.MVCArray[js.Object]
  ]
  
  var MVCObject: Instantiable0[typings.googleMaps.google.maps.MVCObject]
  
  var MapsNetworkError: Instantiable0[typings.googleMaps.google.maps.MapsNetworkError]
  
  var MapsNetworkErrorEndpoint: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.MapsNetworkErrorEndpoint */ Any
  
  var MapsRequestError: Instantiable0[typings.googleMaps.google.maps.MapsRequestError]
  
  var MapsServerError: Instantiable0[typings.googleMaps.google.maps.MapsServerError]
  
  var Point: Instantiable2[/* x */ Double, /* y */ Double, typings.googleMaps.google.maps.Point]
  
  var Settings: TypeofSettings
  
  var Size: Instantiable4[
    /* width */ Double, 
    /* height */ Double, 
    /* widthUnit */ js.UndefOr[String], 
    /* heightUnit */ js.UndefOr[String], 
    typings.googleMaps.google.maps.Size
  ]
  
  var SymbolPath: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.SymbolPath */ Any
  
  var UnitSystem: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.UnitSystem */ Any
  
  var event: Typeofevent
}
object CoreLibrary {
  
  inline def apply(
    ControlPosition: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.ControlPosition */ Any,
    LatLng: Instantiable3[
      /* latOrLatLngOrLatLngLiteral */ Double | LatLngLiteral | LatLng, 
      /* lngOrNoClampNoWrap */ js.UndefOr[Double | Boolean | Null], 
      /* noClampNoWrap */ js.UndefOr[Boolean], 
      LatLng
    ],
    LatLngAltitude: Instantiable2[
      /* value */ LatLngAltitudeLiteral | LatLngLiteral | LatLng, 
      /* noClampNoWrap */ js.UndefOr[Boolean], 
      LatLngAltitude
    ],
    LatLngBounds: TypeofLatLngBounds,
    MVCArray: Instantiable1[
      /* array */ js.UndefOr[
        (js.Array[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]) | Null
      ], 
      MVCArray[js.Object]
    ],
    MVCObject: Instantiable0[MVCObject],
    MapsNetworkError: Instantiable0[MapsNetworkError],
    MapsNetworkErrorEndpoint: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.MapsNetworkErrorEndpoint */ Any,
    MapsRequestError: Instantiable0[MapsRequestError],
    MapsServerError: Instantiable0[MapsServerError],
    Point: Instantiable2[/* x */ Double, /* y */ Double, Point],
    Settings: TypeofSettings,
    Size: Instantiable4[
      /* width */ Double, 
      /* height */ Double, 
      /* widthUnit */ js.UndefOr[String], 
      /* heightUnit */ js.UndefOr[String], 
      Size
    ],
    SymbolPath: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.SymbolPath */ Any,
    UnitSystem: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.UnitSystem */ Any,
    event: Typeofevent
  ): CoreLibrary = {
    val __obj = js.Dynamic.literal(ControlPosition = ControlPosition.asInstanceOf[js.Any], LatLng = LatLng.asInstanceOf[js.Any], LatLngAltitude = LatLngAltitude.asInstanceOf[js.Any], LatLngBounds = LatLngBounds.asInstanceOf[js.Any], MVCArray = MVCArray.asInstanceOf[js.Any], MVCObject = MVCObject.asInstanceOf[js.Any], MapsNetworkError = MapsNetworkError.asInstanceOf[js.Any], MapsNetworkErrorEndpoint = MapsNetworkErrorEndpoint.asInstanceOf[js.Any], MapsRequestError = MapsRequestError.asInstanceOf[js.Any], MapsServerError = MapsServerError.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SymbolPath = SymbolPath.asInstanceOf[js.Any], UnitSystem = UnitSystem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoreLibrary] (val x: Self) extends AnyVal {
    
    inline def setControlPosition(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.ControlPosition */ Any
    ): Self = StObject.set(x, "ControlPosition", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: Typeofevent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setLatLng(
      value: Instantiable3[
          /* latOrLatLngOrLatLngLiteral */ Double | LatLngLiteral | LatLng, 
          /* lngOrNoClampNoWrap */ js.UndefOr[Double | Boolean | Null], 
          /* noClampNoWrap */ js.UndefOr[Boolean], 
          LatLng
        ]
    ): Self = StObject.set(x, "LatLng", value.asInstanceOf[js.Any])
    
    inline def setLatLngAltitude(
      value: Instantiable2[
          /* value */ LatLngAltitudeLiteral | LatLngLiteral | LatLng, 
          /* noClampNoWrap */ js.UndefOr[Boolean], 
          LatLngAltitude
        ]
    ): Self = StObject.set(x, "LatLngAltitude", value.asInstanceOf[js.Any])
    
    inline def setLatLngBounds(value: TypeofLatLngBounds): Self = StObject.set(x, "LatLngBounds", value.asInstanceOf[js.Any])
    
    inline def setMVCArray(
      value: Instantiable1[
          /* array */ js.UndefOr[
            (js.Array[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]) | Null
          ], 
          MVCArray[js.Object]
        ]
    ): Self = StObject.set(x, "MVCArray", value.asInstanceOf[js.Any])
    
    inline def setMVCObject(value: Instantiable0[MVCObject]): Self = StObject.set(x, "MVCObject", value.asInstanceOf[js.Any])
    
    inline def setMapsNetworkError(value: Instantiable0[MapsNetworkError]): Self = StObject.set(x, "MapsNetworkError", value.asInstanceOf[js.Any])
    
    inline def setMapsNetworkErrorEndpoint(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.MapsNetworkErrorEndpoint */ Any
    ): Self = StObject.set(x, "MapsNetworkErrorEndpoint", value.asInstanceOf[js.Any])
    
    inline def setMapsRequestError(value: Instantiable0[MapsRequestError]): Self = StObject.set(x, "MapsRequestError", value.asInstanceOf[js.Any])
    
    inline def setMapsServerError(value: Instantiable0[MapsServerError]): Self = StObject.set(x, "MapsServerError", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Instantiable2[/* x */ Double, /* y */ Double, Point]): Self = StObject.set(x, "Point", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: TypeofSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSize(
      value: Instantiable4[
          /* width */ Double, 
          /* height */ Double, 
          /* widthUnit */ js.UndefOr[String], 
          /* heightUnit */ js.UndefOr[String], 
          Size
        ]
    ): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSymbolPath(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.SymbolPath */ Any
    ): Self = StObject.set(x, "SymbolPath", value.asInstanceOf[js.Any])
    
    inline def setUnitSystem(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.maps.UnitSystem */ Any
    ): Self = StObject.set(x, "UnitSystem", value.asInstanceOf[js.Any])
  }
}
