package typings.gcProfiler

import typings.gcProfiler.gcProfilerInts.`0`
import typings.gcProfiler.gcProfilerInts.`1`
import typings.gcProfiler.gcProfilerInts.`2`
import typings.gcProfiler.gcProfilerInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait KGCCallbackFlagCompacted extends StObject {
    
    val kGCCallbackFlagCompacted: `1`
    
    val kGCCallbackFlagConstructRetainedObjectInfos: `2`
    
    val kGCCallbackFlagForced: `4`
    
    val kNoGCCallbackFlags: `0`
  }
  object KGCCallbackFlagCompacted {
    
    inline def apply(): KGCCallbackFlagCompacted = {
      val __obj = js.Dynamic.literal(kGCCallbackFlagCompacted = 1, kGCCallbackFlagConstructRetainedObjectInfos = 2, kGCCallbackFlagForced = 4, kNoGCCallbackFlags = 0)
      __obj.asInstanceOf[KGCCallbackFlagCompacted]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KGCCallbackFlagCompacted] (val x: Self) extends AnyVal {
      
      inline def setKGCCallbackFlagCompacted(value: `1`): Self = StObject.set(x, "kGCCallbackFlagCompacted", value.asInstanceOf[js.Any])
      
      inline def setKGCCallbackFlagConstructRetainedObjectInfos(value: `2`): Self = StObject.set(x, "kGCCallbackFlagConstructRetainedObjectInfos", value.asInstanceOf[js.Any])
      
      inline def setKGCCallbackFlagForced(value: `4`): Self = StObject.set(x, "kGCCallbackFlagForced", value.asInstanceOf[js.Any])
      
      inline def setKNoGCCallbackFlags(value: `0`): Self = StObject.set(x, "kNoGCCallbackFlags", value.asInstanceOf[js.Any])
    }
  }
}
