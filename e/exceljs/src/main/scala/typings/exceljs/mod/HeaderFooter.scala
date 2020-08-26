package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderFooter extends js.Object {
  /**
  	 * Set the value of differentFirst as true, which indicates that headers/footers for first page are different from the other pages, `false` by default
  	 */
  var differentFirst: Boolean = js.native
  /**
  	 * Set the value of differentOddEven as true, which indicates that headers/footers for odd and even pages are different, `false` by default
  	 */
  var differentOddEven: Boolean = js.native
  /**
  	 * Set footer string for even pages, could format the string and `null` by default
  	 */
  var evenFooter: String = js.native
  /**
  	 * Set header string for even pages, could format the string and `null` by default
  	 */
  var evenHeader: String = js.native
  /**
  	 * Set footer string for the first page, could format the string and `null` by default
  	 */
  var firstFooter: String = js.native
  /**
  	 * Set header string for the first page, could format the string and `null` by default
  	 */
  var firstHeader: String = js.native
  /**
  	 * Set footer string for odd pages, could format the string and `null` by default
  	 */
  var oddFooter: String = js.native
  /**
  	 * Set header string for odd pages, could format the string and `null` by default
  	 */
  var oddHeader: String = js.native
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
  implicit class HeaderFooterOps[Self <: HeaderFooter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDifferentFirst(value: Boolean): Self = this.set("differentFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def setDifferentOddEven(value: Boolean): Self = this.set("differentOddEven", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvenFooter(value: String): Self = this.set("evenFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvenHeader(value: String): Self = this.set("evenHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstFooter(value: String): Self = this.set("firstFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstHeader(value: String): Self = this.set("firstHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setOddFooter(value: String): Self = this.set("oddFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def setOddHeader(value: String): Self = this.set("oddHeader", value.asInstanceOf[js.Any])
  }
  
}

