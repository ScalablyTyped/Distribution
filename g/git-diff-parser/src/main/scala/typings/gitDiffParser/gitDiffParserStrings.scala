package typings.gitDiffParser

import typings.gitDiffParser.mod.LineType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitDiffParserStrings {
  
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  
  @scala.inline
  def deleted: deleted = "deleted".asInstanceOf[deleted]
  
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait added extends LineType
  
  @js.native
  sealed trait deleted extends LineType
  
  @js.native
  sealed trait normal extends LineType
}
