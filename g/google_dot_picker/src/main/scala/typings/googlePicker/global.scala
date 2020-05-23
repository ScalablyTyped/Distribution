package typings.googlePicker

import typings.googlePicker.google.picker.Picker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object google extends js.Object {
    @js.native
    object picker extends js.Object {
      @js.native
      class DocsUploadView ()
        extends typings.googlePicker.google.picker.DocsUploadView {
        // Allows the user to select a folder in Google Drive to upload to.
        /* CompleteClass */
        override def setIncludeFolders(included: Boolean): typings.googlePicker.google.picker.DocsUploadView = js.native
        // Sets the upload destination to the specified folder. This overrides ".setIncludeFolders" to false.
        /* CompleteClass */
        override def setParent(parentId: String): typings.googlePicker.google.picker.DocsUploadView = js.native
      }
      
      @js.native
      // Constructor. The ViewId must be one of the Google Drive views. Default is ViewId.DOCS.
      class DocsView ()
        extends typings.googlePicker.google.picker.DocsView {
        def this(viewId: String) = this()
      }
      
      @js.native
      class PickerBuilder ()
        extends typings.googlePicker.google.picker.PickerBuilder {
        // Add a View to the navigation pane.
        /* CompleteClass */
        override def addView(viewOrId: js.Any): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Add a ViewGroup to the top-level navigation pane.
        /* CompleteClass */
        override def addViewGroup(viewGroup: js.Any): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Construct the Picker object. The Picker object is returned.
        /* CompleteClass */
        override def build(): Picker = js.native
        // Disable a picker feature.
        /* CompleteClass */
        override def disableFeature(feature: String): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Enable a picker feature.
        /* CompleteClass */
        override def enableFeature(feature: String): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Get the relay URL, used for gadgets.rpc.
        /* CompleteClass */
        override def getRelayUrl(): String = js.native
        // Get the dialog title.
        /* CompleteClass */
        override def getTitle(): String = js.native
        // Disable the title bar from being shown. To re-enable, call setTitle with a non-empty title or undefined.
        /* CompleteClass */
        override def hideTitleBar(): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Check if a picker Feature is enabled.
        /* CompleteClass */
        override def isFeatureEnabled(feature: String): Boolean = js.native
        // Sets the Google Drive App ID needed to allow application to access the user's files via the Google Drive API.
        /* CompleteClass */
        override def setAppId(appId: String): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Set the callback method called when the user picks and item (or items), or cancels. The callback method receives a single callback object. The structure of the callback object is described in the JSON Guide.
        /* CompleteClass */
        override def setCallback(method: js.Function): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Sets the Browser API key obtained from Google Developers Console. See the Developer's Guide for details on how to obtain the Browser API key.
        /* CompleteClass */
        override def setDeveloperKey(key: String): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Set the document.
        /* CompleteClass */
        override def setDocument(document: String): typings.googlePicker.google.picker.PickerBuilder = js.native
        // ISO 639 language code. If the language is not supported, en-US is used. This method provides an alternative to setting the locale at google.load() time. See the Developer's Guide for a list of supported locales.
        /* CompleteClass */
        override def setLocale(locale: String): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Sets the maximum number of items a user can pick.
        /* CompleteClass */
        override def setMaxItems(max: Double): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Sets an OAuth token to use for authenticating the current user. Depending on the scope of the token, only certain views will display data. Valid scopes are Google Docs, Drive, Photos, YouTube.
        /* CompleteClass */
        override def setOAuthToken(token: String): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Sets the origin of picker dialog. The origin should be set to the window.location.protocol + '//' + window.location.host of the top-most page, if your application is running in an iframe.
        /* CompleteClass */
        override def setOrigin(origin: String): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Set the relay URL, used for gadgets.rpc.
        /* CompleteClass */
        override def setRelayUrl(url: String): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Set the list of MIME types which will be selectable. Use commas to separate MIME types if more than one is required.
        /* CompleteClass */
        override def setSelectableMimeTypes(`type`: String): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Set the preferred dialog size. The dialog will be auto-centered. It has a minimum size of (566,350) and a maximum size of (1051,650).
        /* CompleteClass */
        override def setSize(width: Double, height: Double): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Set the dialog title.
        /* CompleteClass */
        override def setTitle(title: String): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Specify an album ID for photo uploads. See Picasa Web Albums Data API documentation for more information about albums.
        /* CompleteClass */
        override def setUploadToAlbumId(albumId: String): typings.googlePicker.google.picker.PickerBuilder = js.native
        // Returns the URI generated by this builder.
        /* CompleteClass */
        override def toUri(): String = js.native
      }
      
      @js.native
      object Action extends js.Object {
        var CANCEL: String = js.native
        var PICKED: String = js.native
      }
      
      @js.native
      object DocsViewMode extends js.Object {
        // Display documents in a thumbnail grid.
        var GRID: String = js.native
        // Display documents in a detailed list.
        var LIST: String = js.native
      }
      
      @js.native
      object Document extends js.Object {
        var ADDRESS_LINES: String = js.native
        var AUDIENCE: String = js.native
        var DESCRIPTION: String = js.native
        var DURATION: String = js.native
        var EMBEDDABLE_URL: String = js.native
        var ICON_URL: String = js.native
        var ID: String = js.native
        var IS_NEW: String = js.native
        var LAST_EDITED_UTC: String = js.native
        var LATITUDE: String = js.native
        var LONGITUDE: String = js.native
        var MIME_TYPE: String = js.native
        var NAME: String = js.native
        var NUM_CHILDREN: String = js.native
        var PARENT_ID: String = js.native
        var PHONE_NUMBERS: String = js.native
        var SERVICE_ID: String = js.native
        var THUMBNAILS: String = js.native
        var TYPE: String = js.native
        var URL: String = js.native
      }
      
      @js.native
      object Feature extends js.Object {
        // Show only documents owned by the user when showing items from Google Drive.
        var MINE_ONLY: String = js.native
        // Allow user to choose more than one item.
        var MULTISELECT_ENABLED: String = js.native
        // Hide the navigation pane. If the navigation pane is hidden, users can only select from the first view chosen.
        var NAV_HIDDEN: String = js.native
        // For photo uploads, controls whether per-photo selection (as opposed to per-album) selection is enabled.
        var SIMPLE_UPLOAD_ENABLED: String = js.native
        // Whether Team Drive items should be included in results.
        var SUPPORT_TEAM_DRIVES: String = js.native
      }
      
      @js.native
      object Response extends js.Object {
        var ACTION: String = js.native
        var DOCUMENTS: String = js.native
        var PARENTS: String = js.native
        var VIEW: String = js.native
      }
      
      @js.native
      object Type extends js.Object {
        var ALBUM: String = js.native
        var DOCUMENT: String = js.native
        var LOCATION: String = js.native
        var PHOTO: String = js.native
        var URL: String = js.native
        var VIDEO: String = js.native
      }
      
      @js.native
      object ViewId extends js.Object {
        var DOCS: String = js.native
        var DOCS_IMAGES: String = js.native
        var DOCS_IMAGES_AND_VIDEOS: String = js.native
        var DOCS_VIDEOS: String = js.native
        var DOCUMENTS: String = js.native
        var DRAWINGS: String = js.native
        var FOLDERS: String = js.native
        var FORMS: String = js.native
        var IMAGE_SEARCH: String = js.native
        var MAPS: String = js.native
        var PDFS: String = js.native
        var PHOTOS: String = js.native
        var PHOTO_ALBUMS: String = js.native
        var PHOTO_UPLOAD: String = js.native
        var PRESENTATIONS: String = js.native
        var RECENTLY_PICKED: String = js.native
        var SPREADSHEETS: String = js.native
        var VIDEO_SEARCH: String = js.native
        var WEBCAM: String = js.native
        var YOUTUBE: String = js.native
      }
      
    }
    
  }
  
}

