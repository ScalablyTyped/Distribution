package typings.gcProfiler

import org.scalablytyped.runtime.Shortcut
import typings.gcProfiler.anon.KGCCallbackFlagCompacted
import typings.gcProfiler.gcProfilerStrings.gc
import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gc-profiler", JSImport.Namespace)
  @js.native
  val ^ : GCProfiler = js.native
  
  trait GCInfo extends StObject {
    
    /**
      * The approximate start time of the GC cycle. This uses the c++ time library internally,
      * which only has one-second resolution.
      */
    var date: js.Date
    
    /**
      * The duration of the GC cycle in milliseconds.
      */
    var duration: Double
    
    /**
      * The raw GCCallbackFlags provided from v8.
      */
    var flags: Double
    
    /**
      * `true` for a forced cycle.
      */
    var forced: Boolean
    
    /**
      * The type of GC cycle.
      */
    var `type`: GCType
  }
  object GCInfo {
    
    inline def apply(date: js.Date, duration: Double, flags: Double, forced: Boolean, `type`: GCType): GCInfo = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], forced = forced.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GCInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GCInfo] (val x: Self) extends AnyVal {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setForced(value: Boolean): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
      
      inline def setType(value: GCType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GCProfiler
    extends StObject
       with EventEmitter {
    
    val GCCallbackFlags: KGCCallbackFlagCompacted = js.native
    
    @JSName("addListener")
    def addListener_gc(eventName: gc, listener: js.Function1[/* info */ GCInfo, Unit]): this.type = js.native
    
    @JSName("emit")
    def emit_gc(eventName: gc, info: GCInfo): Boolean = js.native
    
    @JSName("off")
    def off_gc(eventName: gc, listener: js.Function1[/* info */ GCInfo, Unit]): this.type = js.native
    
    @JSName("on")
    def on_gc(eventName: gc, listener: js.Function1[/* info */ GCInfo, Unit]): this.type = js.native
    
    @JSName("once")
    def once_gc(eventName: gc, listener: js.Function1[/* info */ GCInfo, Unit]): this.type = js.native
    
    @JSName("prependListener")
    def prependListener_gc(eventName: gc, listener: js.Function1[/* info */ GCInfo, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_gc(eventName: gc, listener: js.Function1[/* info */ GCInfo, Unit]): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_gc(eventName: gc, listener: js.Function1[/* info */ GCInfo, Unit]): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gcProfiler.gcProfilerStrings.Scavenge
    - typings.gcProfiler.gcProfilerStrings.MarkSweepCompact
    - typings.gcProfiler.gcProfilerStrings.IncrementalMarking
    - typings.gcProfiler.gcProfilerStrings.ProcessWeakCallbacks
    - typings.gcProfiler.gcProfilerStrings.All
  */
  trait GCType extends StObject
  object GCType {
    
    inline def All: typings.gcProfiler.gcProfilerStrings.All = "All".asInstanceOf[typings.gcProfiler.gcProfilerStrings.All]
    
    inline def IncrementalMarking: typings.gcProfiler.gcProfilerStrings.IncrementalMarking = "IncrementalMarking".asInstanceOf[typings.gcProfiler.gcProfilerStrings.IncrementalMarking]
    
    inline def MarkSweepCompact: typings.gcProfiler.gcProfilerStrings.MarkSweepCompact = "MarkSweepCompact".asInstanceOf[typings.gcProfiler.gcProfilerStrings.MarkSweepCompact]
    
    inline def ProcessWeakCallbacks: typings.gcProfiler.gcProfilerStrings.ProcessWeakCallbacks = "ProcessWeakCallbacks".asInstanceOf[typings.gcProfiler.gcProfilerStrings.ProcessWeakCallbacks]
    
    inline def Scavenge: typings.gcProfiler.gcProfilerStrings.Scavenge = "Scavenge".asInstanceOf[typings.gcProfiler.gcProfilerStrings.Scavenge]
  }
  
  type _To = GCProfiler
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GCProfiler = ^
}
