package typings.gitDiffParser

import typings.gitDiffParser.mod.LineType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gitDiffParserStrings {
  @js.native
  sealed trait added extends LineType
  
  @js.native
  sealed trait deleted extends LineType
  
  @js.native
  sealed trait normal extends LineType
  
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  @scala.inline
  def deleted: deleted = "deleted".asInstanceOf[deleted]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
}

