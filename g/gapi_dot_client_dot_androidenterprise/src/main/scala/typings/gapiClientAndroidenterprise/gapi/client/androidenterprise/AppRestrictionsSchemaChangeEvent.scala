package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppRestrictionsSchemaChangeEvent extends js.Object {
  /** The id of the product (e.g. "app:com.google.android.gm") for which the app restriction schema changed. This field will always be present. */
  var productId: js.UndefOr[String] = js.native
}

object AppRestrictionsSchemaChangeEvent {
  @scala.inline
  def apply(): AppRestrictionsSchemaChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRestrictionsSchemaChangeEvent]
  }
  @scala.inline
  implicit class AppRestrictionsSchemaChangeEventOps[Self <: AppRestrictionsSchemaChangeEvent] (val x: Self) extends AnyVal {
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
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
  }
  
}

