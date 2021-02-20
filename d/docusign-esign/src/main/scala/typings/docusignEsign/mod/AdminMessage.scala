package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminMessage extends StObject {
  
  var baseMessage: js.UndefOr[String] = js.native
  
  var moreInformation: js.UndefOr[String] = js.native
}
object AdminMessage {
  
  @scala.inline
  def apply(): AdminMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminMessage]
  }
  
  @scala.inline
  implicit class AdminMessageMutableBuilder[Self <: AdminMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseMessage(value: String): Self = StObject.set(x, "baseMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseMessageUndefined: Self = StObject.set(x, "baseMessage", js.undefined)
    
    @scala.inline
    def setMoreInformation(value: String): Self = StObject.set(x, "moreInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreInformationUndefined: Self = StObject.set(x, "moreInformation", js.undefined)
  }
}
