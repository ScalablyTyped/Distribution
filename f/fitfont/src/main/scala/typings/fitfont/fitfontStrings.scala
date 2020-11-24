package typings.fitfont

import typings.fitfont.mod.HorizontalAlign
import typings.fitfont.mod.VerticalAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fitfontStrings {
  
  @scala.inline
  def baseline: baseline = "baseline".asInstanceOf[baseline]
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait baseline extends VerticalAlign
  
  @js.native
  sealed trait bottom extends VerticalAlign
  
  @js.native
  sealed trait end extends HorizontalAlign
  
  @js.native
  sealed trait middle
    extends HorizontalAlign
       with VerticalAlign
  
  @js.native
  sealed trait start extends HorizontalAlign
  
  @js.native
  sealed trait top extends VerticalAlign
}
