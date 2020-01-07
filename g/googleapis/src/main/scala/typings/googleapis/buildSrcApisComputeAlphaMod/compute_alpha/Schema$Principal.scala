package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All fields defined in a principal are ANDed.
  */
@js.native
trait Schema$Principal extends js.Object {
  /**
    * An expression to specify custom condition.
    */
  var condition: js.UndefOr[String] = js.native
  /**
    * The groups the principal belongs to. Exact match, prefix match, and
    * suffix match are supported.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /**
    * IPv4 or IPv6 address or range (In CIDR format)
    */
  var ips: js.UndefOr[js.Array[String]] = js.native
  /**
    * The namespaces. Exact match, prefix match, and suffix match are
    * supported.
    */
  var namespaces: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of groups. Specifies exclusions.
    */
  var notGroups: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of IPs. Specifies exclusions.
    */
  var notIps: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of namespaces. Specifies exclusions.
    */
  var notNamespaces: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of users. Specifies exclusions.
    */
  var notUsers: js.UndefOr[js.Array[String]] = js.native
  /**
    * A map of Istio attribute to expected values. Exact match, prefix match,
    * and suffix match are supported for values. For example,
    * `request.headers[version]: ?v1?`. The properties are ANDed together.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The user names/IDs or service accounts. Exact match, prefix match, and
    * suffix match are supported.
    */
  var users: js.UndefOr[js.Array[String]] = js.native
}

object Schema$Principal {
  @scala.inline
  def apply(
    condition: String = null,
    groups: js.Array[String] = null,
    ips: js.Array[String] = null,
    namespaces: js.Array[String] = null,
    notGroups: js.Array[String] = null,
    notIps: js.Array[String] = null,
    notNamespaces: js.Array[String] = null,
    notUsers: js.Array[String] = null,
    properties: StringDictionary[String] = null,
    users: js.Array[String] = null
  ): Schema$Principal = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (ips != null) __obj.updateDynamic("ips")(ips.asInstanceOf[js.Any])
    if (namespaces != null) __obj.updateDynamic("namespaces")(namespaces.asInstanceOf[js.Any])
    if (notGroups != null) __obj.updateDynamic("notGroups")(notGroups.asInstanceOf[js.Any])
    if (notIps != null) __obj.updateDynamic("notIps")(notIps.asInstanceOf[js.Any])
    if (notNamespaces != null) __obj.updateDynamic("notNamespaces")(notNamespaces.asInstanceOf[js.Any])
    if (notUsers != null) __obj.updateDynamic("notUsers")(notUsers.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Principal]
  }
}

