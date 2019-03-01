package typings
package dropboxjsLib.DropboxNs.FileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatOptions extends js.Object {
  var contentHash: java.lang.String
  var deleted: scala.Boolean
  var hash: java.lang.String
  var httpCache: scala.Boolean
  var readDir: scala.Boolean
  var removed: scala.Boolean
  var rev: java.lang.String
  var version: scala.Double
  var versionTag: java.lang.String
}

object StatOptions {
  @scala.inline
  def apply(
    contentHash: java.lang.String,
    deleted: scala.Boolean,
    hash: java.lang.String,
    httpCache: scala.Boolean,
    readDir: scala.Boolean,
    removed: scala.Boolean,
    rev: java.lang.String,
    version: scala.Double,
    versionTag: java.lang.String
  ): StatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentHash")(contentHash)
    __obj.updateDynamic("deleted")(deleted)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("httpCache")(httpCache)
    __obj.updateDynamic("readDir")(readDir)
    __obj.updateDynamic("removed")(removed)
    __obj.updateDynamic("rev")(rev)
    __obj.updateDynamic("version")(version)
    __obj.updateDynamic("versionTag")(versionTag)
    __obj.asInstanceOf[StatOptions]
  }
}

