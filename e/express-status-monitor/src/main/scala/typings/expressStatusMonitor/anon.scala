package typings.expressStatusMonitor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cpu extends StObject {
    
    var cpu: js.UndefOr[Boolean] = js.native
    
    /** @default true */
    var heap: js.UndefOr[Boolean] = js.native
    
    var load: js.UndefOr[Boolean] = js.native
    
    var mem: js.UndefOr[Boolean] = js.native
    
    var responseTime: js.UndefOr[Boolean] = js.native
    
    var rps: js.UndefOr[Boolean] = js.native
    
    var statusCodes: js.UndefOr[Boolean] = js.native
  }
  object Cpu {
    
    @scala.inline
    def apply(): Cpu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cpu]
    }
    
    @scala.inline
    implicit class CpuMutableBuilder[Self <: Cpu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCpu(value: Boolean): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
      
      @scala.inline
      def setHeap(value: Boolean): Self = StObject.set(x, "heap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeapUndefined: Self = StObject.set(x, "heap", js.undefined)
      
      @scala.inline
      def setLoad(value: Boolean): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setMem(value: Boolean): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemUndefined: Self = StObject.set(x, "mem", js.undefined)
      
      @scala.inline
      def setResponseTime(value: Boolean): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTimeUndefined: Self = StObject.set(x, "responseTime", js.undefined)
      
      @scala.inline
      def setRps(value: Boolean): Self = StObject.set(x, "rps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRpsUndefined: Self = StObject.set(x, "rps", js.undefined)
      
      @scala.inline
      def setStatusCodes(value: Boolean): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodesUndefined: Self = StObject.set(x, "statusCodes", js.undefined)
    }
  }
}
