package typings.gapiClientSpanner

import typings.gapiClientSpanner.gapi.client.spanner.ProjectsResource
import typings.gapiClientSpanner.gapiClientSpannerStrings.spanner
import typings.gapiClientSpanner.gapiClientSpannerStrings.v1
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
      /** Load Cloud Spanner API v1 */
      def load(name: spanner, version: v1): js.Thenable[Unit] = js.native
      def load(name: spanner, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

