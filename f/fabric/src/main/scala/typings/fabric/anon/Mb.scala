package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mb extends StObject {
  
  var bl: Boolean
  
  var br: Boolean
  
  var mb: Boolean
  
  var ml: Boolean
  
  var mr: Boolean
  
  var mt: Boolean
  
  var mtr: Boolean
  
  var tl: Boolean
  
  var tr: Boolean
}
object Mb {
  
  inline def apply(
    bl: Boolean,
    br: Boolean,
    mb: Boolean,
    ml: Boolean,
    mr: Boolean,
    mt: Boolean,
    mtr: Boolean,
    tl: Boolean,
    tr: Boolean
  ): Mb = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], mb = mb.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any], mr = mr.asInstanceOf[js.Any], mt = mt.asInstanceOf[js.Any], mtr = mtr.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mb]
  }
  
  extension [Self <: Mb](x: Self) {
    
    inline def setBl(value: Boolean): Self = StObject.set(x, "bl", value.asInstanceOf[js.Any])
    
    inline def setBr(value: Boolean): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    inline def setMb(value: Boolean): Self = StObject.set(x, "mb", value.asInstanceOf[js.Any])
    
    inline def setMl(value: Boolean): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
    
    inline def setMr(value: Boolean): Self = StObject.set(x, "mr", value.asInstanceOf[js.Any])
    
    inline def setMt(value: Boolean): Self = StObject.set(x, "mt", value.asInstanceOf[js.Any])
    
    inline def setMtr(value: Boolean): Self = StObject.set(x, "mtr", value.asInstanceOf[js.Any])
    
    inline def setTl(value: Boolean): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
    
    inline def setTr(value: Boolean): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
  }
}
