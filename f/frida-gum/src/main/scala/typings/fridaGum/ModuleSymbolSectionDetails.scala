package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleSymbolSectionDetails extends js.Object {
  
  /**
    * Section index, segment name (if applicable) and section name – same format as r2’s section IDs.
    */
  var id: String = js.native
  
  /**
    * Section's memory protection.
    */
  var protection: PageProtection = js.native
}
object ModuleSymbolSectionDetails {
  
  @scala.inline
  def apply(id: String, protection: PageProtection): ModuleSymbolSectionDetails = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSymbolSectionDetails]
  }
  
  @scala.inline
  implicit class ModuleSymbolSectionDetailsOps[Self <: ModuleSymbolSectionDetails] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtection(value: PageProtection): Self = this.set("protection", value.asInstanceOf[js.Any])
  }
}
