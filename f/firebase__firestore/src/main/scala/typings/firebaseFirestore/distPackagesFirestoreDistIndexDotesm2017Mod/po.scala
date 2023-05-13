package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class is responsible for the scheduling of LRU garbage collection. It handles checking
  * whether or not GC is enabled, as well as which delay to use before the next run.
  */ @js.native
trait po extends StObject {
  
  var Gn: Any = js.native
  
  def Qn(t: Any): Unit = js.native
  
  var asyncQueue: Any = js.native
  
  var garbageCollector: Any = js.native
  
  var localStore: Any = js.native
  
  def start(): Unit = js.native
  
  def started: Boolean = js.native
  
  def stop(): Unit = js.native
}
