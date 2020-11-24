package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when a new version of an app is uploaded to Google Play.
  * Notifications are sent for new public versions only: alpha, beta, or canary
  * versions do not generate this event. To fetch up-to-date version history
  * for an app, use Products.Get on the EMM API.
  */
@js.native
trait SchemaAppUpdateEvent extends js.Object {
  
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) that
    * was updated. This field will always be present.
    */
  var productId: js.UndefOr[String] = js.native
}
object SchemaAppUpdateEvent {
  
  @scala.inline
  def apply(): SchemaAppUpdateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppUpdateEvent]
  }
  
  @scala.inline
  implicit class SchemaAppUpdateEventOps[Self <: SchemaAppUpdateEvent] (val x: Self) extends AnyVal {
    
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
