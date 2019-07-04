package typings
package firebaseDashAdminLib.adminNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The
  * [SAML](http://docs.oasis-open.org/security/saml/Post2.0/sstc-saml-tech-overview-2.0.html)
  * Auth provider configuration interface. A SAML provider can be created via
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#createProviderConfig `createProviderConfig()`}.
  */
trait SAMLAuthProviderConfig extends AuthProviderConfig {
  /**
    * This is fixed and must always be the same as the OAuth redirect URL
    * provisioned by Firebase Auth,
    * `https://project-id.firebaseapp.com/__/auth/handler` unless a custom
    * `authDomain` is used.
    * The callback URL should also be provided to the SAML IdP during
    * configuration.
    */
  var callbackURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The SAML IdP entity identifier.
    */
  var idpEntityId: java.lang.String
  /**
    * The SAML relying party (service provider) entity ID.
    * This is defined by the developer but needs to be provided to the SAML IdP.
    */
  var rpEntityId: java.lang.String
  /**
    * The SAML IdP SSO URL. This must be a valid URL.
    */
  var ssoURL: java.lang.String
  /**
    * The list of SAML IdP X.509 certificates issued by CA for this provider.
    * Multiple certificates are accepted to prevent outages during
    * IdP key rotation (for example ADFS rotates every 10 days). When the Auth
    * server receives a SAML response, it will match the SAML response with the
    * certificate on record. Otherwise the response is rejected.
    * Developers are expected to manage the certificate updates as keys are
    * rotated.
    */
  var x509Certificates: js.Array[java.lang.String]
}

object SAMLAuthProviderConfig {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    enabled: scala.Boolean,
    idpEntityId: java.lang.String,
    providerId: java.lang.String,
    rpEntityId: java.lang.String,
    ssoURL: java.lang.String,
    x509Certificates: js.Array[java.lang.String],
    callbackURL: java.lang.String = null
  ): SAMLAuthProviderConfig = {
    val __obj = js.Dynamic.literal(displayName = displayName, enabled = enabled, idpEntityId = idpEntityId, providerId = providerId, rpEntityId = rpEntityId, ssoURL = ssoURL, x509Certificates = x509Certificates)
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL)
    __obj.asInstanceOf[SAMLAuthProviderConfig]
  }
}

