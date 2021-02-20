package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverInfo extends StObject {
  
  var coverInfo: js.UndefOr[LeftImageOffset] = js.native
  
  var coverPhoto: js.UndefOr[Height] = js.native
  
  var layout: js.UndefOr[String] = js.native
}
object CoverInfo {
  
  @scala.inline
  def apply(): CoverInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverInfo]
  }
  
  @scala.inline
  implicit class CoverInfoMutableBuilder[Self <: CoverInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoverInfo(value: LeftImageOffset): Self = StObject.set(x, "coverInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverInfoUndefined: Self = StObject.set(x, "coverInfo", js.undefined)
    
    @scala.inline
    def setCoverPhoto(value: Height): Self = StObject.set(x, "coverPhoto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverPhotoUndefined: Self = StObject.set(x, "coverPhoto", js.undefined)
    
    @scala.inline
    def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
