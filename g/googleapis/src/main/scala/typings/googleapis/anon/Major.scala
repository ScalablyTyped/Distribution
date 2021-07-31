package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Major extends StObject {
  
  var major: js.UndefOr[Double] = js.undefined
  
  var minor: js.UndefOr[Double] = js.undefined
}
object Major {
  
  @scala.inline
  def apply(): Major = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Major]
  }
  
  @scala.inline
  implicit class MajorMutableBuilder[Self <: Major] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    @scala.inline
    def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
  }
}
