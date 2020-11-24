package typings.domSerial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domSerialStrings {
  
  @scala.inline
  def even: even = "even".asInstanceOf[even]
  
  @scala.inline
  def hardware: hardware = "hardware".asInstanceOf[hardware]
  
  @scala.inline
  def mark: mark = "mark".asInstanceOf[mark]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def odd: odd = "odd".asInstanceOf[odd]
  
  @scala.inline
  def space: space = "space".asInstanceOf[space]
  
  @js.native
  sealed trait even extends ParityType
  
  @js.native
  sealed trait hardware extends FlowControlType
  
  @js.native
  sealed trait mark extends ParityType
  
  @js.native
  sealed trait none
    extends FlowControlType
       with ParityType
  
  @js.native
  sealed trait odd extends ParityType
  
  @js.native
  sealed trait space extends ParityType
}
