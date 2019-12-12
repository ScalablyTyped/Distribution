package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.ComposedEmailType.REPLY_AS_DRAFT
import typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service.ComposedEmailType.STANDALONE_DRAFT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ComposedEmailType extends js.Object

/**
  * An enum value that specifies whether the composed email is a standalone or reply draft.
  */
@JSGlobal("GoogleAppsScript.Card_Service.ComposedEmailType")
@js.native
object ComposedEmailType extends js.Object {
  @js.native
  sealed trait REPLY_AS_DRAFT extends ComposedEmailType
  
  @js.native
  sealed trait STANDALONE_DRAFT extends ComposedEmailType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ComposedEmailType with Double] = js.native
  /* 0 */ @js.native
  object REPLY_AS_DRAFT extends TopLevel[REPLY_AS_DRAFT with Double]
  
  /* 1 */ @js.native
  object STANDALONE_DRAFT extends TopLevel[STANDALONE_DRAFT with Double]
  
}

