package typings.gapiClientProximitybeacon.gapi.client.proximitybeacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Namespace extends js.Object {
  /**
    * Resource name of this namespace. Namespaces names have the format:
    * <code>namespaces/<var>namespace</var></code>.
    */
  var namespaceName: js.UndefOr[String] = js.native
  /**
    * Specifies what clients may receive attachments under this namespace
    * via `beaconinfo.getforobserved`.
    */
  var servingVisibility: js.UndefOr[String] = js.native
}

object Namespace {
  @scala.inline
  def apply(): Namespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Namespace]
  }
  @scala.inline
  implicit class NamespaceOps[Self <: Namespace] (val x: Self) extends AnyVal {
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
    def setNamespaceName(value: String): Self = this.set("namespaceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceName: Self = this.set("namespaceName", js.undefined)
    @scala.inline
    def setServingVisibility(value: String): Self = this.set("servingVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServingVisibility: Self = this.set("servingVisibility", js.undefined)
  }
  
}

