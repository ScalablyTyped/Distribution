package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when a new version of an app is uploaded to Google Play.
  * Notifications are sent for new public versions only: alpha, beta, or canary
  * versions do not generate this event. To fetch up-to-date version history
  * for an app, use Products.Get on the EMM API.
  */
trait SchemaAppUpdateEvent extends StObject {
  
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) that
    * was updated. This field will always be present.
    */
  var productId: js.UndefOr[String] = js.undefined
}
object SchemaAppUpdateEvent {
  
  @scala.inline
  def apply(): SchemaAppUpdateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppUpdateEvent]
  }
  
  @scala.inline
  implicit class SchemaAppUpdateEventMutableBuilder[Self <: SchemaAppUpdateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
