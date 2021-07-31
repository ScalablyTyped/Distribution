package typings.divaJs.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var f: Boolean
  
  var i: Boolean | String
  
  var n: Double
  
  var p: Boolean | Double
  
  var v: String
  
  var x: Boolean | Double
  
  var y: Boolean | Double
  
  var z: Double
}
object State {
  
  @scala.inline
  def apply(
    f: Boolean,
    i: Boolean | String,
    n: Double,
    p: Boolean | Double,
    v: String,
    x: Boolean | Double,
    y: Boolean | Double,
    z: Double
  ): State = {
    val __obj = js.Dynamic.literal(f = f.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setF(value: Boolean): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI(value: Boolean | String): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Boolean | Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Boolean | Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Boolean | Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
