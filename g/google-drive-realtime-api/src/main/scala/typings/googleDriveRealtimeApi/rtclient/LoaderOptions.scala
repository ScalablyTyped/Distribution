package typings.googleDriveRealtimeApi.rtclient

import typings.googleDriveRealtimeApi.gapi.drive.realtime.Document
import typings.googleDriveRealtimeApi.gapi.drive.realtime.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderOptions extends js.Object {
  // Your Application ID from the Google APIs Console.
  var appId: String = js.native
  // The ID of the button to click to authorize. Must be a DOM element ID.
  var authButtonElementId: String = js.native
  // Autocreate files right after auth automatically.
  var autoCreate: Boolean = js.native
  // Client ID from the console.
  var clientId: String = js.native
  // The name of newly created Drive files, if no title is specified.
  var defaultTitle: String = js.native
  // The MIME type of newly created Drive Files. By default the application
  // specific MIME type will be used:
  // application/vnd.google-apps.drive-sdk.
  var newFileMimeType: String = js.native
  // Function to be called after authorization and before loading files.
  def afterAuth(): Unit = js.native
  // Function to be called when a Realtime model is first created.
  def initializeModel(model: Model): Unit = js.native
  // Function to be called every time a Realtime file is loaded.
  def onFileLoaded(rtdoc: Document): Unit = js.native
  //newFileMimeType = null // default
  // Function to be called to initialize custom Collaborative Objects types.
  def registerTypes(): Unit = js.native
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
  @scala.inline
  implicit class LoaderOptionsOps[Self <: LoaderOptions] (val x: Self) extends AnyVal {
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
    def setAfterAuth(value: () => Unit): Self = this.set("afterAuth", js.Any.fromFunction0(value))
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthButtonElementId(value: String): Self = this.set("authButtonElementId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoCreate(value: Boolean): Self = this.set("autoCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultTitle(value: String): Self = this.set("defaultTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitializeModel(value: Model => Unit): Self = this.set("initializeModel", js.Any.fromFunction1(value))
    @scala.inline
    def setNewFileMimeType(value: String): Self = this.set("newFileMimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnFileLoaded(value: Document => Unit): Self = this.set("onFileLoaded", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterTypes(value: () => Unit): Self = this.set("registerTypes", js.Any.fromFunction0(value))
  }
  
}

