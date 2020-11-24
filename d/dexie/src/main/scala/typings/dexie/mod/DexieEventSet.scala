package typings.dexie.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dexie.dexieStrings.asap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DexieEventSet extends js.Object {
  
  def apply(eventName: String): DexieEvent = js.native
  
   // To be able to unsubscribe.
  def addEventType(eventName: String): DexieEvent = js.native
  def addEventType(eventName: String, chainFunction: js.UndefOr[scala.Nothing], defaultFunction: js.Function): DexieEvent = js.native
  def addEventType(
    eventName: String,
    chainFunction: js.Function2[/* f1 */ js.Function, /* f2 */ js.Function, js.Function]
  ): DexieEvent = js.native
  def addEventType(
    eventName: String,
    chainFunction: js.Function2[/* f1 */ js.Function, /* f2 */ js.Function, js.Function],
    defaultFunction: js.Function
  ): DexieEvent = js.native
  @JSName("addEventType")
  def addEventType_asap(
    events: StringDictionary[
      asap | (js.Tuple2[js.Function2[/* f1 */ js.Function, /* f2 */ js.Function, js.Function], js.Function])
    ]
  ): DexieEvent = js.native
}
