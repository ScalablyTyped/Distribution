package typings.ejWebAll.anon

import typings.ejWebAll.ej.Tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTile extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: Tile
}
object TypeofTile {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Tile): TypeofTile = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTile]
  }
  
  @scala.inline
  implicit class TypeofTileMutableBuilder[Self <: TypeofTile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Tile): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
