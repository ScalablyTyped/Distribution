package typings.fileEntryCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyzedFilesInfo extends js.Object {
  val changedFiles: js.Array[String]
  val notChangedFiles: js.Array[String]
  val notFoundFiles: js.Array[String]
}

object AnalyzedFilesInfo {
  @scala.inline
  def apply(changedFiles: js.Array[String], notChangedFiles: js.Array[String], notFoundFiles: js.Array[String]): AnalyzedFilesInfo = {
    val __obj = js.Dynamic.literal(changedFiles = changedFiles.asInstanceOf[js.Any], notChangedFiles = notChangedFiles.asInstanceOf[js.Any], notFoundFiles = notFoundFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedFilesInfo]
  }
}

