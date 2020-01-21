package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleSymbolSectionDetails extends js.Object {
  /**
    * Section index, segment name (if applicable) and section name – same format as r2’s section IDs.
    */
  var id: String
  /**
    * Section's memory protection.
    */
  var protection: PageProtection
}

object ModuleSymbolSectionDetails {
  @scala.inline
  def apply(id: String, protection: PageProtection): ModuleSymbolSectionDetails = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModuleSymbolSectionDetails]
  }
}

