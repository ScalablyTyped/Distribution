package typings.ejWebAll.anon

import typings.ejWebAll.ej.Tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTile extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Tile
}
object TypeofTile {
  
  inline def apply(Locale: Any, fn: Tile): TypeofTile = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTile] (val x: Self) extends AnyVal {
    
    inline def setFn(value: Tile): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
