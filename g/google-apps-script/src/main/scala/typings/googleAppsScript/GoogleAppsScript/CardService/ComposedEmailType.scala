package typings.googleAppsScript.GoogleAppsScript.CardService

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
  
}

