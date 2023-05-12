package typings.fullcalendarCore.internalCommonMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomRendering[RenderProps]
  extends StObject
     with ElProps {
  
  var containerEl: HTMLElement = js.native
  
  var generatorMeta: Any = js.native
  
  var generatorName: String = js.native
  
  var id: String = js.native
  
  var isActive: Boolean = js.native
  
  var renderProps: RenderProps = js.native
  
  def reportNewContainerEl(): Unit = js.native
  def reportNewContainerEl(el: HTMLElement): Unit = js.native
}
