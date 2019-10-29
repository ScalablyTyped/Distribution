package typings.fileDashPathDashFilter

import typings.fileDashPathDashFilter.libTypesMod.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object fileDashPathDashFilterStrings {
  @js.native
  sealed trait exclude extends Filter
  
  @js.native
  sealed trait include extends Filter
  
  @scala.inline
  def exclude: exclude = "exclude".asInstanceOf[exclude]
  @scala.inline
  def include: include = "include".asInstanceOf[include]
}

