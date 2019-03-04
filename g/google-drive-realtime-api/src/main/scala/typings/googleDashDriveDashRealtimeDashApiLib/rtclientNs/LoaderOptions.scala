package typings
package googleDashDriveDashRealtimeDashApiLib.rtclientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  // Your Application ID from the Google APIs Console.
  var appId: java.lang.String
  // The ID of the button to click to authorize. Must be a DOM element ID.
  var authButtonElementId: java.lang.String
  // Autocreate files right after auth automatically.
  var autoCreate: scala.Boolean
  // Client ID from the console.
  var clientId: java.lang.String
  // The name of newly created Drive files, if no title is specified.
  var defaultTitle: java.lang.String
  // The MIME type of newly created Drive Files. By default the application
  // specific MIME type will be used:
  // application/vnd.google-apps.drive-sdk.
  var newFileMimeType: java.lang.String
  // Function to be called after authorization and before loading files.
  def afterAuth(): scala.Unit
  // Function to be called when a Realtime model is first created.
  def initializeModel(model: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Model): scala.Unit
  // Function to be called every time a Realtime file is loaded.
  def onFileLoaded(rtdoc: googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document): scala.Unit
  //newFileMimeType = null // default
  // Function to be called to initialize custom Collaborative Objects types.
  def registerTypes(): scala.Unit
}

object LoaderOptions {
  @scala.inline
  def apply(
    afterAuth: js.Function0[scala.Unit],
    appId: java.lang.String,
    authButtonElementId: java.lang.String,
    autoCreate: scala.Boolean,
    clientId: java.lang.String,
    defaultTitle: java.lang.String,
    initializeModel: js.Function1[googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Model, scala.Unit],
    newFileMimeType: java.lang.String,
    onFileLoaded: js.Function1[
      googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs.Document, 
      scala.Unit
    ],
    registerTypes: js.Function0[scala.Unit]
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal(afterAuth = afterAuth, appId = appId, authButtonElementId = authButtonElementId, autoCreate = autoCreate, clientId = clientId, defaultTitle = defaultTitle, initializeModel = initializeModel, newFileMimeType = newFileMimeType, onFileLoaded = onFileLoaded, registerTypes = registerTypes)
  
    __obj.asInstanceOf[LoaderOptions]
  }
}

