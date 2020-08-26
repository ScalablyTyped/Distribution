package typings.gapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedZone extends js.Object {
  /** The time that this resource was created on the server. This is in RFC3339 text format. Output only. */
  var creationTime: js.UndefOr[String] = js.native
  /** A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the managed zone's function. */
  var description: js.UndefOr[String] = js.native
  /** The DNS name of this managed zone, for instance "example.com.". */
  var dnsName: js.UndefOr[String] = js.native
  /** Unique identifier for the resource; defined by the server (output only) */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dns#managedZone". */
  var kind: js.UndefOr[String] = js.native
  /**
    * User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a
    * letter or digit, and only contain lowercase letters, digits or dashes.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most
    * users will leave this field unset.
    */
  var nameServerSet: js.UndefOr[String] = js.native
  /** Delegate your managed_zone to these virtual name servers; defined by the server (output only) */
  var nameServers: js.UndefOr[js.Array[String]] = js.native
}

object ManagedZone {
  @scala.inline
  def apply(): ManagedZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZone]
  }
  @scala.inline
  implicit class ManagedZoneOps[Self <: ManagedZone] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDnsName(value: String): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsName: Self = this.set("dnsName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameServerSet(value: String): Self = this.set("nameServerSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameServerSet: Self = this.set("nameServerSet", js.undefined)
    @scala.inline
    def setNameServersVarargs(value: String*): Self = this.set("nameServers", js.Array(value :_*))
    @scala.inline
    def setNameServers(value: js.Array[String]): Self = this.set("nameServers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameServers: Self = this.set("nameServers", js.undefined)
  }
  
}

