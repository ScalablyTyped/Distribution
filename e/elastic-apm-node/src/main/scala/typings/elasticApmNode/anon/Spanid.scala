package typings.elasticApmNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spanid extends js.Object {
  
  @JSName("span.id")
  var spanDotid: js.UndefOr[String] = js.native
  
  @JSName("trace.id")
  var traceDotid: js.UndefOr[String] = js.native
  
  @JSName("transaction.id")
  var transactionDotid: js.UndefOr[String] = js.native
}
object Spanid {
  
  @scala.inline
  def apply(): Spanid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spanid]
  }
  
  @scala.inline
  implicit class SpanidOps[Self <: Spanid] (val x: Self) extends AnyVal {
    
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
    def setSpanDotid(value: String): Self = this.set("span.id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpanDotid: Self = this.set("span.id", js.undefined)
    
    @scala.inline
    def setTraceDotid(value: String): Self = this.set("trace.id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceDotid: Self = this.set("trace.id", js.undefined)
    
    @scala.inline
    def setTransactionDotid(value: String): Self = this.set("transaction.id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionDotid: Self = this.set("transaction.id", js.undefined)
  }
}
