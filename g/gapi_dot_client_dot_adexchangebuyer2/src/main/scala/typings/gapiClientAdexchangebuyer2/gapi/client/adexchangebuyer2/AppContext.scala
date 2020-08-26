package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppContext extends js.Object {
  /** The app types this restriction applies to. */
  var appTypes: js.UndefOr[js.Array[String]] = js.native
}

object AppContext {
  @scala.inline
  def apply(): AppContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppContext]
  }
  @scala.inline
  implicit class AppContextOps[Self <: AppContext] (val x: Self) extends AnyVal {
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
    def setAppTypesVarargs(value: String*): Self = this.set("appTypes", js.Array(value :_*))
    @scala.inline
    def setAppTypes(value: js.Array[String]): Self = this.set("appTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppTypes: Self = this.set("appTypes", js.undefined)
  }
  
}

