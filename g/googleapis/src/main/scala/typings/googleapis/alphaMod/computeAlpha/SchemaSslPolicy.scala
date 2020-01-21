package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SSL policy specifies the server-side support for SSL features. This can
  * be attached to a TargetHttpsProxy or a TargetSslProxy. This affects
  * connections between clients and the HTTPS or SSL proxy load balancer. They
  * do not affect the connection between the load balancers and the backends.
  */
@js.native
trait SchemaSslPolicy extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * A list of features enabled when the selected profile is CUSTOM. The -
    * method returns the set of features that can be specified in this list.
    * This field must be empty if the profile is not CUSTOM.
    */
  var customFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The list of features enabled in the SSL policy.
    */
  var enabledFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * Fingerprint of this resource. A hash of the contents stored in this
    * object. This field is used in optimistic locking. This field will be
    * ignored when inserting a SslPolicy. An up-to-date fingerprint must be
    * provided in order to update the SslPolicy, otherwise the request will
    * fail with error 412 conditionNotMet.  To see the latest fingerprint, make
    * a get() request to retrieve an SslPolicy.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output only] Type of the resource. Always compute#sslPolicyfor SSL
    * policies.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The minimum version of SSL protocol that can be used by the clients to
    * establish a connection with the load balancer. This can be one of
    * TLS_1_0, TLS_1_1, TLS_1_2.
    */
  var minTlsVersion: js.UndefOr[String] = js.native
  /**
    * Name of the resource. The name must be 1-63 characters long, and comply
    * with RFC1035. Specifically, the name must be 1-63 characters long and
    * match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
    * first character must be a lowercase letter, and all following characters
    * must be a dash, lowercase letter, or digit, except the last character,
    * which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Profile specifies the set of SSL features that can be used by the load
    * balancer when negotiating SSL with clients. This can be one of
    * COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of
    * SSL features to enable must be specified in the customFeatures field.
    */
  var profile: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * Security settings for the proxy. This field is only applicable to a
    * global backend service with the loadBalancingScheme set to
    * INTERNAL_SELF_MANAGED.
    */
  var tlsSettings: js.UndefOr[SchemaServerTlsSettings] = js.native
  /**
    * [Output Only] If potential misconfigurations are detected for this SSL
    * policy, this field will be populated with warning messages.
    */
  var warnings: js.UndefOr[js.Array[AnonCode]] = js.native
}

object SchemaSslPolicy {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    customFeatures: js.Array[String] = null,
    description: String = null,
    enabledFeatures: js.Array[String] = null,
    fingerprint: String = null,
    id: String = null,
    kind: String = null,
    minTlsVersion: String = null,
    name: String = null,
    profile: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    tlsSettings: SchemaServerTlsSettings = null,
    warnings: js.Array[AnonCode] = null
  ): SchemaSslPolicy = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (customFeatures != null) __obj.updateDynamic("customFeatures")(customFeatures.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enabledFeatures != null) __obj.updateDynamic("enabledFeatures")(enabledFeatures.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (minTlsVersion != null) __obj.updateDynamic("minTlsVersion")(minTlsVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (tlsSettings != null) __obj.updateDynamic("tlsSettings")(tlsSettings.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSslPolicy]
  }
}

