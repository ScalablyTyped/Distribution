package typings.forgeApis.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait With extends StObject {
  
  var _with: js.UndefOr[String] = js.native
  
  var ifModifiedSince: js.UndefOr[Date] = js.native
}
object With {
  
  @scala.inline
  def apply(): With = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[With]
  }
  
  @scala.inline
  implicit class WithMutableBuilder[Self <: With] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIfModifiedSince(value: Date): Self = StObject.set(x, "ifModifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfModifiedSinceUndefined: Self = StObject.set(x, "ifModifiedSince", js.undefined)
    
    @scala.inline
    def set_with(value: String): Self = StObject.set(x, "_with", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_withUndefined: Self = StObject.set(x, "_with", js.undefined)
  }
}
