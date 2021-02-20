package typings.googlePicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object google {
  
  object picker {
    
    @js.native
    trait DocsUploadView extends StObject {
      
      // Allows the user to select a folder in Google Drive to upload to.
      def setIncludeFolders(included: Boolean): DocsUploadView = js.native
      
      // Sets the upload destination to the specified folder. This overrides ".setIncludeFolders" to false.
      def setParent(parentId: String): DocsUploadView = js.native
    }
    object DocsUploadView {
      
      @scala.inline
      def apply(setIncludeFolders: Boolean => DocsUploadView, setParent: String => DocsUploadView): DocsUploadView = {
        val __obj = js.Dynamic.literal(setIncludeFolders = js.Any.fromFunction1(setIncludeFolders), setParent = js.Any.fromFunction1(setParent))
        __obj.asInstanceOf[DocsUploadView]
      }
      
      @scala.inline
      implicit class DocsUploadViewMutableBuilder[Self <: DocsUploadView] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSetIncludeFolders(value: Boolean => DocsUploadView): Self = StObject.set(x, "setIncludeFolders", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetParent(value: String => DocsUploadView): Self = StObject.set(x, "setParent", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait DocsView extends StObject {
      
      // Allows the user to select folders from Team Drives.
      def setEnableTeamDrives(enabled: Boolean): DocsView = js.native
      
      // Show folders in the view items.
      def setIncludeFolders(included: Boolean): DocsView = js.native
      
      // Set the MIME types which will be included in the view. Use commas to separate MIME types if more than one is required.
      def setMimeTypes(mimeTypes: String): DocsView = js.native
      
      // Selects which mode the view will use to display the documents.
      def setMode(mode: String): DocsView = js.native
      
      // Filters the documents based on whether they are owned by the user, or shared with the user.
      def setOwnedByMe(): DocsView = js.native
      def setOwnedByMe(me: Boolean): DocsView = js.native
      
      // Sets the initial parent folder to display.
      def setParent(parentId: String): DocsView = js.native
      
      // Allows the user to select a folder in Google Drive.
      def setSelectFolderEnabled(enabled: Boolean): DocsView = js.native
      
      // Filters the documents based on whether they are starred by the user.
      def setStarred(starred: Boolean): DocsView = js.native
    }
    
    @js.native
    trait Picker extends StObject {
      
      def dispose(): Unit = js.native
      
      def isVisible(): Boolean = js.native
      
      def setCallback(method: js.Function): Picker = js.native
      
      def setRelayUrl(url: String): Picker = js.native
      
      def setVisible(visible: Boolean): Picker = js.native
    }
    object Picker {
      
      @scala.inline
      def apply(
        dispose: () => Unit,
        isVisible: () => Boolean,
        setCallback: js.Function => Picker,
        setRelayUrl: String => Picker,
        setVisible: Boolean => Picker
      ): Picker = {
        val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isVisible = js.Any.fromFunction0(isVisible), setCallback = js.Any.fromFunction1(setCallback), setRelayUrl = js.Any.fromFunction1(setRelayUrl), setVisible = js.Any.fromFunction1(setVisible))
        __obj.asInstanceOf[Picker]
      }
      
      @scala.inline
      implicit class PickerMutableBuilder[Self <: Picker] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetCallback(value: js.Function => Picker): Self = StObject.set(x, "setCallback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetRelayUrl(value: String => Picker): Self = StObject.set(x, "setRelayUrl", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetVisible(value: Boolean => Picker): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait PickerBuilder extends StObject {
      
      // Add a View to the navigation pane.
      def addView(viewOrId: js.Any): PickerBuilder = js.native
      
      // Add a ViewGroup to the top-level navigation pane.
      def addViewGroup(viewGroup: js.Any): PickerBuilder = js.native
      
      // Construct the Picker object. The Picker object is returned.
      def build(): Picker = js.native
      
      // Disable a picker feature.
      def disableFeature(feature: String): PickerBuilder = js.native
      
      // Enable a picker feature.
      def enableFeature(feature: String): PickerBuilder = js.native
      
      // Get the relay URL, used for gadgets.rpc.
      def getRelayUrl(): String = js.native
      
      // Get the dialog title.
      def getTitle(): String = js.native
      
      // Disable the title bar from being shown. To re-enable, call setTitle with a non-empty title or undefined.
      def hideTitleBar(): PickerBuilder = js.native
      
      // Check if a picker Feature is enabled.
      def isFeatureEnabled(feature: String): Boolean = js.native
      
      // Sets the Google Drive App ID needed to allow application to access the user's files via the Google Drive API.
      def setAppId(appId: String): PickerBuilder = js.native
      
      // Set the callback method called when the user picks and item (or items), or cancels. The callback method receives a single callback object. The structure of the callback object is described in the JSON Guide.
      def setCallback(method: js.Function): PickerBuilder = js.native
      
      // Sets the Browser API key obtained from Google Developers Console. See the Developer's Guide for details on how to obtain the Browser API key.
      def setDeveloperKey(key: String): PickerBuilder = js.native
      
      // Set the document.
      def setDocument(document: String): PickerBuilder = js.native
      
      // ISO 639 language code. If the language is not supported, en-US is used. This method provides an alternative to setting the locale at google.load() time. See the Developer's Guide for a list of supported locales.
      def setLocale(locale: String): PickerBuilder = js.native
      
      // Sets the maximum number of items a user can pick.
      def setMaxItems(max: Double): PickerBuilder = js.native
      
      // Sets an OAuth token to use for authenticating the current user. Depending on the scope of the token, only certain views will display data. Valid scopes are Google Docs, Drive, Photos, YouTube.
      def setOAuthToken(token: String): PickerBuilder = js.native
      
      // Sets the origin of picker dialog. The origin should be set to the window.location.protocol + '//' + window.location.host of the top-most page, if your application is running in an iframe.
      def setOrigin(origin: String): PickerBuilder = js.native
      
      // Set the relay URL, used for gadgets.rpc.
      def setRelayUrl(url: String): PickerBuilder = js.native
      
      // Set the list of MIME types which will be selectable. Use commas to separate MIME types if more than one is required.
      def setSelectableMimeTypes(`type`: String): PickerBuilder = js.native
      
      // Set the preferred dialog size. The dialog will be auto-centered. It has a minimum size of (566,350) and a maximum size of (1051,650).
      def setSize(width: Double, height: Double): PickerBuilder = js.native
      
      // Set the dialog title.
      def setTitle(title: String): PickerBuilder = js.native
      
      // Specify an album ID for photo uploads. See Picasa Web Albums Data API documentation for more information about albums.
      def setUploadToAlbumId(albumId: String): PickerBuilder = js.native
      
      // Returns the URI generated by this builder.
      def toUri(): String = js.native
    }
    object PickerBuilder {
      
      @scala.inline
      def apply(
        addView: js.Any => PickerBuilder,
        addViewGroup: js.Any => PickerBuilder,
        build: () => Picker,
        disableFeature: String => PickerBuilder,
        enableFeature: String => PickerBuilder,
        getRelayUrl: () => String,
        getTitle: () => String,
        hideTitleBar: () => PickerBuilder,
        isFeatureEnabled: String => Boolean,
        setAppId: String => PickerBuilder,
        setCallback: js.Function => PickerBuilder,
        setDeveloperKey: String => PickerBuilder,
        setDocument: String => PickerBuilder,
        setLocale: String => PickerBuilder,
        setMaxItems: Double => PickerBuilder,
        setOAuthToken: String => PickerBuilder,
        setOrigin: String => PickerBuilder,
        setRelayUrl: String => PickerBuilder,
        setSelectableMimeTypes: String => PickerBuilder,
        setSize: (Double, Double) => PickerBuilder,
        setTitle: String => PickerBuilder,
        setUploadToAlbumId: String => PickerBuilder,
        toUri: () => String
      ): PickerBuilder = {
        val __obj = js.Dynamic.literal(addView = js.Any.fromFunction1(addView), addViewGroup = js.Any.fromFunction1(addViewGroup), build = js.Any.fromFunction0(build), disableFeature = js.Any.fromFunction1(disableFeature), enableFeature = js.Any.fromFunction1(enableFeature), getRelayUrl = js.Any.fromFunction0(getRelayUrl), getTitle = js.Any.fromFunction0(getTitle), hideTitleBar = js.Any.fromFunction0(hideTitleBar), isFeatureEnabled = js.Any.fromFunction1(isFeatureEnabled), setAppId = js.Any.fromFunction1(setAppId), setCallback = js.Any.fromFunction1(setCallback), setDeveloperKey = js.Any.fromFunction1(setDeveloperKey), setDocument = js.Any.fromFunction1(setDocument), setLocale = js.Any.fromFunction1(setLocale), setMaxItems = js.Any.fromFunction1(setMaxItems), setOAuthToken = js.Any.fromFunction1(setOAuthToken), setOrigin = js.Any.fromFunction1(setOrigin), setRelayUrl = js.Any.fromFunction1(setRelayUrl), setSelectableMimeTypes = js.Any.fromFunction1(setSelectableMimeTypes), setSize = js.Any.fromFunction2(setSize), setTitle = js.Any.fromFunction1(setTitle), setUploadToAlbumId = js.Any.fromFunction1(setUploadToAlbumId), toUri = js.Any.fromFunction0(toUri))
        __obj.asInstanceOf[PickerBuilder]
      }
      
      @scala.inline
      implicit class PickerBuilderMutableBuilder[Self <: PickerBuilder] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddView(value: js.Any => PickerBuilder): Self = StObject.set(x, "addView", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAddViewGroup(value: js.Any => PickerBuilder): Self = StObject.set(x, "addViewGroup", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBuild(value: () => Picker): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDisableFeature(value: String => PickerBuilder): Self = StObject.set(x, "disableFeature", js.Any.fromFunction1(value))
        
        @scala.inline
        def setEnableFeature(value: String => PickerBuilder): Self = StObject.set(x, "enableFeature", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetRelayUrl(value: () => String): Self = StObject.set(x, "getRelayUrl", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
        
        @scala.inline
        def setHideTitleBar(value: () => PickerBuilder): Self = StObject.set(x, "hideTitleBar", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsFeatureEnabled(value: String => Boolean): Self = StObject.set(x, "isFeatureEnabled", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetAppId(value: String => PickerBuilder): Self = StObject.set(x, "setAppId", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetCallback(value: js.Function => PickerBuilder): Self = StObject.set(x, "setCallback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetDeveloperKey(value: String => PickerBuilder): Self = StObject.set(x, "setDeveloperKey", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetDocument(value: String => PickerBuilder): Self = StObject.set(x, "setDocument", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetLocale(value: String => PickerBuilder): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetMaxItems(value: Double => PickerBuilder): Self = StObject.set(x, "setMaxItems", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetOAuthToken(value: String => PickerBuilder): Self = StObject.set(x, "setOAuthToken", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetOrigin(value: String => PickerBuilder): Self = StObject.set(x, "setOrigin", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetRelayUrl(value: String => PickerBuilder): Self = StObject.set(x, "setRelayUrl", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetSelectableMimeTypes(value: String => PickerBuilder): Self = StObject.set(x, "setSelectableMimeTypes", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetSize(value: (Double, Double) => PickerBuilder): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSetTitle(value: String => PickerBuilder): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetUploadToAlbumId(value: String => PickerBuilder): Self = StObject.set(x, "setUploadToAlbumId", js.Any.fromFunction1(value))
        
        @scala.inline
        def setToUri(value: () => String): Self = StObject.set(x, "toUri", js.Any.fromFunction0(value))
      }
    }
  }
}
