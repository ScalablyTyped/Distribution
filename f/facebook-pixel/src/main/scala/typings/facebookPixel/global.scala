package typings.facebookPixel

import typings.facebookPixel.facebook.Pixel.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var fbq: Event = js.native
  
  @js.native
  object facebook extends js.Object {
    
    @js.native
    object Pixel extends js.Object {
      
      // For Facebook Tag API using Dynamic Product Ads
      @js.native
      object DPA extends js.Object
    }
  }
}
