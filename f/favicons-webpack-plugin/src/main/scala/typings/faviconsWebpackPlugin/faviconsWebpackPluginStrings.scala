package typings.faviconsWebpackPlugin

import typings.faviconsWebpackPlugin.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object faviconsWebpackPluginStrings {
  @js.native
  sealed trait light extends Mode
  
  @js.native
  sealed trait webapp extends Mode
  
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  @scala.inline
  def webapp: webapp = "webapp".asInstanceOf[webapp]
}

