package typings.exceljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.HeaderFooter> */
trait PartialHeaderFooter extends js.Object {
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
  @scala.inline
  def apply(
    differentFirst: js.UndefOr[Boolean] = js.undefined,
    differentOddEven: js.UndefOr[Boolean] = js.undefined,
    evenFooter: String = null,
    evenHeader: String = null,
    firstFooter: String = null,
    firstHeader: String = null,
    oddFooter: String = null,
    oddHeader: String = null
  ): PartialHeaderFooter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(differentFirst)) __obj.updateDynamic("differentFirst")(differentFirst.get.asInstanceOf[js.Any])
    if (!js.isUndefined(differentOddEven)) __obj.updateDynamic("differentOddEven")(differentOddEven.get.asInstanceOf[js.Any])
    if (evenFooter != null) __obj.updateDynamic("evenFooter")(evenFooter.asInstanceOf[js.Any])
    if (evenHeader != null) __obj.updateDynamic("evenHeader")(evenHeader.asInstanceOf[js.Any])
    if (firstFooter != null) __obj.updateDynamic("firstFooter")(firstFooter.asInstanceOf[js.Any])
    if (firstHeader != null) __obj.updateDynamic("firstHeader")(firstHeader.asInstanceOf[js.Any])
    if (oddFooter != null) __obj.updateDynamic("oddFooter")(oddFooter.asInstanceOf[js.Any])
    if (oddHeader != null) __obj.updateDynamic("oddHeader")(oddHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialHeaderFooter]
  }
}

