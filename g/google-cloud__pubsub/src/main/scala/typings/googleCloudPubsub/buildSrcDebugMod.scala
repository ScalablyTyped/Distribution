package typings.googleCloudPubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDebugMod {
  
  @JSImport("@google-cloud/pubsub/build/src/debug", "DebugMessage")
  @js.native
  open class DebugMessage protected () extends StObject {
    def this(message: String) = this()
    def this(message: String, error: js.Error) = this()
    
    var error: js.UndefOr[js.Error] = js.native
    
    var message: String = js.native
  }
}
