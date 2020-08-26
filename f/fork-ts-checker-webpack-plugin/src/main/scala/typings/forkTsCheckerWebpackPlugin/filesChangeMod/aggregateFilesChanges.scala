package typings.forkTsCheckerWebpackPlugin.filesChangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/reporter/FilesChange", "aggregateFilesChanges")
@js.native
object aggregateFilesChanges extends js.Object {
  /**
    * Computes aggregated files change based on the subsequent files changes.
    *
    * @param changes List of subsequent files changes
    * @returns Files change that represents all subsequent changes as a one event
    */
  def apply(changes: js.Array[FilesChange]): FilesChange = js.native
}

