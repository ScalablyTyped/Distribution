package typings.fbWatchman

import typings.fbWatchman.mod.UnilateralTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object fbWatchmanStrings {
  @js.native
  sealed trait log extends UnilateralTags
  
  @js.native
  sealed trait unilateralTags extends UnilateralTags
  
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  @scala.inline
  def unilateralTags: unilateralTags = "unilateralTags".asInstanceOf[unilateralTags]
}

