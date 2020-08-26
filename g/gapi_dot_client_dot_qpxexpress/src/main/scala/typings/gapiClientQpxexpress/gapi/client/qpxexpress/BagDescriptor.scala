package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BagDescriptor extends js.Object {
  /** Provides the commercial name for an optional service. */
  var commercialName: js.UndefOr[String] = js.native
  /** How many of this type of bag will be checked on this flight. */
  var count: js.UndefOr[Double] = js.native
  /** A description of the baggage. */
  var description: js.UndefOr[js.Array[String]] = js.native
  /** Identifies this as a baggage object. Value: the fixed string qpxexpress#bagDescriptor. */
  var kind: js.UndefOr[String] = js.native
  /** The standard IATA subcode used to identify this optional service. */
  var subcode: js.UndefOr[String] = js.native
}

object BagDescriptor {
  @scala.inline
  def apply(): BagDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BagDescriptor]
  }
  @scala.inline
  implicit class BagDescriptorOps[Self <: BagDescriptor] (val x: Self) extends AnyVal {
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
    def setCommercialName(value: String): Self = this.set("commercialName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommercialName: Self = this.set("commercialName", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDescriptionVarargs(value: String*): Self = this.set("description", js.Array(value :_*))
    @scala.inline
    def setDescription(value: js.Array[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSubcode(value: String): Self = this.set("subcode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubcode: Self = this.set("subcode", js.undefined)
  }
  
}

