package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientProofFile extends StObject {
  
  var isInProofFile: js.UndefOr[String] = js.native
}
object RecipientProofFile {
  
  @scala.inline
  def apply(): RecipientProofFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientProofFile]
  }
  
  @scala.inline
  implicit class RecipientProofFileMutableBuilder[Self <: RecipientProofFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsInProofFile(value: String): Self = StObject.set(x, "isInProofFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInProofFileUndefined: Self = StObject.set(x, "isInProofFile", js.undefined)
  }
}
