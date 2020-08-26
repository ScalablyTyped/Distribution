package typings.dropboxjs.Dropbox.File

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stat extends js.Object {
  var clientModifiedAt: Date = js.native
  var contentHash: String = js.native
  var hasThumbnail: Boolean = js.native
  var humanSize: String = js.native
  var inAppFolder: Boolean = js.native
  var isFile: Boolean = js.native
  var isFolder: Boolean = js.native
  var isRemoved: Boolean = js.native
  var mimeType: String = js.native
  var modifiedAt: Date = js.native
  var name: String = js.native
  var path: String = js.native
  var size: Double = js.native
  var typeIcon: String = js.native
  var versionTag: String = js.native
  def toJSON(): js.Object = js.native
}

object Stat {
  @scala.inline
  def apply(
    clientModifiedAt: Date,
    contentHash: String,
    hasThumbnail: Boolean,
    humanSize: String,
    inAppFolder: Boolean,
    isFile: Boolean,
    isFolder: Boolean,
    isRemoved: Boolean,
    mimeType: String,
    modifiedAt: Date,
    name: String,
    path: String,
    size: Double,
    toJSON: () => js.Object,
    typeIcon: String,
    versionTag: String
  ): Stat = {
    val __obj = js.Dynamic.literal(clientModifiedAt = clientModifiedAt.asInstanceOf[js.Any], contentHash = contentHash.asInstanceOf[js.Any], hasThumbnail = hasThumbnail.asInstanceOf[js.Any], humanSize = humanSize.asInstanceOf[js.Any], inAppFolder = inAppFolder.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], isRemoved = isRemoved.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], modifiedAt = modifiedAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), typeIcon = typeIcon.asInstanceOf[js.Any], versionTag = versionTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
  @scala.inline
  implicit class StatOps[Self <: Stat] (val x: Self) extends AnyVal {
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
    def setClientModifiedAt(value: Date): Self = this.set("clientModifiedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentHash(value: String): Self = this.set("contentHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasThumbnail(value: Boolean): Self = this.set("hasThumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def setHumanSize(value: String): Self = this.set("humanSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setInAppFolder(value: Boolean): Self = this.set("inAppFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFile(value: Boolean): Self = this.set("isFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFolder(value: Boolean): Self = this.set("isFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRemoved(value: Boolean): Self = this.set("isRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedAt(value: Date): Self = this.set("modifiedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Object): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setTypeIcon(value: String): Self = this.set("typeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionTag(value: String): Self = this.set("versionTag", value.asInstanceOf[js.Any])
  }
  
}

