package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoMixedArea extends StObject {
  
  var noMixedArea: js.UndefOr[Boolean] = js.undefined
  
  var noMixedVolume: js.UndefOr[Boolean] = js.undefined
  
  var preferLetters: js.UndefOr[Boolean] = js.undefined
}
object NoMixedArea {
  
  inline def apply(): NoMixedArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoMixedArea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoMixedArea] (val x: Self) extends AnyVal {
    
    inline def setNoMixedArea(value: Boolean): Self = StObject.set(x, "noMixedArea", value.asInstanceOf[js.Any])
    
    inline def setNoMixedAreaUndefined: Self = StObject.set(x, "noMixedArea", js.undefined)
    
    inline def setNoMixedVolume(value: Boolean): Self = StObject.set(x, "noMixedVolume", value.asInstanceOf[js.Any])
    
    inline def setNoMixedVolumeUndefined: Self = StObject.set(x, "noMixedVolume", js.undefined)
    
    inline def setPreferLetters(value: Boolean): Self = StObject.set(x, "preferLetters", value.asInstanceOf[js.Any])
    
    inline def setPreferLettersUndefined: Self = StObject.set(x, "preferLetters", js.undefined)
  }
}
