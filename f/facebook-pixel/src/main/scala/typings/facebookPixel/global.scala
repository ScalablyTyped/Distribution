package typings.facebookPixel

import typings.facebookPixel.facebook.Pixel.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("fbq")
  @js.native
  def fbq: Event = js.native
  @scala.inline
  def fbq_=(x: Event): Unit = js.Dynamic.global.updateDynamic("fbq")(x.asInstanceOf[js.Any])
  
  object facebook {
    
    object Pixel {
      
      // For Facebook Tag API using Dynamic Product Ads
      object DPA
    }
  }
}
