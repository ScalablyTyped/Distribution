package typings.dexie.mod

import typings.dexie.dexieStrings.storagemutated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalDexieEvents
  extends StObject
     with DexieEventSet {
  
  def apply(eventName: storagemutated, subscriber: js.Function1[/* parts */ ObservabilitySet, Any]): Unit = js.native
  
  var storagemutated: DexieOnStorageMutatedEvent = js.native
}
