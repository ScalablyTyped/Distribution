package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumerateRangesSpecifier extends js.Object {
  /**
    * Whether neighboring ranges with the same protection should be coalesced. The default is false.
    */
  var coalesce: Boolean
  /**
    * Minimum protection required to be included in the result.
    */
  var protection: PageProtection
}

object EnumerateRangesSpecifier {
  @scala.inline
  def apply(coalesce: Boolean, protection: PageProtection): EnumerateRangesSpecifier = {
    val __obj = js.Dynamic.literal(coalesce = coalesce, protection = protection)
  
    __obj.asInstanceOf[EnumerateRangesSpecifier]
  }
}

