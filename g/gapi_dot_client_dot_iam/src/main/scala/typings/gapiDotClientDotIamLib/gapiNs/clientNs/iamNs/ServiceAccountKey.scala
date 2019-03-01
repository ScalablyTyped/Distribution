package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountKey extends js.Object {
  /** Specifies the algorithm (and possibly key size) for the key. */
  var keyAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The resource name of the service account key in the following format
    * `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}/keys/{key}`.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The private key data. Only provided in `CreateServiceAccountKey`
    * responses. Make sure to keep the private key data secure because it
    * allows for the assertion of the service account identity.
    * When decoded, the private key data can be used to authenticate with
    * Google API client libraries and with
    * <a href="/sdk/gcloud/reference/auth/activate-service-account">gcloud
    * auth activate-service-account</a>.
    */
  var privateKeyData: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The output format for the private key.
    * Only provided in `CreateServiceAccountKey` responses, not
    * in `GetServiceAccountKey` or `ListServiceAccountKey` responses.
    *
    * Google never exposes system-managed private keys, and never retains
    * user-managed private keys.
    */
  var privateKeyType: js.UndefOr[java.lang.String] = js.undefined
  /** The public key data. Only provided in `GetServiceAccountKey` responses. */
  var publicKeyData: js.UndefOr[java.lang.String] = js.undefined
  /** The key can be used after this timestamp. */
  var validAfterTime: js.UndefOr[java.lang.String] = js.undefined
  /** The key can be used before this timestamp. */
  var validBeforeTime: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceAccountKey {
  @scala.inline
  def apply(
    keyAlgorithm: java.lang.String = null,
    name: java.lang.String = null,
    privateKeyData: java.lang.String = null,
    privateKeyType: java.lang.String = null,
    publicKeyData: java.lang.String = null,
    validAfterTime: java.lang.String = null,
    validBeforeTime: java.lang.String = null
  ): ServiceAccountKey = {
    val __obj = js.Dynamic.literal()
    if (keyAlgorithm != null) __obj.updateDynamic("keyAlgorithm")(keyAlgorithm)
    if (name != null) __obj.updateDynamic("name")(name)
    if (privateKeyData != null) __obj.updateDynamic("privateKeyData")(privateKeyData)
    if (privateKeyType != null) __obj.updateDynamic("privateKeyType")(privateKeyType)
    if (publicKeyData != null) __obj.updateDynamic("publicKeyData")(publicKeyData)
    if (validAfterTime != null) __obj.updateDynamic("validAfterTime")(validAfterTime)
    if (validBeforeTime != null) __obj.updateDynamic("validBeforeTime")(validBeforeTime)
    __obj.asInstanceOf[ServiceAccountKey]
  }
}

