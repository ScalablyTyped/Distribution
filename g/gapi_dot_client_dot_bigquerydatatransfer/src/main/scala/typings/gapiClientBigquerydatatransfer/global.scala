package typings.gapiClientBigquerydatatransfer

import typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer.ProjectsResource
import typings.gapiClientBigquerydatatransfer.gapiClientBigquerydatatransferStrings.bigquerydatatransfer
import typings.gapiClientBigquerydatatransfer.gapiClientBigquerydatatransferStrings.v1
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
      /** Load BigQuery Data Transfer API v1 */
      def load(name: bigquerydatatransfer, version: v1): js.Thenable[Unit] = js.native
      def load(name: bigquerydatatransfer, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

