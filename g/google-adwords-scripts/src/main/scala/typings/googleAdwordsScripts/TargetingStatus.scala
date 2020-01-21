package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleAdwordsScripts.googleAdwordsScriptsStrings.ACTIVE
  - typings.googleAdwordsScripts.googleAdwordsScriptsStrings.PHASING_OUT
  - typings.googleAdwordsScripts.googleAdwordsScriptsStrings.OBSOLETE
*/
trait TargetingStatus extends js.Object

object TargetingStatus {
  @scala.inline
  def ACTIVE: typings.googleAdwordsScripts.googleAdwordsScriptsStrings.ACTIVE = this.cast("ACTIVE")
  @scala.inline
  def OBSOLETE: typings.googleAdwordsScripts.googleAdwordsScriptsStrings.OBSOLETE = this.cast("OBSOLETE")
  @scala.inline
  def PHASING_OUT: typings.googleAdwordsScripts.googleAdwordsScriptsStrings.PHASING_OUT = this.cast("PHASING_OUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

