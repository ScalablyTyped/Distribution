package typings.expressActuator

import typings.expressActuator.mod.InfoGitMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expressActuatorStrings {
  @js.native
  sealed trait full extends InfoGitMode
  
  @js.native
  sealed trait simple extends InfoGitMode
  
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  @scala.inline
  def simple: simple = "simple".asInstanceOf[simple]
}

