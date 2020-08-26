package typings.dynatrace

import typings.dynatrace.dynatraceStrings._error_
import typings.dynatrace.dynatraceStrings._info_
import typings.dynatrace.dynatraceStrings._warn_
import typings.dynatrace.dynatraceStrings.c
import typings.dynatrace.dynatraceStrings.i
import typings.dynatrace.dynatraceStrings.s
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dynaTrace extends js.Object {
  /**
    * @description Adds a listener that is called when the user is leaving the page,
    * but before the monitor signal is sent
    * @param listener A function that will be called in case the user leaves the page.
    */
  def addPageLeavingListener(listener: js.Function1[/* key */ String, js.Object]): Unit = js.native
  @JSName("addStreamingNode")
  def addStreamingNode_error(
    source: String,
    duration: Double,
    userTriggered: Boolean,
    watchedCompletely: Boolean,
    maxPlayTime: Double,
    playTime: Double,
    bufferingCount: Double,
    bufferingTime: Double,
    `type`: _error_
  ): Unit = js.native
  /**
    * @description Sends a Streaming Node to the Server
    * @param source - URL of the streaming resource
    * @param duration - duration of the streaming resource in seconds
    * @param userTriggered - did the user trigger the playback or did it start automatically?
    * @param watchedCompletely - did the streaming resource play to the end?
    * @param maxPlayTime - maximum progress this streaming resource had in seconds
    * @param playTime - the time this streaming resource was playing in seconds
    * @param bufferingCount - amount of bufferings that occured during the playback
    * @param bufferingTime - total time spent with buffering in seconds
    * @param type - action type of the streaming node. Is used for classifying events
    *     on the serverside, e.g. _info_, _warn_, _error_
    */
  @JSName("addStreamingNode")
  def addStreamingNode_info(
    source: String,
    duration: Double,
    userTriggered: Boolean,
    watchedCompletely: Boolean,
    maxPlayTime: Double,
    playTime: Double,
    bufferingCount: Double,
    bufferingTime: Double,
    `type`: _info_
  ): Unit = js.native
  @JSName("addStreamingNode")
  def addStreamingNode_warn(
    source: String,
    duration: Double,
    userTriggered: Boolean,
    watchedCompletely: Boolean,
    maxPlayTime: Double,
    playTime: Double,
    bufferingCount: Double,
    bufferingTime: Double,
    `type`: _warn_
  ): Unit = js.native
  /**
    * @description Indicates the start of a user input. User inputs must always
    * be stopped by calling endUserInput. If an xhr call or a page load happens
    *  it is checked if a user input is active. If yes, the user input is set to
    * have triggered the page action.
    * @param domNode - Which triggered the action (button, etc) is used for determining its caption
    * @param type - Type of the user input: 'click', 'keypress', 'scroll',...
    * @param addInfo - Additional info for user input such as key, mouse button, etc ('F5', 'RETURN',...)
    * @param validTime - How long should the user input be able to open actions? default is 30ms
    */
  def beginUserInput(domNode: js.Any, `type`: String, addInfo: String, validTime: Double): js.Any = js.native
  /**
    * @description the user input object returned by beginUserInput
    */
  def endUserInput(userInputObject: js.Any): Unit = js.native
  /**
    * @description By default a visit ends after a configurable inactivity time (default is 30 min.).
    * Using the ADK, a visit can be ended forcibly, for example when a user logs out from an application.
    * Simply call dynaTrace.endVisit() and the visit ends without waiting for the inactivity time.
    * For correlation purposes the visit shows as active in the client for about three minutes,
    *  but actions sent after dynaTrace.endVisit() are added to a new visit.
    * End the current UEM visit. This is useful for "logout" buttons, so that,
    * when the user logs out, the user's visit can also be closed by calling this method.
    */
  def endVisit(): Unit = js.native
  /**
    * @description parentAction: optional id of parent action.
    *     - if parameter is not passed => appended to currently running action
    *     - if a number is passed => action is added as subaction to action with given id
    *     - if false => new root action is started.
    * The function returns an internal tracking object that represents the action that was started.
    * This tracking object must be passed to dynaTrace.leaveAction().
    * @param name - name of the action
    * @param type
    * @param startTime - time in milliseconds. if null, current time is used.
    * @param parentAction optional id of parent action. if parameter is not passed=> appended to
    *  currently running action, if false => root action, if a number is passed, action is added
    *  as subaction to action with given id.
    * @returns id of created action
    */
  def enterAction(name: String, `type`: String): Double = js.native
  def enterAction(name: String, `type`: String, time: js.UndefOr[scala.Nothing], parentAction: Boolean): Double = js.native
  def enterAction(name: String, `type`: String, time: js.UndefOr[scala.Nothing], parentAction: Double): Double = js.native
  def enterAction(name: String, `type`: String, time: Double): Double = js.native
  def enterAction(name: String, `type`: String, time: Double, parentAction: Boolean): Double = js.native
  def enterAction(name: String, `type`: String, time: Double, parentAction: Double): Double = js.native
  /**
    * @description Initiate ajax action. Must be closed by leaveXhrAction afterwards.
    * @param type Additional info about type of xhr (eg. framework name,etc)
    * @param mode - The action mode: 0 .. just extend running ajax actions 1 .. extend any running action 2 ..
    * extend any running action - visible subaction 3 .. start action if user input is present
    * @param webSocket - Indicates if this action is a webSocket action or not
    * @returns id of action
    */
  def enterXhrAction(`type`: String, mode: Double, webSocket: Boolean): Double = js.native
  /**
    * @description Indicates that an xhr callback is active (eg. XMLHttpRequest onreadystatechange).
    * This is necessary to automatically add actions started during a callback as subactions.
    * Xhr callback must be stopped by leaveXhrCallback.
    * @param actionId - id of action where callback belongs to
    */
  def enterXhrCallback(actionId: Double): Unit = js.native
  /**
    * @description Tells the JavaScript agent to wait for an additional call of signalOnLoadEnd.
    * When the last call of signalOnLoadEnd is performed the "onload" action is closed.
    *  Note: if this function is called, signalOnLoadEnd MUST be called afterwards to indicated the end of one load.
    * Otherwise there will be unexpected action behaviour.
    */
  def incrementOnLoadEndMarkers(): Unit = js.native
  /**
    * @description stops the action that is represented by the given tracking object.
    * @param actionId - id of action to leave. must be the value returned by enterAction
    * @param time - end time in milliseconds
    * @param startTime - optional start time in milliseconds (necessary if start time should be modified)
    */
  def leaveAction(actionId: Double): Unit = js.native
  def leaveAction(actionId: Double, time: js.UndefOr[scala.Nothing], startTime: Double): Unit = js.native
  def leaveAction(actionId: Double, time: Double): Unit = js.native
  def leaveAction(actionId: Double, time: Double, startTime: Double): Unit = js.native
  /**
    * @description Indicates the end of an xhr action. Must be started by leaveXhrAction beforehand.
    * @param id -  id of action (must be the value returned by enterXhrAction)
    */
  def leaveXhrAction(id: Double): Unit = js.native
  /**
    * @description Indicates the end of an xhr callback. Must be called after enterXhrCallback.
    * @param actionId - id of action where callback belongs to
    */
  def leaveXhrCallback(actionId: Double): Unit = js.native
  /**
    * @description Reports an error message
    * @param parentAction - parent action id. if not passed or null, error is added to current action
    */
  def reportError(error: String): Unit = js.native
  def reportError(error: String, parentAction: Double): Unit = js.native
  def reportError(error: Error): Unit = js.native
  def reportError(error: Error, parentAction: Double): Unit = js.native
  /**
    * @description Reports an event
    * @param parentAction - parent action id. if not passed or null, error is added to current action
    */
  def reportEvent(msg: String): Unit = js.native
  def reportEvent(msg: String, parentAction: Double): Unit = js.native
  /**
    * @description Reports a key value pair to the server. The data can e.g. be used to create charts.
    * The difference to the reportValue function is that here the value is a string.
    */
  def reportString(key: String, value: String): Unit = js.native
  /**
    * @description Reports a key value pair to the server. The data can e.g. be used to create charts.
    */
  def reportValue(key: String, value: Double): Unit = js.native
  /**
    * @description Reports a warning message
    * @param parentAction - parent action id. if not passed or null, error is added to current action
    */
  def reportWarning(warning: String): Unit = js.native
  def reportWarning(warning: String, parentAction: Double): Unit = js.native
  /**
    * @description Force signal sending to make certain that actions aren't lost.
    * @param forceSync - Force synchronous sending of signal (if false, it'll be sent asynchronously)
    * @param sendPreview - Force sending of preview signals which haven't been closed yet.
    * @param killUnfinished - Kills unfinished actions and sends them immediately. Handle with care, actions might be inaccurate.
    */
  def sendSignal(forceSync: Boolean, sendPreview: Boolean, killUnfinished: Boolean): Unit = js.native
  /**
    * @description Set the application version for this visit.
    * This will be read on the server side and included as part of each visit for easy splitting.
    * @param appVersion - The version string to be set.
    */
  def setAppVersion(appVersion: String): Unit = js.native
  /**
    * @description disable automatic detection
    * Use in conjuction with enterAction
    * @example
    *     dynaTrace.setAutomaticActionDetection(false);
    *     dynaTrace.enterAction('action message', 'select', null, null);
    */
  def setAutomaticActionDetection(on: Boolean): Unit = js.native
  /**
    * @description capture load event manually.
    * followed by a signalLoadEnd to complete the capture.
    */
  def setLoadEndManually(): Unit = js.native
  /**
    * @description Set meta-data for the page via a key/value pair.
    * @param key - The readable key for the value
    * @param value - The value to associate with the identifier
    */
  def setMetaData(key: String, value: String): Unit = js.native
  /**
    * @description Signals that the page has finished loading
    */
  def signalLoadEnd(): Unit = js.native
  /**
    * @description Signal load start. If load start can be determined more accurately
    * than the automatic detection, this function can be used.
    */
  def signalLoadStart(): Unit = js.native
  /**
    * @description Indicates the end of a load action. needs incrementOnLoadEndMarkers to be called before.
    *  As soon as the last signalOnLoadEnd is called, the "onload" action is closed.
    */
  def signalOnLoadEnd(): Unit = js.native
  /**
    * @description Indicates the start of a load action. Frameworks often have their own load callback functions.
    * This can be used when framework starts load before "DOMContentLoaded".
    */
  def signalOnLoadStart(): Unit = js.native
  @JSName("startThirdParty")
  def startThirdParty_c(`type`: c, url: String): Unit = js.native
  /**
    * @description Indicates start of a third party resource
    * @param type - i = image, s = script, c = custom
    */
  @JSName("startThirdParty")
  def startThirdParty_i(`type`: i, url: String): Unit = js.native
  @JSName("startThirdParty")
  def startThirdParty_s(`type`: s, url: String): Unit = js.native
  /**
    * @description Indicates stop of a third party resource
    * @param url - Complete URL of resource (must match URL provided in startThirdParty).
    * @param success - True if the resource was loaded successfully, false if not.
    * @param start - Absolute start time in milliseconds. When parameter is not passed or <= 0,
    *     time of startThirdParty call is used.
    * @param stop - Absolute stop time in milliseconds. When parameter is not passed or <= 0,
    *     time of stopThirdParty call is used.
    */
  def stopThirdParty(url: String, success: Boolean): Unit = js.native
  def stopThirdParty(url: String, success: Boolean, start: js.UndefOr[scala.Nothing], stop: Double): Unit = js.native
  def stopThirdParty(url: String, success: Boolean, start: Double): Unit = js.native
  def stopThirdParty(url: String, success: Boolean, start: Double, stop: Double): Unit = js.native
  /**
    * @description The JavaScript ADK enables you to tag your visits with any value you want.
    * Use tagVisit(visitName) to tag the current visit with the specified value
    */
  def tagVisit(visitName: String): Unit = js.native
}

