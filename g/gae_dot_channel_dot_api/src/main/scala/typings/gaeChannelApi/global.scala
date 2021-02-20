package typings.gaeChannelApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object goog {
    
    object appengine {
      
      @JSGlobal("goog.appengine.Channel")
      @js.native
      class Channel protected ()
        extends typings.gaeChannelApi.goog.appengine.Channel {
        /**
          * Create a channel object using the token returned by the createChannel() call on the server.
          * @param token {string}
          */
        def this(token: String) = this()
      }
      
      @JSGlobal("goog.appengine.Socket")
      @js.native
      class Socket ()
        extends typings.gaeChannelApi.goog.appengine.Socket
    }
  }
}
