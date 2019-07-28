package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidpublisher.Anon_AltEndTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoidedpurchasesResource extends js.Object {
  /** Lists the purchases that were cancelled, refunded or charged-back. */
  def list(request: Anon_AltEndTime): Request[VoidedPurchasesListResponse]
}

object VoidedpurchasesResource {
  @scala.inline
  def apply(list: Anon_AltEndTime => Request[VoidedPurchasesListResponse]): VoidedpurchasesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VoidedpurchasesResource]
  }
}

