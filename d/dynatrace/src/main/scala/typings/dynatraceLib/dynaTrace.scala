package typings
package dynatraceLib

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
  def addPageLeavingListener(listener: js.Function1[/* key */ java.lang.String, js.Object]): scala.Unit = js.native
  @JSName("addStreamingNode")
  def addStreamingNode_error(
    source: java.lang.String,
    duration: scala.Double,
    userTriggered: scala.Boolean,
    watchedCompletely: scala.Boolean,
    maxPlayTime: scala.Double,
    playTime: scala.Double,
    bufferingCount: scala.Double,
    bufferingTime: scala.Double,
    `type`: dynatraceLib.dynatraceLibStrings._error_
  ): scala.Unit = js.native
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
    source: java.lang.String,
    duration: scala.Double,
    userTriggered: scala.Boolean,
    watchedCompletely: scala.Boolean,
    maxPlayTime: scala.Double,
    playTime: scala.Double,
    bufferingCount: scala.Double,
    bufferingTime: scala.Double,
    `type`: dynatraceLib.dynatraceLibStrings._info_
  ): scala.Unit = js.native
  @JSName("addStreamingNode")
  def addStreamingNode_warn(
    source: java.lang.String,
    duration: scala.Double,
    userTriggered: scala.Boolean,
    watchedCompletely: scala.Boolean,
    maxPlayTime: scala.Double,
    playTime: scala.Double,
    bufferingCount: scala.Double,
    bufferingTime: scala.Double,
    `type`: dynatraceLib.dynatraceLibStrings._warn_
  ): scala.Unit = js.native
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
  def beginUserInput(domNode: js.Any, `type`: java.lang.String, addInfo: java.lang.String, validTime: scala.Double): js.Any = js.native
  /**
    * @description the user input object returned by beginUserInput
    */
  def endUserInput(userInputObject: js.Any): scala.Unit = js.native
  /**
    * @description By default a visit ends after a configurable inactivity time (default is 30 min.).
    * Using the ADK, a visit can be ended forcibly, for example when a user logs out from an application.
    * Simply call dynaTrace.endVisit() and the visit ends without waiting for the inactivity time.
    * For correlation purposes the visit shows as active in the client for about three minutes,
    *  but actions sent after dynaTrace.endVisit() are added to a new visit.
    * End the current UEM visit. This is useful for "logout" buttons, so that,
    * when the user logs out, the user's visit can also be closed by calling this method.
    */
  def endVisit(): scala.Unit = js.native
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
  def enterAction(name: java.lang.String, `type`: java.lang.String): scala.Double = js.native
  def enterAction(name: java.lang.String, `type`: java.lang.String, time: scala.Double): scala.Double = js.native
  def enterAction(name: java.lang.String, `type`: java.lang.String, time: scala.Double, parentAction: scala.Boolean): scala.Double = js.native
  def enterAction(name: java.lang.String, `type`: java.lang.String, time: scala.Double, parentAction: scala.Double): scala.Double = js.native
  /**
    * @description Initiate ajax action. Must be closed by leaveXhrAction afterwards.
    * @param type Additional info about type of xhr (eg. framework name,etc)
    * @param mode - The action mode: 0 .. just extend running ajax actions 1 .. extend any running action 2 ..
    * extend any running action - visible subaction 3 .. start action if user input is present
    * @param webSocket - Indicates if this action is a webSocket action or not
    * @returns id of action
    */
  def enterXhrAction(`type`: java.lang.String, mode: scala.Double, webSocket: scala.Boolean): scala.Double = js.native
  /**
    * @description Indicates that an xhr callback is active (eg. XMLHttpRequest onreadystatechange).
    * This is necessary to automatically add actions started during a callback as subactions.
    * Xhr callback must be stopped by leaveXhrCallback.
    * @param actionId - id of action where callback belongs to
    */
  def enterXhrCallback(actionId: scala.Double): scala.Unit = js.native
  /**
    * @description Tells the JavaScript agent to wait for an additional call of signalOnLoadEnd.
    * When the last call of signalOnLoadEnd is performed the "onload" action is closed.
    *  Note: if this function is called, signalOnLoadEnd MUST be called afterwards to indicated the end of one load.
    * Otherwise there will be unexpected action behaviour.
    */
  def incrementOnLoadEndMarkers(): scala.Unit = js.native
  /**
    * @description stops the action that is represented by the given tracking object.
    * @param actionId - id of action to leave. must be the value returned by enterAction
    * @param time - end time in milliseconds
    * @param startTime - optional start time in milliseconds (necessary if start time should be modified)
    */
  def leaveAction(actionId: scala.Double): scala.Unit = js.native
  def leaveAction(actionId: scala.Double, time: scala.Double): scala.Unit = js.native
  def leaveAction(actionId: scala.Double, time: scala.Double, startTime: scala.Double): scala.Unit = js.native
  /**
    * @description Indicates the end of an xhr action. Must be started by leaveXhrAction beforehand.
    * @param id -  id of action (must be the value returned by enterXhrAction)
    */
  def leaveXhrAction(id: scala.Double): scala.Unit = js.native
  /**
    * @description Indicates the end of an xhr callback. Must be called after enterXhrCallback.
    * @param actionId - id of action where callback belongs to
    */
  def leaveXhrCallback(actionId: scala.Double): scala.Unit = js.native
  /**
    * @description Reports an error message
    * @param parentAction - parent action id. if not passed or null, error is added to current action
    */
  def reportError(error: java.lang.String): scala.Unit = js.native
  def reportError(error: java.lang.String, parentAction: scala.Double): scala.Unit = js.native
  def reportError(error: stdLib.Error): scala.Unit = js.native
  def reportError(error: stdLib.Error, parentAction: scala.Double): scala.Unit = js.native
  /**
    * @description Reports an event
    * @param parentAction - parent action id. if not passed or null, error is added to current action
    */
  def reportEvent(msg: java.lang.String): scala.Unit = js.native
  def reportEvent(msg: java.lang.String, parentAction: scala.Double): scala.Unit = js.native
  /**
    * @description Reports a key value pair to the server. The data can e.g. be used to create charts.
    * The difference to the reportValue function is that here the value is a string.
    */
  def reportString(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * @description Reports a key value pair to the server. The data can e.g. be used to create charts.
    */
  def reportValue(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
    * @description Reports a warning message
    * @param parentAction - parent action id. if not passed or null, error is added to current action
    */
  def reportWarning(warning: java.lang.String): scala.Unit = js.native
  def reportWarning(warning: java.lang.String, parentAction: scala.Double): scala.Unit = js.native
  /**
    * @description Force signal sending to make certain that actions aren't lost.
    * @param forceSync - Force synchronous sending of signal (if false, it'll be sent asynchronously)
    * @param sendPreview - Force sending of preview signals which haven't been closed yet.
    * @param killUnfinished - Kills unfinished actions and sends them immediately. Handle with care, actions might be inaccurate.
    */
  def sendSignal(forceSync: scala.Boolean, sendPreview: scala.Boolean, killUnfinished: scala.Boolean): scala.Unit = js.native
  /**
    * @description Set the application version for this visit.
    * This will be read on the server side and included as part of each visit for easy splitting.
    * @param appVersion - The version string to be set.
    */
  def setAppVersion(appVersion: java.lang.String): scala.Unit = js.native
  /**
    * @description disable automatic detection
    * Use in conjuction with enterAction
    * @example
    *     dynaTrace.setAutomaticActionDetection(false);
    *     dynaTrace.enterAction('action message', 'select', null, null);
    */
  def setAutomaticActionDetection(on: scala.Boolean): scala.Unit = js.native
  /**
    * @description capture load event manually.
    * followed by a signalLoadEnd to complete the capture.
    */
  def setLoadEndManually(): scala.Unit = js.native
  /**
    * @description Set meta-data for the page via a key/value pair.
    * @param key - The readable key for the value
    * @param value - The value to associate with the identifier
    */
  def setMetaData(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * @description Signals that the page has finished loading
    */
  def signalLoadEnd(): scala.Unit = js.native
  /**
    * @description Signal load start. If load start can be determined more accurately
    * than the automatic detection, this function can be used.
    */
  def signalLoadStart(): scala.Unit = js.native
  /**
    * @description Indicates the end of a load action. needs incrementOnLoadEndMarkers to be called before.
    *  As soon as the last signalOnLoadEnd is called, the "onload" action is closed.
    */
  def signalOnLoadEnd(): scala.Unit = js.native
  /**
    * @description Indicates the start of a load action. Frameworks often have their own load callback functions.
    * This can be used when framework starts load before "DOMContentLoaded".
    */
  def signalOnLoadStart(): scala.Unit = js.native
  @JSName("startThirdParty")
  def startThirdParty_c(`type`: dynatraceLib.dynatraceLibStrings.c, url: java.lang.String): scala.Unit = js.native
  /**
    * @description Indicates start of a third party resource
    * @param type - i = image, s = script, c = custom
    */
  @JSName("startThirdParty")
  def startThirdParty_i(`type`: dynatraceLib.dynatraceLibStrings.i, url: java.lang.String): scala.Unit = js.native
  @JSName("startThirdParty")
  def startThirdParty_s(`type`: dynatraceLib.dynatraceLibStrings.s, url: java.lang.String): scala.Unit = js.native
  /**
    * @description Indicates stop of a third party resource
    * @param url - Complete URL of resource (must match URL provided in startThirdParty).
    * @param success - True if the resource was loaded successfully, false if not.
    * @param start - Absolute start time in milliseconds. When parameter is not passed or <= 0,
    *     time of startThirdParty call is used.
    * @param stop - Absolute stop time in milliseconds. When parameter is not passed or <= 0,
    *     time of stopThirdParty call is used.
    */
  def stopThirdParty(url: java.lang.String, success: scala.Boolean): scala.Unit = js.native
  def stopThirdParty(url: java.lang.String, success: scala.Boolean, start: scala.Double): scala.Unit = js.native
  def stopThirdParty(url: java.lang.String, success: scala.Boolean, start: scala.Double, stop: scala.Double): scala.Unit = js.native
  /**
    * @description The JavaScript ADK enables you to tag your visits with any value you want.
    * Use tagVisit(visitName) to tag the current visit with the specified value
    */
  def tagVisit(visitName: java.lang.String): scala.Unit = js.native
}

