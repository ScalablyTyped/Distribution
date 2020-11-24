package typings.emberTestHelpers

import typings.emberTestHelpers.triggerKeyEventMod.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emberTestHelpersStrings {
  
  @scala.inline
  def keydown: keydown = "keydown".asInstanceOf[keydown]
  
  @scala.inline
  def keypress: keypress = "keypress".asInstanceOf[keypress]
  
  @scala.inline
  def keyup: keyup = "keyup".asInstanceOf[keyup]
  
  @js.native
  sealed trait keydown extends KeyEvent
  
  @js.native
  sealed trait keypress extends KeyEvent
  
  @js.native
  sealed trait keyup extends KeyEvent
}
