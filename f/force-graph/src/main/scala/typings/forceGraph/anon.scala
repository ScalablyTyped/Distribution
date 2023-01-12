package typings.forceGraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait K extends StObject {
    
    var k: Double
    
    var x: Double
    
    var y: Double
  }
  object K {
    
    inline def apply(k: Double, x: Double, y: Double): K = {
      val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[K]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: K] (val x: Self) extends AnyVal {
      
      inline def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Y extends StObject {
    
    var x: js.Tuple2[Double, Double]
    
    var y: js.Tuple2[Double, Double]
  }
  object Y {
    
    inline def apply(x: js.Tuple2[Double, Double], y: js.Tuple2[Double, Double]): Y = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      inline def setX(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
