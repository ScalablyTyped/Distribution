package typings.googleScriptClientSide

import typings.googleScriptClientSide.google.script.PublicEndpoints
import typings.googleScriptClientSide.google.script.RunnerFunctions
import typings.googleScriptClientSide.google.script.UrlLocation
import typings.googleScriptClientSide.google.script.history.HistoryChangeEvent
import typings.googleScriptClientSide.google.script.history.Query
import typings.googleScriptClientSide.google.script.history.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object google {
    
    object script {
      
      object history {
        
        @JSGlobal("google.script.history")
        @js.native
        val ^ : js.Any = js.native
        
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
        inline def push(stateObject: State): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(stateObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def push(stateObject: State, params: Unit, hash: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(stateObject.asInstanceOf[js.Any], params.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def push(stateObject: State, params: Query): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(stateObject.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def push(stateObject: State, params: Query, hash: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(stateObject.asInstanceOf[js.Any], params.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
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
        inline def replace(stateObject: State): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(stateObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def replace(stateObject: State, params: Unit, hash: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(stateObject.asInstanceOf[js.Any], params.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def replace(stateObject: State, params: Query): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(stateObject.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
        inline def replace(stateObject: State, params: Query, hash: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(stateObject.asInstanceOf[js.Any], params.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        /**
          * Sets a callback function to respond to changes in the browser history.
          * @param callback a client-side callback function to run upon a history change event, using the event object as the only argument.
          */
        inline def setChangeHandler(handler: js.Function1[/* event */ HistoryChangeEvent, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setChangeHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
      }
      
      object host {
        
        @JSGlobal("google.script.host")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Closes the current dialog or sidebar.
          */
        inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
        
        object editor {
          
          @JSGlobal("google.script.host.editor")
          @js.native
          val ^ : js.Any = js.native
          
          /**
            * Switches browser focus from the dialog or sidebar to the Google Docs, Sheets, or Forms editor.
            */
          inline def focus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focus")().asInstanceOf[Unit]
        }
        
        /**
          * Provides the host domain, so scripts can set their origin correctly.
          */
        @JSGlobal("google.script.host.origin")
        @js.native
        val origin: String = js.native
        
        /**
          * Sets the height of the current dialog.
          * @param height the new height, in pixels
          */
        inline def setHeight(height: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHeight")(height.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        /**
          * Sets the width of the current dialog.
          * @param width the new width, in pixels
          */
        inline def setWidth(width: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWidth")(width.asInstanceOf[js.Any]).asInstanceOf[Unit]
      }
      
      @JSGlobal("google.script.run")
      @js.native
      val run: RunnerFunctions & PublicEndpoints = js.native
      
      object url {
        
        @JSGlobal("google.script.url")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Gets a URL location object and passes it to the specified callback function (as the only argument).
          * @param callback a client-side callback function to run, using the location object as the only argument.
          */
        inline def getLocation(callback: js.Function1[/* location */ UrlLocation, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      }
    }
  }
}
