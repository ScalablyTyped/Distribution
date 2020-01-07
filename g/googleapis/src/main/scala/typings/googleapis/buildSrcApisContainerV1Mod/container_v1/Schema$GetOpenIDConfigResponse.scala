package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GetOpenIDConfigResponse is an OIDC discovery document for the cluster. See
  * the OpenID Connect Discovery 1.0 specification for details.
  */
@js.native
trait Schema$GetOpenIDConfigResponse extends js.Object {
  /**
    * NOLINT
    */
  var claims_supported: js.UndefOr[js.Array[String]] = js.native
  /**
    * NOLINT
    */
  var grant_types: js.UndefOr[js.Array[String]] = js.native
  /**
    * NOLINT
    */
  var id_token_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.native
  /**
    * NOLINT
    */
  var issuer: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var jwks_uri: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var response_types_supported: js.UndefOr[js.Array[String]] = js.native
  /**
    * NOLINT
    */
  var subject_types_supported: js.UndefOr[js.Array[String]] = js.native
}

object Schema$GetOpenIDConfigResponse {
  @scala.inline
  def apply(
    claims_supported: js.Array[String] = null,
    grant_types: js.Array[String] = null,
    id_token_signing_alg_values_supported: js.Array[String] = null,
    issuer: String = null,
    jwks_uri: String = null,
    response_types_supported: js.Array[String] = null,
    subject_types_supported: js.Array[String] = null
  ): Schema$GetOpenIDConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (claims_supported != null) __obj.updateDynamic("claims_supported")(claims_supported.asInstanceOf[js.Any])
    if (grant_types != null) __obj.updateDynamic("grant_types")(grant_types.asInstanceOf[js.Any])
    if (id_token_signing_alg_values_supported != null) __obj.updateDynamic("id_token_signing_alg_values_supported")(id_token_signing_alg_values_supported.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (jwks_uri != null) __obj.updateDynamic("jwks_uri")(jwks_uri.asInstanceOf[js.Any])
    if (response_types_supported != null) __obj.updateDynamic("response_types_supported")(response_types_supported.asInstanceOf[js.Any])
    if (subject_types_supported != null) __obj.updateDynamic("subject_types_supported")(subject_types_supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetOpenIDConfigResponse]
  }
}

