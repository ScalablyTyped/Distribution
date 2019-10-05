package typings.dropboxjs.Dropbox.File

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatOptions extends js.Object {
  var contentHash: String
  var deleted: Boolean
  var hash: String
  var httpCache: Boolean
  var readDir: Boolean
  var removed: Boolean
  var rev: String
  var version: Double
  var versionTag: String
}

object StatOptions {
  @scala.inline
  def apply(
    contentHash: String,
    deleted: Boolean,
    hash: String,
    httpCache: Boolean,
    readDir: Boolean,
    removed: Boolean,
    rev: String,
    version: Double,
    versionTag: String
  ): StatOptions = {
    val __obj = js.Dynamic.literal(contentHash = contentHash, deleted = deleted, hash = hash, httpCache = httpCache, readDir = readDir, removed = removed, rev = rev, version = version, versionTag = versionTag)
  
    __obj.asInstanceOf[StatOptions]
  }
}

