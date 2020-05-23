package typings.googleScriptClientSide

import typings.googleScriptClientSide.google.script.Runner
import typings.googleScriptClientSide.google.script.UrlLocation
import typings.googleScriptClientSide.google.script.history.HistoryChangeEvent
import typings.googleScriptClientSide.google.script.history.Query
import typings.googleScriptClientSide.google.script.history.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object google extends js.Object {
    @js.native
    object script extends js.Object {
      val run: Runner = js.native
      @js.native
      object history extends js.Object {
        /**
          * Pushes the provided state object, URL parameters and URL fragment onto the browser history stack.
          * @param stateObject An developer-defined object to be associated with a browser history event, and which resurfaces when the state is popped.
          * Typically used to store application state information (such as page data) for future retrieval.
          * @param params An object containing URL parameters to associate with this state.
          * For example, {foo: “bar”, fiz: “baz”} equates to "?foo=bar&fiz=baz".
          * Alternatively, arrays can be used: {foo: [“bar”, “cat”], fiz: “baz”} equates to "?foo=bar&foo=cat&fiz=baz".
          * If null or undefined, the current URL parameters are not changed. If empty, the URL parameters are cleared.
          * @param hash The string URL fragment appearing after the '#' character.
          * If null or undefined, the current URL fragment is not changed. If empty, the URL fragment is cleared.
          */
        def push(stateObject: State): Unit = js.native
        def push(stateObject: State, params: Query): Unit = js.native
        def push(stateObject: State, params: Query, hash: String): Unit = js.native
        /**
          * Replaces the top event on the browser history stack with the provided (developer-defined) state object, URL parameters and URL fragment.
          * @param stateObject An developer-defined object to be associated with a browser history event, and which resurfaces when the state is popped.
          * Typically used to store application state information (such as page data) for future retrieval.
          * @param params An object containing URL parameters to associate with this state.
          * For example, {foo: “bar”, fiz: “baz”} equates to "?foo=bar&fiz=baz".
          * Alternatively, arrays can be used: {foo: [“bar”, “cat”], fiz: “baz”} equates to "?foo=bar&foo=cat&fiz=baz".
          * If null or undefined, the current URL parameters are not changed. If empty, the URL parameters are cleared.
          * @param hash The string URL fragment appearing after the '#' character.
          * If null or undefined, the current URL fragment is not changed. If empty, the URL fragment is cleared.
          */
        def replace(stateObject: State): Unit = js.native
        def replace(stateObject: State, params: Query): Unit = js.native
        def replace(stateObject: State, params: Query, hash: String): Unit = js.native
        /**
          * Sets a callback function to respond to changes in the browser history.
          * @param callback a client-side callback function to run upon a history change event, using the event object as the only argument.
          */
        def setChangeHandler(handler: js.Function1[/* event */ HistoryChangeEvent, Unit]): Unit = js.native
      }
      
      @js.native
      object host extends js.Object {
        /**
          * Provides the host domain, so scripts can set their origin correctly.
          */
        val origin: String = js.native
        /**
          * Closes the current dialog or sidebar.
          */
        def close(): Unit = js.native
        /**
          * Sets the height of the current dialog.
          * @param height the new height, in pixels
          */
        def setHeight(height: Double): Unit = js.native
        /**
          * Sets the width of the current dialog.
          * @param width the new width, in pixels
          */
        def setWidth(width: Double): Unit = js.native
        @js.native
        object editor extends js.Object {
          /**
            * Switches browser focus from the dialog or sidebar to the Google Docs, Sheets, or Forms editor.
            */
          def focus(): Unit = js.native
        }
        
      }
      
      @js.native
      object url extends js.Object {
        /**
          * Gets a URL location object and passes it to the specified callback function (as the only argument).
          * @param callback a client-side callback function to run, using the location object as the only argument.
          */
        def getLocation(callback: js.Function1[/* location */ UrlLocation, Unit]): Unit = js.native
      }
      
    }
    
  }
  
}

