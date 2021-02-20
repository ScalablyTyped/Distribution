package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartContractInformation extends StObject {
  
  var code: js.UndefOr[String] = js.native
  
  /**
    * A URI containing the user ID.
    */
  var uri: js.UndefOr[String] = js.native
}
object SmartContractInformation {
  
  @scala.inline
  def apply(): SmartContractInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartContractInformation]
  }
  
  @scala.inline
  implicit class SmartContractInformationMutableBuilder[Self <: SmartContractInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
