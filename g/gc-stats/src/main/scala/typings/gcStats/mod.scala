package typings.gcStats

import typings.gcStats.gcStatsNumbers.`15`
import typings.gcStats.gcStatsNumbers.`1`
import typings.gcStats.gcStatsNumbers.`2`
import typings.gcStats.gcStatsNumbers.`4`
import typings.gcStats.gcStatsNumbers.`8`
import typings.gcStats.gcStatsStrings.stats
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gc-stats", JSImport.Namespace)
  @js.native
  def apply(): GCStatsEventEmitter = js.native
  
  @js.native
  trait GCStatistics extends StObject {
    
    var after: MemoryStatistics = js.native
    
    var before: MemoryStatistics = js.native
    
    var diff: MemoryStatistics = js.native
    
    var endTime: Double = js.native
    
    var gctype: `1` | `2` | `4` | `8` | `15` = js.native
    
    var pause: Double = js.native
    
    var pauseMS: Double = js.native
    
    var startTime: Double = js.native
  }
  object GCStatistics {
    
    @scala.inline
    def apply(
      after: MemoryStatistics,
      before: MemoryStatistics,
      diff: MemoryStatistics,
      endTime: Double,
      gctype: `1` | `2` | `4` | `8` | `15`,
      pause: Double,
      pauseMS: Double,
      startTime: Double
    ): GCStatistics = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], gctype = gctype.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pauseMS = pauseMS.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[GCStatistics]
    }
    
    @scala.inline
    implicit class GCStatisticsMutableBuilder[Self <: GCStatistics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: MemoryStatistics): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBefore(value: MemoryStatistics): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiff(value: MemoryStatistics): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGctype(value: `1` | `2` | `4` | `8` | `15`): Self = StObject.set(x, "gctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPause(value: Double): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseMS(value: Double): Self = StObject.set(x, "pauseMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GCStatsEventEmitter extends EventEmitter {
    
    @JSName("addListener")
    def addListener_stats(event: stats, listener: GCStatsListener): this.type = js.native
    
    @JSName("on")
    def on_stats(event: stats, listener: GCStatsListener): this.type = js.native
    
    @JSName("once")
    def once_stats(event: stats, listener: GCStatsListener): this.type = js.native
  }
  
  type GCStatsListener = js.Function1[/* stats */ GCStatistics, Unit]
  
  @js.native
  trait MemoryStatistics extends StObject {
    
    var heapSizeLimit: Double = js.native
    
    var mallocedMemory: js.UndefOr[Double] = js.native
    
    // became available with node 10+
    var numberOfDetachedContexts: js.UndefOr[Double] = js.native
    
    // became available with node 7+
    var numberOfNativeContexts: js.UndefOr[Double] = js.native
    
    // became available with node 7+
    var peakMallocedMemory: js.UndefOr[Double] = js.native
    
    var totalAvailableSize: Double = js.native
    
    var totalHeapExecutableSize: Double = js.native
    
    var totalHeapSize: Double = js.native
    
    var totalPhysicalSize: Double = js.native
    
    var usedHeapSize: Double = js.native
  }
  object MemoryStatistics {
    
    @scala.inline
    def apply(
      heapSizeLimit: Double,
      totalAvailableSize: Double,
      totalHeapExecutableSize: Double,
      totalHeapSize: Double,
      totalPhysicalSize: Double,
      usedHeapSize: Double
    ): MemoryStatistics = {
      val __obj = js.Dynamic.literal(heapSizeLimit = heapSizeLimit.asInstanceOf[js.Any], totalAvailableSize = totalAvailableSize.asInstanceOf[js.Any], totalHeapExecutableSize = totalHeapExecutableSize.asInstanceOf[js.Any], totalHeapSize = totalHeapSize.asInstanceOf[js.Any], totalPhysicalSize = totalPhysicalSize.asInstanceOf[js.Any], usedHeapSize = usedHeapSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryStatistics]
    }
    
    @scala.inline
    implicit class MemoryStatisticsMutableBuilder[Self <: MemoryStatistics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeapSizeLimit(value: Double): Self = StObject.set(x, "heapSizeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMallocedMemory(value: Double): Self = StObject.set(x, "mallocedMemory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMallocedMemoryUndefined: Self = StObject.set(x, "mallocedMemory", js.undefined)
      
      @scala.inline
      def setNumberOfDetachedContexts(value: Double): Self = StObject.set(x, "numberOfDetachedContexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfDetachedContextsUndefined: Self = StObject.set(x, "numberOfDetachedContexts", js.undefined)
      
      @scala.inline
      def setNumberOfNativeContexts(value: Double): Self = StObject.set(x, "numberOfNativeContexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfNativeContextsUndefined: Self = StObject.set(x, "numberOfNativeContexts", js.undefined)
      
      @scala.inline
      def setPeakMallocedMemory(value: Double): Self = StObject.set(x, "peakMallocedMemory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeakMallocedMemoryUndefined: Self = StObject.set(x, "peakMallocedMemory", js.undefined)
      
      @scala.inline
      def setTotalAvailableSize(value: Double): Self = StObject.set(x, "totalAvailableSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalHeapExecutableSize(value: Double): Self = StObject.set(x, "totalHeapExecutableSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalHeapSize(value: Double): Self = StObject.set(x, "totalHeapSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalPhysicalSize(value: Double): Self = StObject.set(x, "totalPhysicalSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsedHeapSize(value: Double): Self = StObject.set(x, "usedHeapSize", value.asInstanceOf[js.Any])
    }
  }
}
