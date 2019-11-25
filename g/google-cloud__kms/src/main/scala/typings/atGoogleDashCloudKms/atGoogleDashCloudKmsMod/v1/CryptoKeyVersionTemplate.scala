package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKeyVersionTemplate extends js.Object {
  var algorithm: CryptoKeyVersionAlgorithm
  var protectionLevel: ProtectionLevel
}

object CryptoKeyVersionTemplate {
  @scala.inline
  def apply(algorithm: CryptoKeyVersionAlgorithm, protectionLevel: ProtectionLevel): CryptoKeyVersionTemplate = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], protectionLevel = protectionLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CryptoKeyVersionTemplate]
  }
}

