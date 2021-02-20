package typings.fabric.anon

import typings.fabric.fabricImplMod.Object
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait E extends StObject {
  
  var e: js.UndefOr[Event] = js.native
  
  var `object`: js.UndefOr[Object] = js.native
}
object E {
  
  @scala.inline
  def apply(): E = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[E]
  }
  
  @scala.inline
  implicit class EMutableBuilder[Self <: E] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setE(value: Event): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    @scala.inline
    def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
