package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleSymbolSectionDetails extends js.Object {
  /**
    * Section index, segment name (if applicable) and section name – same format as r2’s section IDs.
    */
  var id: java.lang.String
  /**
    * Section's memory protection.
    */
  var protection: PageProtection
}

object ModuleSymbolSectionDetails {
  @scala.inline
  def apply(id: java.lang.String, protection: PageProtection): ModuleSymbolSectionDetails = {
    val __obj = js.Dynamic.literal(id = id, protection = protection)
  
    __obj.asInstanceOf[ModuleSymbolSectionDetails]
  }
}

