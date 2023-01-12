package typings.fabric.anon

import typings.fabric.fabricImplMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tr extends StObject {
  
  var bl: Point
  
  var br: Point
  
  var tl: Point
  
  var tr: Point
}
object Tr {
  
  inline def apply(bl: Point, br: Point, tl: Point, tr: Point): Tr = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tr] (val x: Self) extends AnyVal {
    
    inline def setBl(value: Point): Self = StObject.set(x, "bl", value.asInstanceOf[js.Any])
    
    inline def setBr(value: Point): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    inline def setTl(value: Point): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
    
    inline def setTr(value: Point): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
  }
}
