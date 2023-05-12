package typings.fullcalendarCore.internalCommonMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateComponent[Props, State] extends BaseComponent[Props, State] {
  
  def isValidDateDownEl(el: HTMLElement): Boolean = js.native
  
  def isValidSegDownEl(el: HTMLElement): Boolean = js.native
  
  def prepareHits(): Unit = js.native
  
  def queryHit(positionLeft: Double, positionTop: Double, elWidth: Double, elHeight: Double): Hit | Null = js.native
  
  var uid: String = js.native
}
