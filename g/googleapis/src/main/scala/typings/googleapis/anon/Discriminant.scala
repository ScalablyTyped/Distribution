package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Discriminant extends StObject {
  
  var discriminant: js.UndefOr[String] = js.undefined
  
  var map: js.UndefOr[js.Array[Ref]] = js.undefined
}
object Discriminant {
  
  inline def apply(): Discriminant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Discriminant]
  }
  
  extension [Self <: Discriminant](x: Self) {
    
    inline def setDiscriminant(value: String): Self = StObject.set(x, "discriminant", value.asInstanceOf[js.Any])
    
    inline def setDiscriminantUndefined: Self = StObject.set(x, "discriminant", js.undefined)
    
    inline def setMap(value: js.Array[Ref]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMapVarargs(value: Ref*): Self = StObject.set(x, "map", js.Array(value*))
  }
}
