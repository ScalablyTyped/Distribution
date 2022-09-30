package typings.gatsbyTelemetry

import typings.configstore.mod.default
import typings.gatsbyTelemetry.inMemoryStoreMod.InMemoryConfigStore
import typings.gatsbyTelemetry.storeMod.Store
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventStorageMod {
  
  @JSImport("gatsby-telemetry/lib/event-storage", "EventStorage")
  @js.native
  open class EventStorage () extends StObject {
    
    def addEvent(event: Any): Unit = js.native
    
    var analyticsApi: String = js.native
    
    var config: default | InMemoryConfigStore = js.native
    
    var debugEvents: Boolean = js.native
    
    var disabled: Boolean = js.native
    
    def getConfig(key: String): String | Boolean | (Record[String, Any]) = js.native
    
    def getUserAgent(): String = js.native
    
    def isTrackingDisabled(): Boolean = js.native
    
    def sendEvents(): js.Promise[Boolean] = js.native
    
    var store: Store = js.native
    
    def submitEvents(events: Any): js.Promise[Boolean] = js.native
    
    def updateConfig(key: String): Unit = js.native
    def updateConfig(key: String, value: String): Unit = js.native
    def updateConfig(key: String, value: Boolean): Unit = js.native
    def updateConfig(key: String, value: Double): Unit = js.native
    
    var verbose: Boolean = js.native
  }
}
