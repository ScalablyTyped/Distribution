package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.HeaderFooter> */
trait PartialHeaderFooter extends StObject {
  
  var differentFirst: js.UndefOr[Boolean] = js.undefined
  
  var differentOddEven: js.UndefOr[Boolean] = js.undefined
  
  var evenFooter: js.UndefOr[String] = js.undefined
  
  var evenHeader: js.UndefOr[String] = js.undefined
  
  var firstFooter: js.UndefOr[String] = js.undefined
  
  var firstHeader: js.UndefOr[String] = js.undefined
  
  var oddFooter: js.UndefOr[String] = js.undefined
  
  var oddHeader: js.UndefOr[String] = js.undefined
}
object PartialHeaderFooter {
  
  inline def apply(): PartialHeaderFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHeaderFooter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialHeaderFooter] (val x: Self) extends AnyVal {
    
    inline def setDifferentFirst(value: Boolean): Self = StObject.set(x, "differentFirst", value.asInstanceOf[js.Any])
    
    inline def setDifferentFirstUndefined: Self = StObject.set(x, "differentFirst", js.undefined)
    
    inline def setDifferentOddEven(value: Boolean): Self = StObject.set(x, "differentOddEven", value.asInstanceOf[js.Any])
    
    inline def setDifferentOddEvenUndefined: Self = StObject.set(x, "differentOddEven", js.undefined)
    
    inline def setEvenFooter(value: String): Self = StObject.set(x, "evenFooter", value.asInstanceOf[js.Any])
    
    inline def setEvenFooterUndefined: Self = StObject.set(x, "evenFooter", js.undefined)
    
    inline def setEvenHeader(value: String): Self = StObject.set(x, "evenHeader", value.asInstanceOf[js.Any])
    
    inline def setEvenHeaderUndefined: Self = StObject.set(x, "evenHeader", js.undefined)
    
    inline def setFirstFooter(value: String): Self = StObject.set(x, "firstFooter", value.asInstanceOf[js.Any])
    
    inline def setFirstFooterUndefined: Self = StObject.set(x, "firstFooter", js.undefined)
    
    inline def setFirstHeader(value: String): Self = StObject.set(x, "firstHeader", value.asInstanceOf[js.Any])
    
    inline def setFirstHeaderUndefined: Self = StObject.set(x, "firstHeader", js.undefined)
    
    inline def setOddFooter(value: String): Self = StObject.set(x, "oddFooter", value.asInstanceOf[js.Any])
    
    inline def setOddFooterUndefined: Self = StObject.set(x, "oddFooter", js.undefined)
    
    inline def setOddHeader(value: String): Self = StObject.set(x, "oddHeader", value.asInstanceOf[js.Any])
    
    inline def setOddHeaderUndefined: Self = StObject.set(x, "oddHeader", js.undefined)
  }
}
