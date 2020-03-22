package typings.fileEntryCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-entry-cache", "createFromFile")
@js.native
object createFromFile extends js.Object {
  def apply(pathToCache: String): FileEntryCache = js.native
  def apply(pathToCache: String, useCheckSum: Boolean): FileEntryCache = js.native
}

