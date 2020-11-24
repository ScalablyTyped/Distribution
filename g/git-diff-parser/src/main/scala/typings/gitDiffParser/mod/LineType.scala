package typings.gitDiffParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents prefix in `git diff` output: '+', '-', or space */
/* Rewritten from type alias, can be one of: 
  - typings.gitDiffParser.gitDiffParserStrings.deleted
  - typings.gitDiffParser.gitDiffParserStrings.added
  - typings.gitDiffParser.gitDiffParserStrings.normal
*/
trait LineType extends js.Object
object LineType {
  
  @scala.inline
  def added: typings.gitDiffParser.gitDiffParserStrings.added = "added".asInstanceOf[typings.gitDiffParser.gitDiffParserStrings.added]
  
  @scala.inline
  def deleted: typings.gitDiffParser.gitDiffParserStrings.deleted = "deleted".asInstanceOf[typings.gitDiffParser.gitDiffParserStrings.deleted]
  
  @scala.inline
  def normal: typings.gitDiffParser.gitDiffParserStrings.normal = "normal".asInstanceOf[typings.gitDiffParser.gitDiffParserStrings.normal]
}
