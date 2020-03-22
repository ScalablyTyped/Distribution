package typings.escpos

import typings.escpos.escposStrings.Acknowledge
import typings.escpos.escposStrings.Bell
import typings.escpos.escposStrings.Endoftext
import typings.escpos.escposStrings.Endoftransmission
import typings.escpos.escposStrings.Enquiry
import typings.escpos.escposStrings.Null
import typings.escpos.escposStrings.Startofheading
import typings.escpos.escposStrings.Startoftext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var `1`: Null
  var `2`: Startofheading
  var `3`: Startoftext
  var `4`: Endoftext
  var `5`: Endoftransmission
  var `6`: Enquiry
  var `7`: Acknowledge
  var `8`: Bell
}

object Anon1 {
  @scala.inline
  def apply(
    `1`: Null,
    `2`: Startofheading,
    `3`: Startoftext,
    `4`: Endoftext,
    `5`: Endoftransmission,
    `6`: Enquiry,
    `7`: Acknowledge,
    `8`: Bell
  ): Anon1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

