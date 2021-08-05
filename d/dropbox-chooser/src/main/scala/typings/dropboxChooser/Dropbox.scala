package typings.dropboxChooser

import typings.dropboxChooser.dropboxChooserStrings.direct
import typings.dropboxChooser.dropboxChooserStrings.preview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropbox {
  
  trait Chooser extends StObject {
    
    def choose(options: ChooserOptions): Unit
  }
  object Chooser {
    
    inline def apply(choose: ChooserOptions => Unit): Chooser = {
      val __obj = js.Dynamic.literal(choose = js.Any.fromFunction1(choose))
      __obj.asInstanceOf[Chooser]
    }
    
    extension [Self <: Chooser](x: Self) {
      
      inline def setChoose(value: ChooserOptions => Unit): Self = StObject.set(x, "choose", js.Any.fromFunction1(value))
    }
  }
  
  trait ChooserFile extends StObject {
    
    // Size of the file in bytes.
    var bytes: Double
    
    // URL to a 64x64px icon for the file based on the file's extension.
    var icon: String
    
    // Unique ID for the file, compatible with Dropbox API v2.
    var id: String
    
    // whether or not the file is actually a directory
    var isDir: Boolean
    
    // URL to access the file, which varies depending on the linkType specified when the
    // Chooser was triggered.
    var link: String
    
    // Name of the file.
    var name: String
    
    // A thumbnail URL generated when the user selects images and videos.
    // If the user didn't select an image or video, no thumbnail will be included.
    var thumbnailLink: js.UndefOr[String] = js.undefined
  }
  object ChooserFile {
    
    inline def apply(bytes: Double, icon: String, id: String, isDir: Boolean, link: String, name: String): ChooserFile = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChooserFile]
    }
    
    extension [Self <: ChooserFile](x: Self) {
      
      inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsDir(value: Boolean): Self = StObject.set(x, "isDir", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setThumbnailLink(value: String): Self = StObject.set(x, "thumbnailLink", value.asInstanceOf[js.Any])
      
      inline def setThumbnailLinkUndefined: Self = StObject.set(x, "thumbnailLink", js.undefined)
    }
  }
  
  // Refer to "Handling the response" section of: https://www.dropbox.com/developers/chooser
  /* Rewritten from type alias, can be one of: 
    - typings.dropboxChooser.dropboxChooserNumbers.`75`
    - typings.dropboxChooser.dropboxChooserNumbers.`256`
    - typings.dropboxChooser.dropboxChooserNumbers.`800`
    - typings.dropboxChooser.dropboxChooserNumbers.`1280`
    - typings.dropboxChooser.dropboxChooserNumbers.`2048`
  */
  trait ChooserFileBoundingBox extends StObject
  object ChooserFileBoundingBox {
    
    inline def `1280`: typings.dropboxChooser.dropboxChooserNumbers.`1280` = 1280.asInstanceOf[typings.dropboxChooser.dropboxChooserNumbers.`1280`]
    
    inline def `2048`: typings.dropboxChooser.dropboxChooserNumbers.`2048` = 2048.asInstanceOf[typings.dropboxChooser.dropboxChooserNumbers.`2048`]
    
    inline def `256`: typings.dropboxChooser.dropboxChooserNumbers.`256` = 256.asInstanceOf[typings.dropboxChooser.dropboxChooserNumbers.`256`]
    
    inline def `75`: typings.dropboxChooser.dropboxChooserNumbers.`75` = 75.asInstanceOf[typings.dropboxChooser.dropboxChooserNumbers.`75`]
    
    inline def `800`: typings.dropboxChooser.dropboxChooserNumbers.`800` = 800.asInstanceOf[typings.dropboxChooser.dropboxChooserNumbers.`800`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dropboxChooser.dropboxChooserStrings.fit
    - typings.dropboxChooser.dropboxChooserStrings.crop
    - typings.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow
  */
  trait ChooserFileMode extends StObject
  object ChooserFileMode {
    
    inline def crop: typings.dropboxChooser.dropboxChooserStrings.crop = "crop".asInstanceOf[typings.dropboxChooser.dropboxChooserStrings.crop]
    
    inline def fit: typings.dropboxChooser.dropboxChooserStrings.fit = "fit".asInstanceOf[typings.dropboxChooser.dropboxChooserStrings.fit]
    
    inline def fit_one_and_overflow: typings.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow = "fit_one_and_overflow".asInstanceOf[typings.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow]
  }
  
  trait ChooserOptions extends StObject {
    
    // called when the user closes the dialog without selecting a file
    var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    // eg. '.png'
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    // default: false
    var folderselect: js.UndefOr[Boolean] = js.undefined
    
    // default: 'preview'
    var linkType: js.UndefOr[preview | direct] = js.undefined
    
    // default: false
    var multiselect: js.UndefOr[Boolean] = js.undefined
    
    // any positive number
    var sizeLimit: js.UndefOr[Double] = js.undefined
    
    // called when a user selects an item in the Chooser
    def success(files: js.Array[ChooserFile]): Unit
  }
  object ChooserOptions {
    
    inline def apply(success: js.Array[ChooserFile] => Unit): ChooserOptions = {
      val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
      __obj.asInstanceOf[ChooserOptions]
    }
    
    extension [Self <: ChooserOptions](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setFolderselect(value: Boolean): Self = StObject.set(x, "folderselect", value.asInstanceOf[js.Any])
      
      inline def setFolderselectUndefined: Self = StObject.set(x, "folderselect", js.undefined)
      
      inline def setLinkType(value: preview | direct): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      inline def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
      
      inline def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
      
      inline def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
      
      inline def setSizeLimit(value: Double): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
      
      inline def setSizeLimitUndefined: Self = StObject.set(x, "sizeLimit", js.undefined)
      
      inline def setSuccess(value: js.Array[ChooserFile] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    }
  }
}
