package typings.floatingUiCore.anon

import typings.floatingUiCore.typesMod.SideObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Escaped extends StObject {
  
  var escaped: js.UndefOr[Boolean] = js.undefined
  
  var escapedOffsets: js.UndefOr[SideObject] = js.undefined
  
  var referenceHidden: js.UndefOr[Boolean] = js.undefined
  
  var referenceHiddenOffsets: js.UndefOr[SideObject] = js.undefined
}
object Escaped {
  
  inline def apply(): Escaped = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Escaped]
  }
  
  extension [Self <: Escaped](x: Self) {
    
    inline def setEscaped(value: Boolean): Self = StObject.set(x, "escaped", value.asInstanceOf[js.Any])
    
    inline def setEscapedOffsets(value: SideObject): Self = StObject.set(x, "escapedOffsets", value.asInstanceOf[js.Any])
    
    inline def setEscapedOffsetsUndefined: Self = StObject.set(x, "escapedOffsets", js.undefined)
    
    inline def setEscapedUndefined: Self = StObject.set(x, "escaped", js.undefined)
    
    inline def setReferenceHidden(value: Boolean): Self = StObject.set(x, "referenceHidden", value.asInstanceOf[js.Any])
    
    inline def setReferenceHiddenOffsets(value: SideObject): Self = StObject.set(x, "referenceHiddenOffsets", value.asInstanceOf[js.Any])
    
    inline def setReferenceHiddenOffsetsUndefined: Self = StObject.set(x, "referenceHiddenOffsets", js.undefined)
    
    inline def setReferenceHiddenUndefined: Self = StObject.set(x, "referenceHidden", js.undefined)
  }
}
