package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message defines request authentication attributes. Terminology is
  * based on the JSON Web Token (JWT) standard, but the terms also correlate to
  * concepts in other standards.
  */
@js.native
trait Schema$Auth extends js.Object {
  /**
    * A list of access level resource names that allow resources to be accessed
    * by authenticated requester. It is part of Secure GCP processing for the
    * incoming request. An access level string has the format:
    * &quot;//{api_service_name}/accessPolicies/{policy_id}/accessLevels/{short_name}&quot;
    * Example:
    * &quot;//accesscontextmanager.googleapis.com/accessPolicies/MY_POLICY_ID/accessLevels/MY_LEVEL&quot;
    */
  var accessLevels: js.UndefOr[js.Array[String]] = js.native
  /**
    * The intended audience(s) for this authentication information. Reflects
    * the audience (`aud`) claim within a JWT. The audience value(s) depends on
    * the `issuer`, but typically include one or more of the following pieces
    * of information:  *  The services intended to receive the credential such
    * as    [&quot;pubsub.googleapis.com&quot;,
    * &quot;storage.googleapis.com&quot;] *  A set of service-based scopes. For
    * example,    [&quot;https://www.googleapis.com/auth/cloud-platform&quot;]
    * *  The client id of an app, such as the Firebase project id for JWTs from
    * Firebase Auth.  Consult the documentation for the credential issuer to
    * determine the information provided.
    */
  var audiences: js.UndefOr[js.Array[String]] = js.native
  /**
    * Structured claims presented with the credential. JWTs include `{key:
    * value}` pairs for standard and private claims. The following is a subset
    * of the standard required and optional claims that would typically be
    * presented for a Google-based JWT:     {&#39;iss&#39;:
    * &#39;accounts.google.com&#39;,     &#39;sub&#39;:
    * &#39;113289723416554971153&#39;,     &#39;aud&#39;:
    * [&#39;123456789012&#39;, &#39;pubsub.googleapis.com&#39;], &#39;azp&#39;:
    * &#39;123456789012.apps.googleusercontent.com&#39;,     &#39;email&#39;:
    * &#39;jsmith@example.com&#39;,     &#39;iat&#39;: 1353601026,
    * &#39;exp&#39;: 1353604926}  SAML assertions are similarly specified, but
    * with an identity provider dependent structure.
    */
  var claims: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The authorized presenter of the credential. Reflects the optional
    * Authorized Presenter (`azp`) claim within a JWT or the OAuth client id.
    * For example, a Google Cloud Platform client id looks as follows:
    * &quot;123456789012.apps.googleusercontent.com&quot;.
    */
  var presenter: js.UndefOr[String] = js.native
  /**
    * The authenticated principal. Reflects the issuer (`iss`) and subject
    * (`sub`) claims within a JWT. The issuer and subject should be `/`
    * delimited, with `/` percent-encoded within the subject fragment. For
    * Google accounts, the principal format is:
    * &quot;https://accounts.google.com/{id}&quot;
    */
  var principal: js.UndefOr[String] = js.native
}

object Schema$Auth {
  @scala.inline
  def apply(
    accessLevels: js.Array[String] = null,
    audiences: js.Array[String] = null,
    claims: StringDictionary[js.Any] = null,
    presenter: String = null,
    principal: String = null
  ): Schema$Auth = {
    val __obj = js.Dynamic.literal()
    if (accessLevels != null) __obj.updateDynamic("accessLevels")(accessLevels.asInstanceOf[js.Any])
    if (audiences != null) __obj.updateDynamic("audiences")(audiences.asInstanceOf[js.Any])
    if (claims != null) __obj.updateDynamic("claims")(claims.asInstanceOf[js.Any])
    if (presenter != null) __obj.updateDynamic("presenter")(presenter.asInstanceOf[js.Any])
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Auth]
  }
}

