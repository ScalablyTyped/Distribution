package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyOperationAttestation extends StObject {
  
  var format: AttestationFormat = js.native
}
object KeyOperationAttestation {
  
  @scala.inline
  def apply(format: AttestationFormat): KeyOperationAttestation = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyOperationAttestation]
  }
  
  @scala.inline
  implicit class KeyOperationAttestationMutableBuilder[Self <: KeyOperationAttestation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: AttestationFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
