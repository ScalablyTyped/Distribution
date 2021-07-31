package typings.eventIterator

import typings.eventIterator.eventIteratorMod.QueueEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventIteratorStrings {
  
  @js.native
  sealed trait highWater
    extends StObject
       with QueueEvent
  @scala.inline
  def highWater: highWater = "highWater".asInstanceOf[highWater]
  
  @js.native
  sealed trait lowWater
    extends StObject
       with QueueEvent
  @scala.inline
  def lowWater: lowWater = "lowWater".asInstanceOf[lowWater]
}
