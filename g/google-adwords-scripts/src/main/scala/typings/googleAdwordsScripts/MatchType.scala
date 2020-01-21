package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleAdwordsScripts.googleAdwordsScriptsStrings.BROAD
  - typings.googleAdwordsScripts.googleAdwordsScriptsStrings.PHRASE
  - typings.googleAdwordsScripts.googleAdwordsScriptsStrings.EXACT
*/
trait MatchType extends js.Object

object MatchType {
  @scala.inline
  def BROAD: typings.googleAdwordsScripts.googleAdwordsScriptsStrings.BROAD = this.cast("BROAD")
  @scala.inline
  def EXACT: typings.googleAdwordsScripts.googleAdwordsScriptsStrings.EXACT = this.cast("EXACT")
  @scala.inline
  def PHRASE: typings.googleAdwordsScripts.googleAdwordsScriptsStrings.PHRASE = this.cast("PHRASE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

