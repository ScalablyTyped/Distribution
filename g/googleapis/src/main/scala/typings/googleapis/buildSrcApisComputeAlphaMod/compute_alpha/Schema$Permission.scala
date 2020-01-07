package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All fields defined in a permission are ANDed.
  */
@js.native
trait Schema$Permission extends js.Object {
  /**
    * Extra custom constraints. The constraints are ANDed together.
    */
  var constraints: js.UndefOr[js.Array[Schema$PermissionConstraint]] = js.native
  /**
    * Used in Ingress or Egress Gateway cases to specify hosts that the policy
    * applies to. Exact match, prefix match, and suffix match are supported.
    */
  var hosts: js.UndefOr[js.Array[String]] = js.native
  /**
    * HTTP method.
    */
  var methods: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of hosts. Specifies exclusions.
    */
  var notHosts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of methods. Specifies exclusions.
    */
  var notMethods: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of paths. Specifies exclusions.
    */
  var notPaths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Negate of ports. Specifies exclusions.
    */
  var notPorts: js.UndefOr[js.Array[String]] = js.native
  /**
    * HTTP request paths or gRPC methods. Exact match, prefix match, and suffix
    * match are supported.
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
  /**
    * Port names or numbers.
    */
  var ports: js.UndefOr[js.Array[String]] = js.native
}

object Schema$Permission {
  @scala.inline
  def apply(
    constraints: js.Array[Schema$PermissionConstraint] = null,
    hosts: js.Array[String] = null,
    methods: js.Array[String] = null,
    notHosts: js.Array[String] = null,
    notMethods: js.Array[String] = null,
    notPaths: js.Array[String] = null,
    notPorts: js.Array[String] = null,
    paths: js.Array[String] = null,
    ports: js.Array[String] = null
  ): Schema$Permission = {
    val __obj = js.Dynamic.literal()
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (notHosts != null) __obj.updateDynamic("notHosts")(notHosts.asInstanceOf[js.Any])
    if (notMethods != null) __obj.updateDynamic("notMethods")(notMethods.asInstanceOf[js.Any])
    if (notPaths != null) __obj.updateDynamic("notPaths")(notPaths.asInstanceOf[js.Any])
    if (notPorts != null) __obj.updateDynamic("notPorts")(notPorts.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Permission]
  }
}

