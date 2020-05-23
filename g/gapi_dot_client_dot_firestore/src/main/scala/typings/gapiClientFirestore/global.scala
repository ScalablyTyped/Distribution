package typings.gapiClientFirestore

import typings.gapiClientFirestore.gapi.client.firestore.ProjectsResource
import typings.gapiClientFirestore.gapiClientFirestoreStrings.firestore
import typings.gapiClientFirestore.gapiClientFirestoreStrings.v1beta1
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
      /** Load Google Cloud Firestore API v1beta1 */
      def load(name: firestore, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: firestore, version: v1beta1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

