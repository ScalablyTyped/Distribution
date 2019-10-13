package typings.firefoxDashWebextDashBrowser.browser.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object which allows the addition and removal of listeners for a Chrome event. */
trait Event extends js.Object {
  /**
    * Registers rules to handle events.
    * @param eventName Name of the event this function affects.
    * @param webViewInstanceId If provided, this is an integer that uniquely identfies the <webview> associated
    *     with this function call.
    * @param rules Rules to be registered. These do not replace previously registered rules.
    * @deprecated Unsupported on Firefox at this time.
    */
  var addRules: js.UndefOr[
    js.Function3[
      /* eventName */ String, 
      /* webViewInstanceId */ Double, 
      /* rules */ js.Array[Rule], 
      js.Promise[js.Array[Rule]]
    ]
  ] = js.undefined
  /**
    * Returns currently registered rules.
    * @param eventName Name of the event this function affects.
    * @param webViewInstanceId If provided, this is an integer that uniquely identfies the <webview> associated
    *     with this function call.
    * @param [ruleIdentifiers] If an array is passed, only rules with identifiers contained in this array are
    *     returned.
    * @deprecated Unsupported on Firefox at this time.
    */
  var getRules: js.UndefOr[
    js.Function3[
      /* eventName */ String, 
      /* webViewInstanceId */ Double, 
      /* ruleIdentifiers */ js.UndefOr[js.Array[String]], 
      js.Promise[js.Array[Rule]]
    ]
  ] = js.undefined
  /**
    * Unregisters currently registered rules.
    * @param eventName Name of the event this function affects.
    * @param webViewInstanceId If provided, this is an integer that uniquely identfies the <webview> associated
    *     with this function call.
    * @param [ruleIdentifiers] If an array is passed, only rules with identifiers contained in this array are
    *     unregistered.
    * @deprecated Unsupported on Firefox at this time.
    */
  var removeRules: js.UndefOr[
    js.Function3[
      /* eventName */ String, 
      /* webViewInstanceId */ Double, 
      /* ruleIdentifiers */ js.UndefOr[js.Array[String]], 
      js.Promise[Unit]
    ]
  ] = js.undefined
  /**
    * Registers an event listener _callback_ to an event.
    * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
    */
  def addListener(callback: js.Function0[Unit]): Unit
  /**
    * @param callback Listener whose registration status shall be tested.
    * @returns True if _callback_ is registered to the event.
    */
  def hasListener(callback: js.Function0[Unit]): Boolean
  /** @returns True if any event listeners are registered to the event. */
  def hasListeners(): Boolean
  /**
    * Deregisters an event listener _callback_ from an event.
    * @param callback Listener that shall be unregistered.
    */
  def removeListener(callback: js.Function0[Unit]): Unit
}

object Event {
  @scala.inline
  def apply(
    addListener: js.Function0[Unit] => Unit,
    hasListener: js.Function0[Unit] => Boolean,
    hasListeners: () => Boolean,
    removeListener: js.Function0[Unit] => Unit,
    addRules: (/* eventName */ String, /* webViewInstanceId */ Double, /* rules */ js.Array[Rule]) => js.Promise[js.Array[Rule]] = null,
    getRules: (/* eventName */ String, /* webViewInstanceId */ Double, /* ruleIdentifiers */ js.UndefOr[js.Array[String]]) => js.Promise[js.Array[Rule]] = null,
    removeRules: (/* eventName */ String, /* webViewInstanceId */ Double, /* ruleIdentifiers */ js.UndefOr[js.Array[String]]) => js.Promise[Unit] = null
  ): Event = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), hasListener = js.Any.fromFunction1(hasListener), hasListeners = js.Any.fromFunction0(hasListeners), removeListener = js.Any.fromFunction1(removeListener))
    if (addRules != null) __obj.updateDynamic("addRules")(js.Any.fromFunction3(addRules))
    if (getRules != null) __obj.updateDynamic("getRules")(js.Any.fromFunction3(getRules))
    if (removeRules != null) __obj.updateDynamic("removeRules")(js.Any.fromFunction3(removeRules))
    __obj.asInstanceOf[Event]
  }
}

