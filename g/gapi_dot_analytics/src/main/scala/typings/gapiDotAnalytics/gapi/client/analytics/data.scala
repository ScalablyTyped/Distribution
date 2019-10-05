package typings.gapiDotAnalytics.gapi.client.analytics

import typings.gapiDotAnalytics.DataQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.analytics.data")
@js.native
object data extends js.Object {
  @js.native
  object ga extends js.Object {
    def get(): js.Promise[_] = js.native
    def get(data: DataQuery): js.Promise[_] = js.native
  }
  
  @js.native
  object mcf extends js.Object {
    def get(): js.Promise[_] = js.native
    def get(data: DataQuery): js.Promise[_] = js.native
  }
  
  @js.native
  object realtime extends js.Object {
    def get(): js.Promise[_] = js.native
    def get(data: DataQuery): js.Promise[_] = js.native
  }
  
}

