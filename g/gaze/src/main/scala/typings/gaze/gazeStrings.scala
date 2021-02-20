package typings.gaze

import typings.gaze.mod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gazeStrings {
  
  @js.native
  sealed trait auto extends Mode
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait poll extends Mode
  @scala.inline
  def poll: poll = "poll".asInstanceOf[poll]
  
  @js.native
  sealed trait watch extends Mode
  @scala.inline
  def watch: watch = "watch".asInstanceOf[watch]
}
