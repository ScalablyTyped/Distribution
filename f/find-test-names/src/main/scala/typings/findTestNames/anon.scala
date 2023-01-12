package typings.findTestNames

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PendingTestCount extends StObject {
    
    var pendingTestCount: Double
    
    var testCount: Double
  }
  object PendingTestCount {
    
    inline def apply(pendingTestCount: Double, testCount: Double): PendingTestCount = {
      val __obj = js.Dynamic.literal(pendingTestCount = pendingTestCount.asInstanceOf[js.Any], testCount = testCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[PendingTestCount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PendingTestCount] (val x: Self) extends AnyVal {
      
      inline def setPendingTestCount(value: Double): Self = StObject.set(x, "pendingTestCount", value.asInstanceOf[js.Any])
      
      inline def setTestCount(value: Double): Self = StObject.set(x, "testCount", value.asInstanceOf[js.Any])
    }
  }
}
