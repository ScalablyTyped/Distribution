package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderFooter extends js.Object {
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
}

