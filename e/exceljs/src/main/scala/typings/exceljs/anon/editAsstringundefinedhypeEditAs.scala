package typings.exceljs.anon

import typings.exceljs.mod.ImageHyperlinkValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  editAs :string | undefined,   hyperlinks :exceljs.exceljs.ImageHyperlinkValue | undefined} & exceljs.exceljs.ImagePosition */
trait editAsstringundefinedhypeEditAs extends StObject {
  
  var editAs: js.UndefOr[String] = js.undefined
  
  var ext: Height
  
  var hyperlinks: js.UndefOr[ImageHyperlinkValue] = js.undefined
  
  var tl: Col
}
object editAsstringundefinedhypeEditAs {
  
  inline def apply(ext: Height, tl: Col): editAsstringundefinedhypeEditAs = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[editAsstringundefinedhypeEditAs]
  }
  
  extension [Self <: editAsstringundefinedhypeEditAs](x: Self) {
    
    inline def setEditAs(value: String): Self = StObject.set(x, "editAs", value.asInstanceOf[js.Any])
    
    inline def setEditAsUndefined: Self = StObject.set(x, "editAs", js.undefined)
    
    inline def setExt(value: Height): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setHyperlinks(value: ImageHyperlinkValue): Self = StObject.set(x, "hyperlinks", value.asInstanceOf[js.Any])
    
    inline def setHyperlinksUndefined: Self = StObject.set(x, "hyperlinks", js.undefined)
    
    inline def setTl(value: Col): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
  }
}
