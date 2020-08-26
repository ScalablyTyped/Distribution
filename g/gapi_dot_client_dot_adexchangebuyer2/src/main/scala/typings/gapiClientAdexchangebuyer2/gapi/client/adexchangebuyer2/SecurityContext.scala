package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityContext extends js.Object {
  /** The security types in this context. */
  var securities: js.UndefOr[js.Array[String]] = js.native
}

object SecurityContext {
  @scala.inline
  def apply(): SecurityContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityContext]
  }
  @scala.inline
  implicit class SecurityContextOps[Self <: SecurityContext] (val x: Self) extends AnyVal {
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
    def setSecuritiesVarargs(value: String*): Self = this.set("securities", js.Array(value :_*))
    @scala.inline
    def setSecurities(value: js.Array[String]): Self = this.set("securities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurities: Self = this.set("securities", js.undefined)
  }
  
}

