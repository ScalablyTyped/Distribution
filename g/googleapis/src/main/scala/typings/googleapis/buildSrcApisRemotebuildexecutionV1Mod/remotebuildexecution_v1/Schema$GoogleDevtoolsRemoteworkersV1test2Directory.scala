package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The contents of a directory. Similar to the equivalent message in the
  * Remote Execution API.
  */
@js.native
trait Schema$GoogleDevtoolsRemoteworkersV1test2Directory extends js.Object {
  /**
    * Any subdirectories
    */
  var directories: js.UndefOr[js.Array[Schema$GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata]] = js.native
  /**
    * The files in this directory
    */
  var files: js.UndefOr[js.Array[Schema$GoogleDevtoolsRemoteworkersV1test2FileMetadata]] = js.native
}

object Schema$GoogleDevtoolsRemoteworkersV1test2Directory {
  @scala.inline
  def apply(
    directories: js.Array[Schema$GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata] = null,
    files: js.Array[Schema$GoogleDevtoolsRemoteworkersV1test2FileMetadata] = null
  ): Schema$GoogleDevtoolsRemoteworkersV1test2Directory = {
    val __obj = js.Dynamic.literal()
    if (directories != null) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemoteworkersV1test2Directory]
  }
}

