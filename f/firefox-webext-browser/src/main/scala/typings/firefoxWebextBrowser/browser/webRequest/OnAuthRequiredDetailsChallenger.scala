package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The server requesting authentication. */
@js.native
trait OnAuthRequiredDetailsChallenger extends StObject {
  
  var host: String = js.native
  
  var port: Double = js.native
}
object OnAuthRequiredDetailsChallenger {
  
  @scala.inline
  def apply(host: String, port: Double): OnAuthRequiredDetailsChallenger = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAuthRequiredDetailsChallenger]
  }
  
  @scala.inline
  implicit class OnAuthRequiredDetailsChallengerMutableBuilder[Self <: OnAuthRequiredDetailsChallenger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
