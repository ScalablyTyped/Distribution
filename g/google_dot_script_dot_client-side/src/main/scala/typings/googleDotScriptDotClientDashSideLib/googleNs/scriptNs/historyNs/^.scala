package typings
package googleDotScriptDotClientDashSideLib.googleNs.scriptNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.script.history")
@js.native
object ^ extends js.Object {
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
  def push(stateObject: State): scala.Unit = js.native
  def push(stateObject: State, params: Query): scala.Unit = js.native
  def push(stateObject: State, params: Query, hash: java.lang.String): scala.Unit = js.native
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
  def replace(stateObject: State): scala.Unit = js.native
  def replace(stateObject: State, params: Query): scala.Unit = js.native
  def replace(stateObject: State, params: Query, hash: java.lang.String): scala.Unit = js.native
  /**
    * Sets a callback function to respond to changes in the browser history.
    * @param callback a client-side callback function to run upon a history change event, using the event object as the only argument.
    */
  def setChangeHandler(handler: js.Function1[/* event */ HistoryChangeEvent, scala.Unit]): scala.Unit = js.native
}

