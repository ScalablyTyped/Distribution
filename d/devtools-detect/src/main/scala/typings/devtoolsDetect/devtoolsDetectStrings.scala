package typings.devtoolsDetect

import typings.devtoolsDetect.mod.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object devtoolsDetectStrings {
  @js.native
  sealed trait devtoolschange extends js.Object
  
  @js.native
  sealed trait horizontal extends Orientation
  
  @js.native
  sealed trait vertical extends Orientation
  
  @scala.inline
  def devtoolschange: devtoolschange = "devtoolschange".asInstanceOf[devtoolschange]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

