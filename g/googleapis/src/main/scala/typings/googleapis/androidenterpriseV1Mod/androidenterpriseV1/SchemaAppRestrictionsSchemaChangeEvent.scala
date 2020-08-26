package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a new app version is uploaded to Google Play and
  * its app restrictions schema changed. To fetch the app restrictions schema
  * for an app, use Products.getAppRestrictionsSchema on the EMM API.
  */
@js.native
trait SchemaAppRestrictionsSchemaChangeEvent extends js.Object {
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) for
    * which the app restriction schema changed. This field will always be
    * present.
    */
  var productId: js.UndefOr[String] = js.native
}

object SchemaAppRestrictionsSchemaChangeEvent {
  @scala.inline
  def apply(): SchemaAppRestrictionsSchemaChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppRestrictionsSchemaChangeEvent]
  }
  @scala.inline
  implicit class SchemaAppRestrictionsSchemaChangeEventOps[Self <: SchemaAppRestrictionsSchemaChangeEvent] (val x: Self) extends AnyVal {
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

