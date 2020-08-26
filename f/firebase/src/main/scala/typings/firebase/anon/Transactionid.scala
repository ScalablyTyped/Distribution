package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transactionid
  extends /* key */ StringDictionary[js.Any] {
  var currency: js.UndefOr[String] = js.native
  var transaction_id: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
}

object Transactionid {
  @scala.inline
  def apply(): Transactionid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transactionid]
  }
  @scala.inline
  implicit class TransactionidOps[Self <: Transactionid] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setTransaction_id(value: String): Self = this.set("transaction_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransaction_id: Self = this.set("transaction_id", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

