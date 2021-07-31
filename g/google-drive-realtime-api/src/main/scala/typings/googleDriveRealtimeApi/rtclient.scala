package typings.googleDriveRealtimeApi

import org.scalablytyped.runtime.Instantiable1
import typings.googleDriveRealtimeApi.anon.FileIds
import typings.googleDriveRealtimeApi.gapi.drive.realtime.Document
import typings.googleDriveRealtimeApi.gapi.drive.realtime.Error
import typings.googleDriveRealtimeApi.gapi.drive.realtime.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// rtclient is a global var introduced by realtime-client-utils.js
object rtclient {
  
  trait ClientUtils extends StObject {
    
    var RealtimeLoader: RealtimeLoaderFactory
    
    /**
      * Creates a new Realtime file.
      * @param title {string} title of the newly created file.
      * @param mimeType {string} the MIME type of the new file.
      * @param callback {(file:DriveAPIFileResource) => void} the callback to call after creation.
      */
    def createRealtimeFile(title: String, mimeType: String, callback: js.Function1[/* file */ DriveAPIFileResource, Unit]): Unit
    
    // INCOMPLETE
    var params: FileIds
  }
  object ClientUtils {
    
    @scala.inline
    def apply(
      RealtimeLoader: RealtimeLoaderFactory,
      createRealtimeFile: (String, String, js.Function1[/* file */ DriveAPIFileResource, Unit]) => Unit,
      params: FileIds
    ): ClientUtils = {
      val __obj = js.Dynamic.literal(RealtimeLoader = RealtimeLoader.asInstanceOf[js.Any], createRealtimeFile = js.Any.fromFunction3(createRealtimeFile), params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientUtils]
    }
    
    @scala.inline
    implicit class ClientUtilsMutableBuilder[Self <: ClientUtils] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateRealtimeFile(value: (String, String, js.Function1[/* file */ DriveAPIFileResource, Unit]) => Unit): Self = StObject.set(x, "createRealtimeFile", js.Any.fromFunction3(value))
      
      @scala.inline
      def setParams(value: FileIds): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealtimeLoader(value: RealtimeLoaderFactory): Self = StObject.set(x, "RealtimeLoader", value.asInstanceOf[js.Any])
    }
  }
  
  trait DriveAPIFileResource extends StObject {
    
    var id: String
  }
  object DriveAPIFileResource {
    
    @scala.inline
    def apply(id: String): DriveAPIFileResource = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DriveAPIFileResource]
    }
    
    @scala.inline
    implicit class DriveAPIFileResourceMutableBuilder[Self <: DriveAPIFileResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoaderOptions extends StObject {
    
    // Function to be called after authorization and before loading files.
    def afterAuth(): Unit
    
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
    
    // Function to be called when a Realtime model is first created.
    def initializeModel(model: Model): Unit
    
    // The MIME type of newly created Drive Files. By default the application
    // specific MIME type will be used:
    // application/vnd.google-apps.drive-sdk.
    var newFileMimeType: String
    
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
    
    @scala.inline
    implicit class LoaderOptionsMutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterAuth(value: () => Unit): Self = StObject.set(x, "afterAuth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthButtonElementId(value: String): Self = StObject.set(x, "authButtonElementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCreate(value: Boolean): Self = StObject.set(x, "autoCreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTitle(value: String): Self = StObject.set(x, "defaultTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitializeModel(value: Model => Unit): Self = StObject.set(x, "initializeModel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNewFileMimeType(value: String): Self = StObject.set(x, "newFileMimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFileLoaded(value: Document => Unit): Self = StObject.set(x, "onFileLoaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterTypes(value: () => Unit): Self = StObject.set(x, "registerTypes", js.Any.fromFunction0(value))
    }
  }
  
  trait RealtimeLoader extends StObject {
    
    def handleErrors(e: Error): Unit
    
    def load(): Unit
    
    def start(): Unit
  }
  object RealtimeLoader {
    
    @scala.inline
    def apply(handleErrors: Error => Unit, load: () => Unit, start: () => Unit): RealtimeLoader = {
      val __obj = js.Dynamic.literal(handleErrors = js.Any.fromFunction1(handleErrors), load = js.Any.fromFunction0(load), start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[RealtimeLoader]
    }
    
    @scala.inline
    implicit class RealtimeLoaderMutableBuilder[Self <: RealtimeLoader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleErrors(value: Error => Unit): Self = StObject.set(x, "handleErrors", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoad(value: () => Unit): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait RealtimeLoaderFactory
    extends StObject
       with Instantiable1[/* options */ LoaderOptions, RealtimeLoader]
  
  // INCOMPLETE
  object params
}
