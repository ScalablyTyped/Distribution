package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiKeyCertificateHash extends js.Object {
  var apiKey: java.lang.String
  var certificateHash: java.lang.String
}

object Anon_ApiKeyCertificateHash {
  @scala.inline
  def apply(apiKey: java.lang.String, certificateHash: java.lang.String): Anon_ApiKeyCertificateHash = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, certificateHash = certificateHash)
  
    __obj.asInstanceOf[Anon_ApiKeyCertificateHash]
  }
}

