package typings.embroiderMacros.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Builders extends StObject {
  
  var builders: Any
}
object Builders {
  
  inline def apply(builders: Any): Builders = {
    val __obj = js.Dynamic.literal(builders = builders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Builders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Builders] (val x: Self) extends AnyVal {
    
    inline def setBuilders(value: Any): Self = StObject.set(x, "builders", value.asInstanceOf[js.Any])
  }
}
