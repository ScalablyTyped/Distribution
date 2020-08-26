package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeBaggageAllowance extends js.Object {
  /** A representation of a type of bag, such as an ATPCo subcode, Commercial Name, or other description. */
  var bagDescriptor: js.UndefOr[js.Array[BagDescriptor]] = js.native
  /** The maximum number of kilos all the free baggage together may weigh. */
  var kilos: js.UndefOr[Double] = js.native
  /** The maximum number of kilos any one piece of baggage may weigh. */
  var kilosPerPiece: js.UndefOr[Double] = js.native
  /** Identifies this as free baggage object, allowed on one segment of a trip. Value: the fixed string qpxexpress#freeBaggageAllowance. */
  var kind: js.UndefOr[String] = js.native
  /** The number of free pieces of baggage allowed. */
  var pieces: js.UndefOr[Double] = js.native
  /** The number of pounds of free baggage allowed. */
  var pounds: js.UndefOr[Double] = js.native
}

object FreeBaggageAllowance {
  @scala.inline
  def apply(): FreeBaggageAllowance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBaggageAllowance]
  }
  @scala.inline
  implicit class FreeBaggageAllowanceOps[Self <: FreeBaggageAllowance] (val x: Self) extends AnyVal {
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
    def setBagDescriptorVarargs(value: BagDescriptor*): Self = this.set("bagDescriptor", js.Array(value :_*))
    @scala.inline
    def setBagDescriptor(value: js.Array[BagDescriptor]): Self = this.set("bagDescriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBagDescriptor: Self = this.set("bagDescriptor", js.undefined)
    @scala.inline
    def setKilos(value: Double): Self = this.set("kilos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKilos: Self = this.set("kilos", js.undefined)
    @scala.inline
    def setKilosPerPiece(value: Double): Self = this.set("kilosPerPiece", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKilosPerPiece: Self = this.set("kilosPerPiece", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPieces(value: Double): Self = this.set("pieces", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePieces: Self = this.set("pieces", js.undefined)
    @scala.inline
    def setPounds(value: Double): Self = this.set("pounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePounds: Self = this.set("pounds", js.undefined)
  }
  
}

