package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleSymbolSectionDetails extends StObject {
  
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
  
  @scala.inline
  implicit class ModuleSymbolSectionDetailsMutableBuilder[Self <: ModuleSymbolSectionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtection(value: PageProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
  }
}
