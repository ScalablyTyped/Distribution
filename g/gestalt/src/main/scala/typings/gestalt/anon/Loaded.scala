package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loaded extends StObject {
  
  var loaded: Double
}
object Loaded {
  
  @scala.inline
  def apply(loaded: Double): Loaded = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loaded]
  }
  
  @scala.inline
  implicit class LoadedMutableBuilder[Self <: Loaded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
  }
}
