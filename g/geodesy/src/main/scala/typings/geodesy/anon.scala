package typings.geodesy

import typings.geodesy.latlonEllipsoidalVincentyMod.LatLonEllipsoidalVincenty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Distance extends StObject {
    
    var distance: Double
    
    var finalBearing: Double
    
    var initialBearing: Double
    
    var iterations: Double
  }
  object Distance {
    
    inline def apply(distance: Double, finalBearing: Double, initialBearing: Double, iterations: Double): Distance = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], finalBearing = finalBearing.asInstanceOf[js.Any], initialBearing = initialBearing.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Distance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Distance] (val x: Self) extends AnyVal {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setFinalBearing(value: Double): Self = StObject.set(x, "finalBearing", value.asInstanceOf[js.Any])
      
      inline def setInitialBearing(value: Double): Self = StObject.set(x, "initialBearing", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    }
  }
  
  trait FinalBearing extends StObject {
    
    var finalBearing: Double
    
    var iterations: Double
    
    var point: LatLonEllipsoidalVincenty
  }
  object FinalBearing {
    
    inline def apply(finalBearing: Double, iterations: Double, point: LatLonEllipsoidalVincenty): FinalBearing = {
      val __obj = js.Dynamic.literal(finalBearing = finalBearing.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
      __obj.asInstanceOf[FinalBearing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FinalBearing] (val x: Self) extends AnyVal {
      
      inline def setFinalBearing(value: Double): Self = StObject.set(x, "finalBearing", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setPoint(value: LatLonEllipsoidalVincenty): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    }
  }
  
  trait Lon1 extends StObject {
    
    var lon1: Double
    
    var lon2: Double
  }
  object Lon1 {
    
    inline def apply(lon1: Double, lon2: Double): Lon1 = {
      val __obj = js.Dynamic.literal(lon1 = lon1.asInstanceOf[js.Any], lon2 = lon2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lon1]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lon1] (val x: Self) extends AnyVal {
      
      inline def setLon1(value: Double): Self = StObject.set(x, "lon1", value.asInstanceOf[js.Any])
      
      inline def setLon2(value: Double): Self = StObject.set(x, "lon2", value.asInstanceOf[js.Any])
    }
  }
}
