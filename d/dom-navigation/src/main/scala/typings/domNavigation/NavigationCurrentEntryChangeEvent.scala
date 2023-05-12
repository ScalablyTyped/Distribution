package typings.domNavigation

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationCurrentEntryChangeEvent
  extends StObject
     with Event {
  
  val from: NavigationHistoryEntry = js.native
  
  val navigationType: NavigationTypeString | Null = js.native
}
