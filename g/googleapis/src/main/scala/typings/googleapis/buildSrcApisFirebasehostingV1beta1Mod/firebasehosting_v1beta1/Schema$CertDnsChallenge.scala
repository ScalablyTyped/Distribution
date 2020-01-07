package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a DNS certificate challenge.
  */
@js.native
trait Schema$CertDnsChallenge extends js.Object {
  /**
    * The domain name upon which the DNS challenge must be satisfied.
    */
  var domainName: js.UndefOr[String] = js.native
  /**
    * The value that must be present as a TXT record on the domain name to
    * satisfy the challenge.
    */
  var token: js.UndefOr[String] = js.native
}

object Schema$CertDnsChallenge {
  @scala.inline
  def apply(domainName: String = null, token: String = null): Schema$CertDnsChallenge = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CertDnsChallenge]
  }
}

