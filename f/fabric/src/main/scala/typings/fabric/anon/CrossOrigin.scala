package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossOrigin extends StObject {
  
  var crossOrigin: js.UndefOr[String] = js.undefined
}
object CrossOrigin {
  
  @scala.inline
  def apply(): CrossOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossOrigin]
  }
  
  @scala.inline
  implicit class CrossOriginMutableBuilder[Self <: CrossOrigin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
  }
}
