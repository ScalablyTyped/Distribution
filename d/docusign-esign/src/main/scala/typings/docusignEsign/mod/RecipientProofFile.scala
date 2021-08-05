package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientProofFile extends StObject {
  
  var isInProofFile: js.UndefOr[String] = js.undefined
}
object RecipientProofFile {
  
  inline def apply(): RecipientProofFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientProofFile]
  }
  
  extension [Self <: RecipientProofFile](x: Self) {
    
    inline def setIsInProofFile(value: String): Self = StObject.set(x, "isInProofFile", value.asInstanceOf[js.Any])
    
    inline def setIsInProofFileUndefined: Self = StObject.set(x, "isInProofFile", js.undefined)
  }
}
