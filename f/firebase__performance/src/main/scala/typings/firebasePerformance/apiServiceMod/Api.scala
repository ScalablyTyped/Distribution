package typings.firebasePerformance.apiServiceMod

import typings.firebasePerformance.apiServiceMod.global.Window
import typings.std.Document
import typings.std.Navigator
import typings.std.PerformanceEntry
import typings.std.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/performance/dist/src/services/api_service", "Api")
@js.native
class Api () extends js.Object {
  def this(window: Window) = this()
  
  /** PreformanceObserver constructor function. */
  val PerformanceObserver: js.Any = js.native
  
  val document: Document = js.native
  
  def getEntriesByName(name: String): js.Array[PerformanceEntry] = js.native
  
  def getEntriesByType(`type`: EntryType): js.Array[PerformanceEntry] = js.native
  
  def getTimeOrigin(): Double = js.native
  
  def getUrl(): String = js.native
  
  val localStorage: js.UndefOr[Storage] = js.native
  
  def mark(name: String): Unit = js.native
  
  def measure(measureName: String, mark1: String, mark2: String): Unit = js.native
  
  val navigator: Navigator = js.native
  
  val onFirstInputDelay: js.UndefOr[js.Function] = js.native
  
  val performance: js.Any = js.native
  
  def requiredApisAvailable(): Boolean = js.native
  
  def setupObserver(entryType: EntryType, callback: js.Function1[/* entry */ PerformanceEntry, Unit]): Unit = js.native
  
  val window: js.UndefOr[Window] = js.native
  
  val windowLocation: js.Any = js.native
}
/* static members */
@JSImport("@firebase/performance/dist/src/services/api_service", "Api")
@js.native
object Api extends js.Object {
  
  def getInstance(): Api = js.native
}
