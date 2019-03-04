package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoidedpurchasesResource extends js.Object {
  /** Lists the purchases that were cancelled, refunded or charged-back. */
  def list(request: gapiDotClientDotAndroidpublisherLib.Anon_AltEndTime): gapiDotClientLib.gapiNs.clientNs.Request[VoidedPurchasesListResponse]
}

object VoidedpurchasesResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAndroidpublisherLib.Anon_AltEndTime, 
      gapiDotClientLib.gapiNs.clientNs.Request[VoidedPurchasesListResponse]
    ]
  ): VoidedpurchasesResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[VoidedpurchasesResource]
  }
}

