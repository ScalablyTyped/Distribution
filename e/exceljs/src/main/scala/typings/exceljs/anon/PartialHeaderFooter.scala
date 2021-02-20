package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.HeaderFooter> */
@js.native
trait PartialHeaderFooter extends StObject {
  
  var differentFirst: js.UndefOr[Boolean] = js.native
  
  var differentOddEven: js.UndefOr[Boolean] = js.native
  
  var evenFooter: js.UndefOr[String] = js.native
  
  var evenHeader: js.UndefOr[String] = js.native
  
  var firstFooter: js.UndefOr[String] = js.native
  
  var firstHeader: js.UndefOr[String] = js.native
  
  var oddFooter: js.UndefOr[String] = js.native
  
  var oddHeader: js.UndefOr[String] = js.native
}
object PartialHeaderFooter {
  
  @scala.inline
  def apply(): PartialHeaderFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHeaderFooter]
  }
  
  @scala.inline
  implicit class PartialHeaderFooterMutableBuilder[Self <: PartialHeaderFooter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDifferentFirst(value: Boolean): Self = StObject.set(x, "differentFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDifferentFirstUndefined: Self = StObject.set(x, "differentFirst", js.undefined)
    
    @scala.inline
    def setDifferentOddEven(value: Boolean): Self = StObject.set(x, "differentOddEven", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDifferentOddEvenUndefined: Self = StObject.set(x, "differentOddEven", js.undefined)
    
    @scala.inline
    def setEvenFooter(value: String): Self = StObject.set(x, "evenFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenFooterUndefined: Self = StObject.set(x, "evenFooter", js.undefined)
    
    @scala.inline
    def setEvenHeader(value: String): Self = StObject.set(x, "evenHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenHeaderUndefined: Self = StObject.set(x, "evenHeader", js.undefined)
    
    @scala.inline
    def setFirstFooter(value: String): Self = StObject.set(x, "firstFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstFooterUndefined: Self = StObject.set(x, "firstFooter", js.undefined)
    
    @scala.inline
    def setFirstHeader(value: String): Self = StObject.set(x, "firstHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstHeaderUndefined: Self = StObject.set(x, "firstHeader", js.undefined)
    
    @scala.inline
    def setOddFooter(value: String): Self = StObject.set(x, "oddFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOddFooterUndefined: Self = StObject.set(x, "oddFooter", js.undefined)
    
    @scala.inline
    def setOddHeader(value: String): Self = StObject.set(x, "oddHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOddHeaderUndefined: Self = StObject.set(x, "oddHeader", js.undefined)
  }
}
