package typings.exaroton

import typings.exaroton.exarotonInts.`0`
import typings.exaroton.exarotonInts.`10`
import typings.exaroton.exarotonInts.`1`
import typings.exaroton.exarotonInts.`2`
import typings.exaroton.exarotonInts.`3`
import typings.exaroton.exarotonInts.`4`
import typings.exaroton.exarotonInts.`5`
import typings.exaroton.exarotonInts.`6`
import typings.exaroton.exarotonInts.`7`
import typings.exaroton.exarotonInts.`8`
import typings.exaroton.mod.ConsoleStream
import typings.exaroton.mod.HeapStream
import typings.exaroton.mod.StatsStream
import typings.exaroton.mod.TickStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CRASHED extends StObject {
    
    var CRASHED: `7`
    
    var LOADING: `6`
    
    var OFFLINE: `0`
    
    var ONLINE: `1`
    
    var PENDING: `8`
    
    var PREPARING: `10`
    
    var RESTARTING: `4`
    
    var SAVING: `5`
    
    var STARTING: `2`
    
    var STOPPING: `3`
  }
  object CRASHED {
    
    inline def apply(): CRASHED = {
      val __obj = js.Dynamic.literal(CRASHED = 7, LOADING = 6, OFFLINE = 0, ONLINE = 1, PENDING = 8, PREPARING = 10, RESTARTING = 4, SAVING = 5, STARTING = 2, STOPPING = 3)
      __obj.asInstanceOf[CRASHED]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CRASHED] (val x: Self) extends AnyVal {
      
      inline def setCRASHED(value: `7`): Self = StObject.set(x, "CRASHED", value.asInstanceOf[js.Any])
      
      inline def setLOADING(value: `6`): Self = StObject.set(x, "LOADING", value.asInstanceOf[js.Any])
      
      inline def setOFFLINE(value: `0`): Self = StObject.set(x, "OFFLINE", value.asInstanceOf[js.Any])
      
      inline def setONLINE(value: `1`): Self = StObject.set(x, "ONLINE", value.asInstanceOf[js.Any])
      
      inline def setPENDING(value: `8`): Self = StObject.set(x, "PENDING", value.asInstanceOf[js.Any])
      
      inline def setPREPARING(value: `10`): Self = StObject.set(x, "PREPARING", value.asInstanceOf[js.Any])
      
      inline def setRESTARTING(value: `4`): Self = StObject.set(x, "RESTARTING", value.asInstanceOf[js.Any])
      
      inline def setSAVING(value: `5`): Self = StObject.set(x, "SAVING", value.asInstanceOf[js.Any])
      
      inline def setSTARTING(value: `2`): Self = StObject.set(x, "STARTING", value.asInstanceOf[js.Any])
      
      inline def setSTOPPING(value: `3`): Self = StObject.set(x, "STOPPING", value.asInstanceOf[js.Any])
    }
  }
  
  trait Console extends StObject {
    
    var console: ConsoleStream
    
    var heap: HeapStream
    
    var stats: StatsStream
    
    var tick: TickStream
  }
  object Console {
    
    inline def apply(console: ConsoleStream, heap: HeapStream, stats: StatsStream, tick: TickStream): Console = {
      val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any], heap = heap.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any])
      __obj.asInstanceOf[Console]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Console] (val x: Self) extends AnyVal {
      
      inline def setConsole(value: ConsoleStream): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setHeap(value: HeapStream): Self = StObject.set(x, "heap", value.asInstanceOf[js.Any])
      
      inline def setStats(value: StatsStream): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setTick(value: TickStream): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tail extends StObject {
    
    var tail: `0`
  }
  object Tail {
    
    inline def apply(): Tail = {
      val __obj = js.Dynamic.literal(tail = 0)
      __obj.asInstanceOf[Tail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tail] (val x: Self) extends AnyVal {
      
      inline def setTail(value: `0`): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    }
  }
}
