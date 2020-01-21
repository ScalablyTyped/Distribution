package typings.emberTestHelpers

import typings.emberTestHelpers.triggerKeyEventMod.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object emberTestHelpersStrings {
  @js.native
  sealed trait keydown extends KeyEvent
  
  @js.native
  sealed trait keypress extends KeyEvent
  
  @js.native
  sealed trait keyup extends KeyEvent
  
  @scala.inline
  def keydown: keydown = "keydown".asInstanceOf[keydown]
  @scala.inline
  def keypress: keypress = "keypress".asInstanceOf[keypress]
  @scala.inline
  def keyup: keyup = "keyup".asInstanceOf[keyup]
}

