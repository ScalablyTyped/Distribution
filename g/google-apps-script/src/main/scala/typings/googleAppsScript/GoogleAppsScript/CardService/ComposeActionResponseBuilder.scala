package typings.googleAppsScript.GoogleAppsScript.CardService

import typings.googleAppsScript.GoogleAppsScript.Gmail.GmailDraft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for ComposeActionResponse objects.
  *
  * Note: This object isn't related to compose actions that are
  * used to extend the compose UI. Rather,
  * this builder creates responses to an Action that composes draft messages when a specific
  * UI element is selected.
  */
@js.native
trait ComposeActionResponseBuilder extends StObject {
  
  def build(): ComposeActionResponse = js.native
  
  def setGmailDraft(draft: GmailDraft): ComposeActionResponseBuilder = js.native
}
object ComposeActionResponseBuilder {
  
  @scala.inline
  def apply(build: () => ComposeActionResponse, setGmailDraft: GmailDraft => ComposeActionResponseBuilder): ComposeActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setGmailDraft = js.Any.fromFunction1(setGmailDraft))
    __obj.asInstanceOf[ComposeActionResponseBuilder]
  }
  
  @scala.inline
  implicit class ComposeActionResponseBuilderMutableBuilder[Self <: ComposeActionResponseBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => ComposeActionResponse): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetGmailDraft(value: GmailDraft => ComposeActionResponseBuilder): Self = StObject.set(x, "setGmailDraft", js.Any.fromFunction1(value))
  }
}
