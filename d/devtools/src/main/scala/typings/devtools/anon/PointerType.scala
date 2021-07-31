package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerType extends StObject {
  
  var pointerType: js.UndefOr[String] = js.undefined
}
object PointerType {
  
  @scala.inline
  def apply(): PointerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointerType]
  }
  
  @scala.inline
  implicit class PointerTypeMutableBuilder[Self <: PointerType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPointerType(value: String): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
  }
}
