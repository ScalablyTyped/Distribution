package typings.gapiDotClientDotSiteverification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Identifier extends js.Object {
  /** The site identifier. If the type is set to SITE, the identifier is a URL. If the type is set to INET_DOMAIN, the site identifier is a domain name. */
  var identifier: js.UndefOr[String] = js.undefined
  /** The site type. Can be SITE or INET_DOMAIN (domain name). */
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Identifier {
  @scala.inline
  def apply(identifier: String = null, `type`: String = null): Anon_Identifier = {
    val __obj = js.Dynamic.literal()
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Identifier]
  }
}

