package typings.gcProfiler

import typings.gcProfiler.mod.GCType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gcProfilerStrings {
  
  @js.native
  sealed trait All
    extends StObject
       with GCType
  inline def All: All = "All".asInstanceOf[All]
  
  @js.native
  sealed trait IncrementalMarking
    extends StObject
       with GCType
  inline def IncrementalMarking: IncrementalMarking = "IncrementalMarking".asInstanceOf[IncrementalMarking]
  
  @js.native
  sealed trait MarkSweepCompact
    extends StObject
       with GCType
  inline def MarkSweepCompact: MarkSweepCompact = "MarkSweepCompact".asInstanceOf[MarkSweepCompact]
  
  @js.native
  sealed trait ProcessWeakCallbacks
    extends StObject
       with GCType
  inline def ProcessWeakCallbacks: ProcessWeakCallbacks = "ProcessWeakCallbacks".asInstanceOf[ProcessWeakCallbacks]
  
  @js.native
  sealed trait Scavenge
    extends StObject
       with GCType
  inline def Scavenge: Scavenge = "Scavenge".asInstanceOf[Scavenge]
  
  @js.native
  sealed trait gc extends StObject
  inline def gc: gc = "gc".asInstanceOf[gc]
}
