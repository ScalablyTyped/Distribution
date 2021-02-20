package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeftImageOffset extends StObject {
  
  var leftImageOffset: js.UndefOr[Double] = js.native
  
  var topImageOffset: js.UndefOr[Double] = js.native
}
object LeftImageOffset {
  
  @scala.inline
  def apply(): LeftImageOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeftImageOffset]
  }
  
  @scala.inline
  implicit class LeftImageOffsetMutableBuilder[Self <: LeftImageOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftImageOffset(value: Double): Self = StObject.set(x, "leftImageOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftImageOffsetUndefined: Self = StObject.set(x, "leftImageOffset", js.undefined)
    
    @scala.inline
    def setTopImageOffset(value: Double): Self = StObject.set(x, "topImageOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopImageOffsetUndefined: Self = StObject.set(x, "topImageOffset", js.undefined)
  }
}
