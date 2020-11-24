package typings.dropboxChooser.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooserFile extends js.Object {
  
  // Size of the file in bytes.
  var bytes: Double = js.native
  
  // URL to a 64x64px icon for the file based on the file's extension.
  var icon: String = js.native
  
  // Unique ID for the file, compatible with Dropbox API v2.
  var id: String = js.native
  
  // whether or not the file is actually a directory
  var isDir: Boolean = js.native
  
  // URL to access the file, which varies depending on the linkType specified when the
  // Chooser was triggered.
  var link: String = js.native
  
  // Name of the file.
  var name: String = js.native
  
  // A thumbnail URL generated when the user selects images and videos.
  // If the user didn't select an image or video, no thumbnail will be included.
  var thumbnailLink: js.UndefOr[String] = js.native
}
object ChooserFile {
  
  @scala.inline
  def apply(bytes: Double, icon: String, id: String, isDir: Boolean, link: String, name: String): ChooserFile = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooserFile]
  }
  
  @scala.inline
  implicit class ChooserFileOps[Self <: ChooserFile] (val x: Self) extends AnyVal {
    
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
    def setBytes(value: Double): Self = this.set("bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDir(value: Boolean): Self = this.set("isDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailLink(value: String): Self = this.set("thumbnailLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnailLink: Self = this.set("thumbnailLink", js.undefined)
  }
}
