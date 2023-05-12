package typings.fullcalendarCore.internalCommonMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scroller
  extends BaseComponent[ScrollerProps, Dictionary]
     with ScrollerLike {
  
  var el: HTMLElement = js.native
  
  def getXScrollbarWidth(): Double = js.native
  
  def getYScrollbarWidth(): Double = js.native
  
  def handleEl(el: HTMLElement): Unit = js.native
}
