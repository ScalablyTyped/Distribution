package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDispatcher extends StObject {
  
  def addEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit], options: Any): Unit = js.native
  
  def dispatchEvent(event: Any): Unit = js.native
  
  def hasEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Boolean = js.native
  
  def removeEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
}
