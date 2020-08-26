package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A condition necessary for an `AccessLevel` to be granted. The Condition is
  * an AND over its fields. So a Condition is true if: 1) the request IP is
  * from one of the listed subnetworks AND 2) the originating device complies
  * with the listed device policy AND 3) all listed access levels are granted
  * AND 4) the request was sent at a time allowed by the DateTimeRestriction.
  */
@js.native
trait SchemaCondition extends js.Object {
  /**
    * Device specific restrictions, all restrictions must hold for the
    * Condition to be true. If not specified, all devices are allowed.
    */
  var devicePolicy: js.UndefOr[SchemaDevicePolicy] = js.native
  /**
    * CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that
    * for a CIDR IP address block, the specified IP address portion must be
    * properly truncated (i.e. all the host bits must be zero) or the input is
    * considered malformed. For example, &quot;192.0.2.0/24&quot; is accepted
    * but &quot;192.0.2.1/24&quot; is not. Similarly, for IPv6,
    * &quot;2001:db8::/32&quot; is accepted whereas &quot;2001:db8::1/32&quot;
    * is not. The originating IP of a request must be in one of the listed
    * subnets in order for this Condition to be true. If empty, all IP
    * addresses are allowed.
    */
  var ipSubnetworks: js.UndefOr[js.Array[String]] = js.native
  /**
    * The request must be made by one of the provided user or service accounts.
    * Groups are not supported. Syntax: `user:{emailid}`
    * `serviceAccount:{emailid}` If not specified, a request may come from any
    * user.
    */
  var members: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether to negate the Condition. If true, the Condition becomes a NAND
    * over its non-empty fields, each field must be false for the Condition
    * overall to be satisfied. Defaults to false.
    */
  var negate: js.UndefOr[Boolean] = js.native
  /**
    * The request must originate from one of the provided countries/regions.
    * Must be valid ISO 3166-1 alpha-2 codes.
    */
  var regions: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of other access levels defined in the same `Policy`, referenced by
    * resource name. Referencing an `AccessLevel` which does not exist is an
    * error. All access levels listed must be granted for the Condition to be
    * true. Example:
    * &quot;`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME&quot;`
    */
  var requiredAccessLevels: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCondition {
  @scala.inline
  def apply(): SchemaCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCondition]
  }
  @scala.inline
  implicit class SchemaConditionOps[Self <: SchemaCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDevicePolicy(value: SchemaDevicePolicy): Self = this.set("devicePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevicePolicy: Self = this.set("devicePolicy", js.undefined)
    @scala.inline
    def setIpSubnetworksVarargs(value: String*): Self = this.set("ipSubnetworks", js.Array(value :_*))
    @scala.inline
    def setIpSubnetworks(value: js.Array[String]): Self = this.set("ipSubnetworks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpSubnetworks: Self = this.set("ipSubnetworks", js.undefined)
    @scala.inline
    def setMembersVarargs(value: String*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[String]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    @scala.inline
    def setNegate(value: Boolean): Self = this.set("negate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegate: Self = this.set("negate", js.undefined)
    @scala.inline
    def setRegionsVarargs(value: String*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: js.Array[String]): Self = this.set("regions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    @scala.inline
    def setRequiredAccessLevelsVarargs(value: String*): Self = this.set("requiredAccessLevels", js.Array(value :_*))
    @scala.inline
    def setRequiredAccessLevels(value: js.Array[String]): Self = this.set("requiredAccessLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredAccessLevels: Self = this.set("requiredAccessLevels", js.undefined)
  }
  
}

