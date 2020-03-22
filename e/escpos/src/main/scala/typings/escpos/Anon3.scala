package typings.escpos

import typings.escpos.escposStrings.InformationseparatorthreewAcknowledge
import typings.escpos.escposStrings.InformationseparatorthreewEndoftext
import typings.escpos.escposStrings.InformationseparatorthreewEndoftransmission
import typings.escpos.escposStrings.InformationseparatorthreewEnquiry
import typings.escpos.escposStrings.InformationseparatorthreewStartoftext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends js.Object {
  var `1`: InformationseparatorthreewStartoftext
  var `2`: InformationseparatorthreewEndoftext
  var `3`: InformationseparatorthreewEndoftransmission
  var `4`: InformationseparatorthreewEnquiry
  var `5`: InformationseparatorthreewAcknowledge
}

object Anon3 {
  @scala.inline
  def apply(
    `1`: InformationseparatorthreewStartoftext,
    `2`: InformationseparatorthreewEndoftext,
    `3`: InformationseparatorthreewEndoftransmission,
    `4`: InformationseparatorthreewEnquiry,
    `5`: InformationseparatorthreewAcknowledge
  ): Anon3 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3]
  }
}

