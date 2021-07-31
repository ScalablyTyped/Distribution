package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Discriminant extends StObject {
  
  var discriminant: js.UndefOr[String] = js.undefined
  
  var map: js.UndefOr[js.Array[Ref]] = js.undefined
}
object Discriminant {
  
  @scala.inline
  def apply(): Discriminant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Discriminant]
  }
  
  @scala.inline
  implicit class DiscriminantMutableBuilder[Self <: Discriminant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscriminant(value: String): Self = StObject.set(x, "discriminant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscriminantUndefined: Self = StObject.set(x, "discriminant", js.undefined)
    
    @scala.inline
    def setMap(value: js.Array[Ref]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMapVarargs(value: Ref*): Self = StObject.set(x, "map", js.Array(value :_*))
  }
}
