package typings.gatsbyCli.anon

import typings.gatsbyCli.structuredErrorsTypesMod.ILocationPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait End extends StObject {
  
  var end: js.UndefOr[ILocationPosition] = js.native
  
  var start: ILocationPosition = js.native
}
object End {
  
  @scala.inline
  def apply(start: ILocationPosition): End = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  @scala.inline
  implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: ILocationPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: ILocationPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
