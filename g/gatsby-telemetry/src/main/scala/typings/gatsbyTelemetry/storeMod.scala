package typings.gatsbyTelemetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeMod {
  
  @JSImport("gatsby-telemetry/lib/store", "Store")
  @js.native
  class Store protected () extends StObject {
    def this(baseDir: String) = this()
    
    def appendToBuffer(event: js.Any): Unit = js.native
    
    var baseDir: String = js.native
    
    var bufferFilePath: String = js.native
    
    var eventsJsonFileName: String = js.native
    
    def flushFile(filePath: String, flushOperation: js.Function): js.Promise[Boolean] = js.native
    
    def startFlushEvents(flushOperation: js.Function): js.Promise[Boolean] = js.native
  }
}
