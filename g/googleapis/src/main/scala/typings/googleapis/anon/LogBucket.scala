package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogBucket extends StObject {
  
  var logBucket: js.UndefOr[String] = js.undefined
  
  var logObjectPrefix: js.UndefOr[String] = js.undefined
}
object LogBucket {
  
  inline def apply(): LogBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogBucket]
  }
  
  extension [Self <: LogBucket](x: Self) {
    
    inline def setLogBucket(value: String): Self = StObject.set(x, "logBucket", value.asInstanceOf[js.Any])
    
    inline def setLogBucketUndefined: Self = StObject.set(x, "logBucket", js.undefined)
    
    inline def setLogObjectPrefix(value: String): Self = StObject.set(x, "logObjectPrefix", value.asInstanceOf[js.Any])
    
    inline def setLogObjectPrefixUndefined: Self = StObject.set(x, "logObjectPrefix", js.undefined)
  }
}
