package typings.fullcalendarCommon.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "Scroller")
@js.native
open class Scroller ()
  extends BaseComponent[ScrollerProps, Dictionary]
     with ScrollerLike {
  
  /* private */ var el: Any = js.native
  
  def getXScrollbarWidth(): Double = js.native
  
  def getYScrollbarWidth(): Double = js.native
  
  def handleEl(el: HTMLElement): Unit = js.native
  
  /* CompleteClass */
  override def needsXScrolling(): Boolean = js.native
  
  /* CompleteClass */
  override def needsYScrolling(): Boolean = js.native
  
  def render(): Any = js.native
}
