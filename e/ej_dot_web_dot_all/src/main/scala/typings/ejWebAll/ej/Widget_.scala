package typings.ejWebAll.ej

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Widget_
  extends StObject
     with WidgetBase {
  
  def destroyAll(elements: Element): Unit = js.native
  
  var model: js.Any = js.native
  
  def register(pluginName: String, className: String, prototype: js.Any): Unit = js.native
}
