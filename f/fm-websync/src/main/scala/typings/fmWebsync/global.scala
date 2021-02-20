package typings.fmWebsync

import typings.fmWebsync.fm.websync.initializeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object fm {
    
    object websync {
      
      @JSGlobal("fm.websync.client")
      @js.native
      class client ()
        extends typings.fmWebsync.fm.websync.client
      object client {
        
        /**
          * Initializes the client according to the specified configuration.
          * This method must always be called first. While is always executes synchronously, callbacks are allowed for the purposes of method chaining.
          */
        /* static member */
        @JSGlobal("fm.websync.client.initialize")
        @js.native
        def initialize(config: initializeConfig): typings.fmWebsync.fm.websync.client = js.native
      }
    }
  }
}
