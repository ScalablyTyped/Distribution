package typings.googleDriveRealtimeApi.rtclient

import typings.googleDriveRealtimeApi.gapi.drive.realtime.Document
import typings.googleDriveRealtimeApi.gapi.drive.realtime.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderOptions extends js.Object {
  // Your Application ID from the Google APIs Console.
  var appId: String
  // The ID of the button to click to authorize. Must be a DOM element ID.
  var authButtonElementId: String
  // Autocreate files right after auth automatically.
  var autoCreate: Boolean
  // Client ID from the console.
  var clientId: String
  // The name of newly created Drive files, if no title is specified.
  var defaultTitle: String
  // The MIME type of newly created Drive Files. By default the application
  // specific MIME type will be used:
  // application/vnd.google-apps.drive-sdk.
  var newFileMimeType: String
  // Function to be called after authorization and before loading files.
  def afterAuth(): Unit
  // Function to be called when a Realtime model is first created.
  def initializeModel(model: Model): Unit
  // Function to be called every time a Realtime file is loaded.
  def onFileLoaded(rtdoc: Document): Unit
  //newFileMimeType = null // default
  // Function to be called to initialize custom Collaborative Objects types.
  def registerTypes(): Unit
}

object LoaderOptions {
  @scala.inline
  def apply(
    afterAuth: () => Unit,
    appId: String,
    authButtonElementId: String,
    autoCreate: Boolean,
    clientId: String,
    defaultTitle: String,
    initializeModel: Model => Unit,
    newFileMimeType: String,
    onFileLoaded: Document => Unit,
    registerTypes: () => Unit
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal(afterAuth = js.Any.fromFunction0(afterAuth), appId = appId.asInstanceOf[js.Any], authButtonElementId = authButtonElementId.asInstanceOf[js.Any], autoCreate = autoCreate.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], defaultTitle = defaultTitle.asInstanceOf[js.Any], initializeModel = js.Any.fromFunction1(initializeModel), newFileMimeType = newFileMimeType.asInstanceOf[js.Any], onFileLoaded = js.Any.fromFunction1(onFileLoaded), registerTypes = js.Any.fromFunction0(registerTypes))
    __obj.asInstanceOf[LoaderOptions]
  }
}

