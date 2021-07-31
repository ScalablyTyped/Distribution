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
  
  @scala.inline
  def apply(): BenchmarkIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BenchmarkIndex]
  }
  
  @scala.inline
  implicit class BenchmarkIndexMutableBuilder[Self <: BenchmarkIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBenchmarkIndex(value: Double): Self = StObject.set(x, "benchmarkIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenchmarkIndexUndefined: Self = StObject.set(x, "benchmarkIndex", js.undefined)
    
    @scala.inline
    def setHostUserAgent(value: String): Self = StObject.set(x, "hostUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUserAgentUndefined: Self = StObject.set(x, "hostUserAgent", js.undefined)
    
    @scala.inline
    def setNetworkUserAgent(value: String): Self = StObject.set(x, "networkUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUserAgentUndefined: Self = StObject.set(x, "networkUserAgent", js.undefined)
  }
}
