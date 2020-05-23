package typings.gapiClientVideointelligence

import typings.gapiClientVideointelligence.gapi.client.videointelligence.VideosResource
import typings.gapiClientVideointelligence.gapiClientVideointelligenceStrings.v1beta1
import typings.gapiClientVideointelligence.gapiClientVideointelligenceStrings.videointelligence
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
      val videos: VideosResource = js.native
      /** Load Cloud Video Intelligence API v1beta1 */
      def load(name: videointelligence, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: videointelligence, version: v1beta1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

