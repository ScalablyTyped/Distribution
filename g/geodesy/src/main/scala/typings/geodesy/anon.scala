package typings.geodesy

import typings.geodesy.latlonEllipsoidalVincentyMod.LatLonEllipsoidalVincenty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Distance extends StObject {
    
    var distance: Double = js.native
    
    var finalBearing: Double = js.native
    
    var initialBearing: Double = js.native
    
    var iterations: Double = js.native
  }
  object Distance {
    
    @scala.inline
    def apply(distance: Double, finalBearing: Double, initialBearing: Double, iterations: Double): Distance = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], finalBearing = finalBearing.asInstanceOf[js.Any], initialBearing = initialBearing.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Distance]
    }
    
    @scala.inline
    implicit class DistanceMutableBuilder[Self <: Distance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalBearing(value: Double): Self = StObject.set(x, "finalBearing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialBearing(value: Double): Self = StObject.set(x, "initialBearing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FinalBearing extends StObject {
    
    var finalBearing: Double = js.native
    
    var iterations: Double = js.native
    
    var point: LatLonEllipsoidalVincenty = js.native
  }
  object FinalBearing {
    
    @scala.inline
    def apply(finalBearing: Double, iterations: Double, point: LatLonEllipsoidalVincenty): FinalBearing = {
      val __obj = js.Dynamic.literal(finalBearing = finalBearing.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
      __obj.asInstanceOf[FinalBearing]
    }
    
    @scala.inline
    implicit class FinalBearingMutableBuilder[Self <: FinalBearing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinalBearing(value: Double): Self = StObject.set(x, "finalBearing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoint(value: LatLonEllipsoidalVincenty): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Lon1 extends StObject {
    
    var lon1: Double = js.native
    
    var lon2: Double = js.native
  }
  object Lon1 {
    
    @scala.inline
    def apply(lon1: Double, lon2: Double): Lon1 = {
      val __obj = js.Dynamic.literal(lon1 = lon1.asInstanceOf[js.Any], lon2 = lon2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lon1]
    }
    
    @scala.inline
    implicit class Lon1MutableBuilder[Self <: Lon1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLon1(value: Double): Self = StObject.set(x, "lon1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLon2(value: Double): Self = StObject.set(x, "lon2", value.asInstanceOf[js.Any])
    }
  }
}
