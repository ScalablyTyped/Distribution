package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsOnUpdatedEvent[TCallback] extends StObject {
  
  def addListener(cb: TCallback): Unit = js.native
  def addListener(cb: TCallback, filter: UpdateFilter): Unit = js.native
  
  def hasListener(cb: TCallback): Boolean = js.native
  
  def removeListener(cb: TCallback): Unit = js.native
}
