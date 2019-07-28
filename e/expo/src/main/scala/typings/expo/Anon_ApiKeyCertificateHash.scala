package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiKeyCertificateHash extends js.Object {
  var apiKey: String
  var certificateHash: String
}

object Anon_ApiKeyCertificateHash {
  @scala.inline
  def apply(apiKey: String, certificateHash: String): Anon_ApiKeyCertificateHash = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, certificateHash = certificateHash)
  
    __obj.asInstanceOf[Anon_ApiKeyCertificateHash]
  }
}

