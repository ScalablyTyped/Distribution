package typings.gamepad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gamepadStrings {
  @js.native
  sealed trait attach extends js.Object
  
  @js.native
  sealed trait down extends js.Object
  
  @js.native
  sealed trait move extends js.Object
  
  @js.native
  sealed trait remove extends js.Object
  
  @js.native
  sealed trait up extends js.Object
  
  @scala.inline
  def attach: attach = "attach".asInstanceOf[attach]
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def up: up = "up".asInstanceOf[up]
}

