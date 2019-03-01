package typings
package forgeDashApisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateTime extends js.Object {
  var createTime: java.lang.String
  var createUserId: java.lang.String
  var displayName: java.lang.String
  var extension: js.Object
  var fileType: java.lang.String
  var lastModifiedTime: java.lang.String
  var lastModifiedUserId: java.lang.String
  var mimeType: java.lang.String
  var name: java.lang.String
  var storageSize: scala.Double
  var versionNumber: scala.Double
}

object Anon_CreateTime {
  @scala.inline
  def apply(
    createTime: java.lang.String,
    createUserId: java.lang.String,
    displayName: java.lang.String,
    extension: js.Object,
    fileType: java.lang.String,
    lastModifiedTime: java.lang.String,
    lastModifiedUserId: java.lang.String,
    mimeType: java.lang.String,
    name: java.lang.String,
    storageSize: scala.Double,
    versionNumber: scala.Double
  ): Anon_CreateTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createTime")(createTime)
    __obj.updateDynamic("createUserId")(createUserId)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("extension")(extension)
    __obj.updateDynamic("fileType")(fileType)
    __obj.updateDynamic("lastModifiedTime")(lastModifiedTime)
    __obj.updateDynamic("lastModifiedUserId")(lastModifiedUserId)
    __obj.updateDynamic("mimeType")(mimeType)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("storageSize")(storageSize)
    __obj.updateDynamic("versionNumber")(versionNumber)
    __obj.asInstanceOf[Anon_CreateTime]
  }
}

