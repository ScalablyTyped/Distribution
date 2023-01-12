package typings.expressStatusMonitor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cpu extends StObject {
    
    var cpu: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var heap: js.UndefOr[Boolean] = js.undefined
    
    var load: js.UndefOr[Boolean] = js.undefined
    
    var mem: js.UndefOr[Boolean] = js.undefined
    
    var responseTime: js.UndefOr[Boolean] = js.undefined
    
    var rps: js.UndefOr[Boolean] = js.undefined
    
    var statusCodes: js.UndefOr[Boolean] = js.undefined
  }
  object Cpu {
    
    inline def apply(): Cpu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cpu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cpu] (val x: Self) extends AnyVal {
      
      inline def setCpu(value: Boolean): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
      
      inline def setHeap(value: Boolean): Self = StObject.set(x, "heap", value.asInstanceOf[js.Any])
      
      inline def setHeapUndefined: Self = StObject.set(x, "heap", js.undefined)
      
      inline def setLoad(value: Boolean): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setMem(value: Boolean): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
      
      inline def setMemUndefined: Self = StObject.set(x, "mem", js.undefined)
      
      inline def setResponseTime(value: Boolean): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
      
      inline def setResponseTimeUndefined: Self = StObject.set(x, "responseTime", js.undefined)
      
      inline def setRps(value: Boolean): Self = StObject.set(x, "rps", value.asInstanceOf[js.Any])
      
      inline def setRpsUndefined: Self = StObject.set(x, "rps", js.undefined)
      
      inline def setStatusCodes(value: Boolean): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
      
      inline def setStatusCodesUndefined: Self = StObject.set(x, "statusCodes", js.undefined)
    }
  }
}
