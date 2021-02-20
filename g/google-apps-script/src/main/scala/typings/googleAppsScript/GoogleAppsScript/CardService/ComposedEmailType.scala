package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ComposedEmailType extends StObject
/**
  * An enum value that specifies whether the composed email is a standalone or reply draft.
  */
@JSGlobal("GoogleAppsScript.Card_Service.ComposedEmailType")
@js.native
object ComposedEmailType extends StObject {
  
  @js.native
  sealed trait REPLY_AS_DRAFT extends ComposedEmailType
  
  @js.native
  sealed trait STANDALONE_DRAFT extends ComposedEmailType
}
