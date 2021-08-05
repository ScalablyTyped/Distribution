package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tl extends StObject {
  
  var bl: X
  
  var br: X
  
  var tl: X
  
  var tr: X
}
object Tl {
  
  inline def apply(bl: X, br: X, tl: X, tr: X): Tl = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tl]
  }
  
  extension [Self <: Tl](x: Self) {
    
    inline def setBl(value: X): Self = StObject.set(x, "bl", value.asInstanceOf[js.Any])
    
    inline def setBr(value: X): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    inline def setTl(value: X): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
    
    inline def setTr(value: X): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
  }
}
