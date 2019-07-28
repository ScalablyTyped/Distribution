package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateTime extends js.Object {
  var createTime: String
  var createUserId: String
  var displayName: String
  var extension: js.Object
  var fileType: String
  var lastModifiedTime: String
  var lastModifiedUserId: String
  var mimeType: String
  var name: String
  var storageSize: Double
  var versionNumber: Double
}

object Anon_CreateTime {
  @scala.inline
  def apply(
    createTime: String,
    createUserId: String,
    displayName: String,
    extension: js.Object,
    fileType: String,
    lastModifiedTime: String,
    lastModifiedUserId: String,
    mimeType: String,
    name: String,
    storageSize: Double,
    versionNumber: Double
  ): Anon_CreateTime = {
    val __obj = js.Dynamic.literal(createTime = createTime, createUserId = createUserId, displayName = displayName, extension = extension, fileType = fileType, lastModifiedTime = lastModifiedTime, lastModifiedUserId = lastModifiedUserId, mimeType = mimeType, name = name, storageSize = storageSize, versionNumber = versionNumber)
  
    __obj.asInstanceOf[Anon_CreateTime]
  }
}

