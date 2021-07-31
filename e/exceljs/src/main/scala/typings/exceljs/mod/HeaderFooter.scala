package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderFooter extends StObject {
  
  /**
  	 * Set the value of differentFirst as true, which indicates that headers/footers for first page are different from the other pages, `false` by default
  	 */
  var differentFirst: Boolean
  
  /**
  	 * Set the value of differentOddEven as true, which indicates that headers/footers for odd and even pages are different, `false` by default
  	 */
  var differentOddEven: Boolean
  
  /**
  	 * Set footer string for even pages, could format the string and `null` by default
  	 */
  var evenFooter: String
  
  /**
  	 * Set header string for even pages, could format the string and `null` by default
  	 */
  var evenHeader: String
  
  /**
  	 * Set footer string for the first page, could format the string and `null` by default
  	 */
  var firstFooter: String
  
  /**
  	 * Set header string for the first page, could format the string and `null` by default
  	 */
  var firstHeader: String
  
  /**
  	 * Set footer string for odd pages, could format the string and `null` by default
  	 */
  var oddFooter: String
  
  /**
  	 * Set header string for odd pages, could format the string and `null` by default
  	 */
  var oddHeader: String
}
object HeaderFooter {
  
  @scala.inline
  def apply(
    differentFirst: Boolean,
    differentOddEven: Boolean,
    evenFooter: String,
    evenHeader: String,
    firstFooter: String,
    firstHeader: String,
    oddFooter: String,
    oddHeader: String
  ): HeaderFooter = {
    val __obj = js.Dynamic.literal(differentFirst = differentFirst.asInstanceOf[js.Any], differentOddEven = differentOddEven.asInstanceOf[js.Any], evenFooter = evenFooter.asInstanceOf[js.Any], evenHeader = evenHeader.asInstanceOf[js.Any], firstFooter = firstFooter.asInstanceOf[js.Any], firstHeader = firstHeader.asInstanceOf[js.Any], oddFooter = oddFooter.asInstanceOf[js.Any], oddHeader = oddHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
  
  @scala.inline
  implicit class HeaderFooterMutableBuilder[Self <: HeaderFooter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDifferentFirst(value: Boolean): Self = StObject.set(x, "differentFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDifferentOddEven(value: Boolean): Self = StObject.set(x, "differentOddEven", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenFooter(value: String): Self = StObject.set(x, "evenFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvenHeader(value: String): Self = StObject.set(x, "evenHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstFooter(value: String): Self = StObject.set(x, "firstFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstHeader(value: String): Self = StObject.set(x, "firstHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOddFooter(value: String): Self = StObject.set(x, "oddFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOddHeader(value: String): Self = StObject.set(x, "oddHeader", value.asInstanceOf[js.Any])
  }
}
