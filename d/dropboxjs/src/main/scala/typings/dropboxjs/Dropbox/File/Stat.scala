package typings.dropboxjs.Dropbox.File

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
  var clientModifiedAt: Date
  var contentHash: String
  var hasThumbnail: Boolean
  var humanSize: String
  var inAppFolder: Boolean
  var isFile: Boolean
  var isFolder: Boolean
  var isRemoved: Boolean
  var mimeType: String
  var modifiedAt: Date
  var name: String
  var path: String
  var size: Double
  var typeIcon: String
  var versionTag: String
  def toJSON(): js.Object
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
}

