package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSubnetworksScopedList extends js.Object {
  /**
    * A list of subnetworks contained in this scope.
    */
  var subnetworks: js.UndefOr[js.Array[SchemaSubnetwork]] = js.native
  /**
    * An informational warning that appears when the list of addresses is
    * empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaSubnetworksScopedList {
  @scala.inline
  def apply(): SchemaSubnetworksScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetworksScopedList]
  }
  @scala.inline
  implicit class SchemaSubnetworksScopedListOps[Self <: SchemaSubnetworksScopedList] (val x: Self) extends AnyVal {
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
    def setSubnetworksVarargs(value: SchemaSubnetwork*): Self = this.set("subnetworks", js.Array(value :_*))
    @scala.inline
    def setSubnetworks(value: js.Array[SchemaSubnetwork]): Self = this.set("subnetworks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetworks: Self = this.set("subnetworks", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

