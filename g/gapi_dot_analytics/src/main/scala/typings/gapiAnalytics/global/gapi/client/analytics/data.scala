package typings.gapiAnalytics.global.gapi.client.analytics

import typings.gapiAnalytics.DataQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
