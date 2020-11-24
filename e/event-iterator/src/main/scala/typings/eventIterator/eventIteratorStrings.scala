package typings.eventIterator

import typings.eventIterator.eventIteratorMod.QueueEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventIteratorStrings {
  
  @scala.inline
  def highWater: highWater = "highWater".asInstanceOf[highWater]
  
  @scala.inline
  def lowWater: lowWater = "lowWater".asInstanceOf[lowWater]
  
  @js.native
  sealed trait highWater extends QueueEvent
  
  @js.native
  sealed trait lowWater extends QueueEvent
}
