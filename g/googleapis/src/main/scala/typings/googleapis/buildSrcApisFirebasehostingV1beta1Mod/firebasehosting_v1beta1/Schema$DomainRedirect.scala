package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the behavior of a domain-level redirect. Domain redirects preserve
  * the path of the redirect but replace the requested domain with the one
  * specified in the redirect configuration.
  */
@js.native
trait Schema$DomainRedirect extends js.Object {
  /**
    * Required. The domain name to redirect to.
    */
  var domainName: js.UndefOr[String] = js.native
  /**
    * Required. The redirect status code.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$DomainRedirect {
  @scala.inline
  def apply(domainName: String = null, `type`: String = null): Schema$DomainRedirect = {
    val __obj = js.Dynamic.literal()
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DomainRedirect]
  }
}

