package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule for automatically choosing a private key and certificate to
  * authenticate the device to a server.
  */
@js.native
trait SchemaChoosePrivateKeyRule extends js.Object {
  /**
    * The package names for which outgoing requests are subject to this rule.
    * If no package names are specified, then the rule applies to all packages.
    * For each package name listed, the rule applies to that package and all
    * other packages that shared the same Android UID. The SHA256 hash of the
    * signing key signatures of each package_name will be verified against
    * those provided by Play
    */
  var packageNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The alias of the private key to be used.
    */
  var privateKeyAlias: js.UndefOr[String] = js.native
  /**
    * The URL pattern to match against the URL of the outgoing request. The
    * pattern may contain asterisk (*) wildcards. Any URL is matched if
    * unspecified.
    */
  var urlPattern: js.UndefOr[String] = js.native
}

object SchemaChoosePrivateKeyRule {
  @scala.inline
  def apply(packageNames: js.Array[String] = null, privateKeyAlias: String = null, urlPattern: String = null): SchemaChoosePrivateKeyRule = {
    val __obj = js.Dynamic.literal()
    if (packageNames != null) __obj.updateDynamic("packageNames")(packageNames.asInstanceOf[js.Any])
    if (privateKeyAlias != null) __obj.updateDynamic("privateKeyAlias")(privateKeyAlias.asInstanceOf[js.Any])
    if (urlPattern != null) __obj.updateDynamic("urlPattern")(urlPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChoosePrivateKeyRule]
  }
}

