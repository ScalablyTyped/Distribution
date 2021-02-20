package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event generated when a new app version is uploaded to Google Play and
  * its app restrictions schema changed. To fetch the app restrictions schema
  * for an app, use Products.getAppRestrictionsSchema on the EMM API.
  */
@js.native
trait SchemaAppRestrictionsSchemaChangeEvent extends StObject {
  
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
  implicit class SchemaAppRestrictionsSchemaChangeEventMutableBuilder[Self <: SchemaAppRestrictionsSchemaChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
