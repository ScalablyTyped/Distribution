package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hi extends StObject {
  
  var hi: js.UndefOr[Latitude] = js.undefined
  
  var lo: js.UndefOr[Latitude] = js.undefined
}
object Hi {
  
  @scala.inline
  def apply(): Hi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hi]
  }
  
  @scala.inline
  implicit class HiMutableBuilder[Self <: Hi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHi(value: Latitude): Self = StObject.set(x, "hi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiUndefined: Self = StObject.set(x, "hi", js.undefined)
    
    @scala.inline
    def setLo(value: Latitude): Self = StObject.set(x, "lo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoUndefined: Self = StObject.set(x, "lo", js.undefined)
  }
}
