package typings.firefoxWebextBrowser.browser.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object which allows the addition and removal of listeners for a Chrome event. */
@js.native
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
  ] = js.native
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
  ] = js.native
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
  ] = js.native
  /**
    * Registers an event listener _callback_ to an event.
    * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
    */
  def addListener(callback: js.Function0[Unit]): Unit = js.native
  /**
    * @param callback Listener whose registration status shall be tested.
    * @returns True if _callback_ is registered to the event.
    */
  def hasListener(callback: js.Function0[Unit]): Boolean = js.native
  /** @returns True if any event listeners are registered to the event. */
  def hasListeners(): Boolean = js.native
  /**
    * Deregisters an event listener _callback_ from an event.
    * @param callback Listener that shall be unregistered.
    */
  def removeListener(callback: js.Function0[Unit]): Unit = js.native
}

object Event {
  @scala.inline
  def apply(
    addListener: js.Function0[Unit] => Unit,
    hasListener: js.Function0[Unit] => Boolean,
    hasListeners: () => Boolean,
    removeListener: js.Function0[Unit] => Unit
  ): Event = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), hasListener = js.Any.fromFunction1(hasListener), hasListeners = js.Any.fromFunction0(hasListeners), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddListener(value: js.Function0[Unit] => Unit): Self = this.set("addListener", js.Any.fromFunction1(value))
    @scala.inline
    def setHasListener(value: js.Function0[Unit] => Boolean): Self = this.set("hasListener", js.Any.fromFunction1(value))
    @scala.inline
    def setHasListeners(value: () => Boolean): Self = this.set("hasListeners", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveListener(value: js.Function0[Unit] => Unit): Self = this.set("removeListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddRules(
      value: (/* eventName */ String, /* webViewInstanceId */ Double, /* rules */ js.Array[Rule]) => js.Promise[js.Array[Rule]]
    ): Self = this.set("addRules", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAddRules: Self = this.set("addRules", js.undefined)
    @scala.inline
    def setGetRules(
      value: (/* eventName */ String, /* webViewInstanceId */ Double, /* ruleIdentifiers */ js.UndefOr[js.Array[String]]) => js.Promise[js.Array[Rule]]
    ): Self = this.set("getRules", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetRules: Self = this.set("getRules", js.undefined)
    @scala.inline
    def setRemoveRules(
      value: (/* eventName */ String, /* webViewInstanceId */ Double, /* ruleIdentifiers */ js.UndefOr[js.Array[String]]) => js.Promise[Unit]
    ): Self = this.set("removeRules", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRemoveRules: Self = this.set("removeRules", js.undefined)
  }
  
}

