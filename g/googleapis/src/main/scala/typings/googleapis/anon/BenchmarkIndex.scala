package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BenchmarkIndex extends StObject {
  
  var benchmarkIndex: js.UndefOr[Double] = js.undefined
  
  var hostUserAgent: js.UndefOr[String] = js.undefined
  
  var networkUserAgent: js.UndefOr[String] = js.undefined
}
object BenchmarkIndex {
  
  inline def apply(): BenchmarkIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BenchmarkIndex]
  }
  
  extension [Self <: BenchmarkIndex](x: Self) {
    
    inline def setBenchmarkIndex(value: Double): Self = StObject.set(x, "benchmarkIndex", value.asInstanceOf[js.Any])
    
    inline def setBenchmarkIndexUndefined: Self = StObject.set(x, "benchmarkIndex", js.undefined)
    
    inline def setHostUserAgent(value: String): Self = StObject.set(x, "hostUserAgent", value.asInstanceOf[js.Any])
    
    inline def setHostUserAgentUndefined: Self = StObject.set(x, "hostUserAgent", js.undefined)
    
    inline def setNetworkUserAgent(value: String): Self = StObject.set(x, "networkUserAgent", value.asInstanceOf[js.Any])
    
    inline def setNetworkUserAgentUndefined: Self = StObject.set(x, "networkUserAgent", js.undefined)
  }
}
