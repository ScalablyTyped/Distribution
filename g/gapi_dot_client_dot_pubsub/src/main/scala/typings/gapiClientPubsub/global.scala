package typings.gapiClientPubsub

import typings.gapiClientPubsub.gapi.client.pubsub.ProjectsResource
import typings.gapiClientPubsub.gapiClientPubsubStrings.pubsub
import typings.gapiClientPubsub.gapiClientPubsubStrings.v1
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
      val projects: ProjectsResource = js.native
      /** Load Google Cloud Pub/Sub API v1 */
      def load(name: pubsub, version: v1): js.Thenable[Unit] = js.native
      def load(name: pubsub, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

