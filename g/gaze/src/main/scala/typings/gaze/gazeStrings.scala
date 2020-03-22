package typings.gaze

import typings.gaze.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gazeStrings {
  @js.native
  sealed trait auto extends Mode
  
  @js.native
  sealed trait poll extends Mode
  
  @js.native
  sealed trait watch extends Mode
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def poll: poll = "poll".asInstanceOf[poll]
  @scala.inline
  def watch: watch = "watch".asInstanceOf[watch]
}

