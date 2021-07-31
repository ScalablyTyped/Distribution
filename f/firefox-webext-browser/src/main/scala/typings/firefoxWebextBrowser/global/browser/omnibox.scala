package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.omnibox.DefaultSuggestResult
import typings.firefoxWebextBrowser.browser.omnibox.OnInputEnteredDisposition
import typings.firefoxWebextBrowser.browser.omnibox.SuggestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The omnibox API allows you to register a keyword with Firefox's address bar.
  *
  * Manifest keys: `omnibox`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object omnibox {
  
  @JSGlobal("browser.omnibox")
  @js.native
  val ^ : js.Any = js.native
  
  /** User has ended the keyword input session without accepting the input. */
  @JSGlobal("browser.omnibox.onInputCancelled")
  @js.native
  val onInputCancelled: WebExtEvent[js.Function0[Unit]] = js.native
  
  /**
    * User has changed what is typed into the omnibox.
    * @param suggest A callback passed to the onInputChanged event used for sending suggestions back to the browser.
    */
  @JSGlobal("browser.omnibox.onInputChanged")
  @js.native
  val onInputChanged: WebExtEvent[
    js.Function2[
      /* text */ String, 
      /* suggest */ js.Function1[/* suggestResults */ js.Array[SuggestResult], Unit], 
      Unit
    ]
  ] = js.native
  
  /** User has accepted what is typed into the omnibox. */
  @JSGlobal("browser.omnibox.onInputEntered")
  @js.native
  val onInputEntered: WebExtEvent[
    js.Function2[/* text */ String, /* disposition */ OnInputEnteredDisposition, Unit]
  ] = js.native
  
  /* omnibox events */
  /**
    * User has started a keyword input session by typing the extension's keyword. This is guaranteed to be sent exactly once per input session, and before any onInputChanged events.
    */
  @JSGlobal("browser.omnibox.onInputStarted")
  @js.native
  val onInputStarted: WebExtEvent[js.Function0[Unit]] = js.native
  
  /* omnibox functions */
  /**
    * Sets the description and styling for the default suggestion. The default suggestion is the text that is displayed in the first suggestion row underneath the URL bar.
    * @param suggestion A partial SuggestResult object, without the 'content' parameter.
    */
  @scala.inline
  def setDefaultSuggestion(suggestion: DefaultSuggestResult): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultSuggestion")(suggestion.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
