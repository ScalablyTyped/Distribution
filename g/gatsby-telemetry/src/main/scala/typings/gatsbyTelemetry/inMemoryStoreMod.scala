package typings.gatsbyTelemetry

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inMemoryStoreMod {
  
  @JSImport("gatsby-telemetry/lib/in-memory-store", "InMemoryConfigStore")
  @js.native
  class InMemoryConfigStore () extends StObject {
    
    def all(): Record[String, _] = js.native
    
    def clear(): Unit = js.native
    
    var config: Record[String, _] = js.native
    
    def createBaseConfig(): Record[String, _] = js.native
    
    def delete(key: String): Unit = js.native
    
    def get(key: String): js.Any = js.native
    
    def has(key: String): Boolean = js.native
    
    var path: String = js.native
    
    def set(key: String, value: js.Any): Unit = js.native
    
    def size(): Double = js.native
  }
}
