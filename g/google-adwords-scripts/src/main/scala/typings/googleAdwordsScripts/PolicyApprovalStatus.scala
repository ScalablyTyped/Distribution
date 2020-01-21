package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleAdwordsScripts.googleAdwordsScriptsStrings.UNKNOWN
  - typings.googleAdwordsScripts.googleAdwordsScriptsStrings.APPROVED
  - typings.googleAdwordsScripts.googleAdwordsScriptsStrings.APPROVED_LIMITED
  - typings.googleAdwordsScripts.googleAdwordsScriptsStrings.ELIGIBLE
  - typings.googleAdwordsScripts.googleAdwordsScriptsStrings.UNDER_REVIEW
  - typings.googleAdwordsScripts.googleAdwordsScriptsStrings.DISAPPROVED
  - typings.googleAdwordsScripts.googleAdwordsScriptsStrings.SITE_SUSPENDED
*/
trait PolicyApprovalStatus extends js.Object

object PolicyApprovalStatus {
  @scala.inline
  def APPROVED: typings.googleAdwordsScripts.googleAdwordsScriptsStrings.APPROVED = this.cast("APPROVED")
  @scala.inline
  def APPROVED_LIMITED: typings.googleAdwordsScripts.googleAdwordsScriptsStrings.APPROVED_LIMITED = this.cast("APPROVED_LIMITED")
  @scala.inline
  def DISAPPROVED: typings.googleAdwordsScripts.googleAdwordsScriptsStrings.DISAPPROVED = this.cast("DISAPPROVED")
  @scala.inline
  def ELIGIBLE: typings.googleAdwordsScripts.googleAdwordsScriptsStrings.ELIGIBLE = this.cast("ELIGIBLE")
  @scala.inline
  def SITE_SUSPENDED: typings.googleAdwordsScripts.googleAdwordsScriptsStrings.SITE_SUSPENDED = this.cast("SITE_SUSPENDED")
  @scala.inline
  def UNDER_REVIEW: typings.googleAdwordsScripts.googleAdwordsScriptsStrings.UNDER_REVIEW = this.cast("UNDER_REVIEW")
  @scala.inline
  def UNKNOWN: typings.googleAdwordsScripts.googleAdwordsScriptsStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

