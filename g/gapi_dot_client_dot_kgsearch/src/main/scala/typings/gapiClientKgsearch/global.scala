package typings.gapiClientKgsearch

import typings.gapiClientKgsearch.gapi.client.kgsearch.EntitiesResource
import typings.gapiClientKgsearch.gapiClientKgsearchStrings.kgsearch
import typings.gapiClientKgsearch.gapiClientKgsearchStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val entities: EntitiesResource = js.native
      /** Load Knowledge Graph Search API v1 */
      def load(name: kgsearch, version: v1): js.Thenable[Unit] = js.native
      def load(name: kgsearch, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

