package typings.googleFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object google extends js.Object {
    
    @js.native
    object feeds extends js.Object {
      
      @js.native
      class Feed ()
        extends typings.googleFeeds.google.feeds.Feed {
        def this(url: String) = this()
      }
    }
  }
}
