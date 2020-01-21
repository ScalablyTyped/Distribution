package typings.googleCloudKms.mod.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyOperationAttestation extends js.Object {
  var format: AttestationFormat
}

object KeyOperationAttestation {
  @scala.inline
  def apply(format: AttestationFormat): KeyOperationAttestation = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyOperationAttestation]
  }
}

