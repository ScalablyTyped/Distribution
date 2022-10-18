package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@fullcalendar/common", "ScrollController")
@js.native
open class ScrollController () extends StObject {
  
  def canScrollDown(): Boolean = js.native
  
  def canScrollHorizontally(): Boolean = js.native
  
  def canScrollLeft(): Boolean = js.native
  
  def canScrollRight(): Boolean = js.native
  
  def canScrollUp(): Boolean = js.native
  
  def canScrollVertically(): Boolean = js.native
  
  def getClientHeight(): Double = js.native
  
  def getClientWidth(): Double = js.native
  
  def getMaxScrollLeft(): Double = js.native
  
  def getMaxScrollTop(): Double = js.native
  
  def getScrollHeight(): Double = js.native
  
  def getScrollLeft(): Double = js.native
  
  def getScrollTop(): Double = js.native
  
  def getScrollWidth(): Double = js.native
  
  def setScrollLeft(left: Double): Unit = js.native
  
  def setScrollTop(top: Double): Unit = js.native
}
