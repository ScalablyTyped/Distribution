package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeType extends StObject {
  
  var size: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object SizeType {
  
  @scala.inline
  def apply(): SizeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeType]
  }
  
  @scala.inline
  implicit class SizeTypeMutableBuilder[Self <: SizeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
