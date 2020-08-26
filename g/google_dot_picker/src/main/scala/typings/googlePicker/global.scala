package typings.googlePicker

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
        extends typings.googlePicker.google.picker.DocsUploadView
      
      @js.native
      // Constructor. The ViewId must be one of the Google Drive views. Default is ViewId.DOCS.
      class DocsView ()
        extends typings.googlePicker.google.picker.DocsView {
        def this(viewId: String) = this()
      }
      
      @js.native
      class PickerBuilder ()
        extends typings.googlePicker.google.picker.PickerBuilder
      
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

