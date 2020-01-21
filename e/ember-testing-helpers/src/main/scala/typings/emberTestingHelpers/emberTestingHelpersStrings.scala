package typings.emberTestingHelpers

import typings.emberTestingHelpers.mod.KeyEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object emberTestingHelpersStrings {
  @js.native
  sealed trait keydown extends KeyEventType
  
  @js.native
  sealed trait keypress extends KeyEventType
  
  @js.native
  sealed trait keyup extends KeyEventType
  
  @scala.inline
  def keydown: keydown = "keydown".asInstanceOf[keydown]
  @scala.inline
  def keypress: keypress = "keypress".asInstanceOf[keypress]
  @scala.inline
  def keyup: keyup = "keyup".asInstanceOf[keyup]
}

