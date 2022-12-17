package typings.fabric.anon

import typings.fabric.fabricImplMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ml extends StObject {
  
  var bl: Point
  
  var br: Point
  
  var mb: Point
  
  var ml: Point
  
  var mr: Point
  
  var mt: Point
  
  var mtr: Point
  
  var tl: Point
  
  var tr: Point
}
object Ml {
  
  inline def apply(bl: Point, br: Point, mb: Point, ml: Point, mr: Point, mt: Point, mtr: Point, tl: Point, tr: Point): Ml = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], mb = mb.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any], mr = mr.asInstanceOf[js.Any], mt = mt.asInstanceOf[js.Any], mtr = mtr.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ml]
  }
  
  extension [Self <: Ml](x: Self) {
    
    inline def setBl(value: Point): Self = StObject.set(x, "bl", value.asInstanceOf[js.Any])
    
    inline def setBr(value: Point): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    inline def setMb(value: Point): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
    
    inline def setMl(value: Point): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
    
    inline def setMr(value: Point): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
    
    inline def setMt(value: Point): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
    
    inline def setMtr(value: Point): Self = StObject.set(x, "mtr", value.asInstanceOf[js.Any])
    
    inline def setTl(value: Point): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
    
    inline def setTr(value: Point): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
  }
}
