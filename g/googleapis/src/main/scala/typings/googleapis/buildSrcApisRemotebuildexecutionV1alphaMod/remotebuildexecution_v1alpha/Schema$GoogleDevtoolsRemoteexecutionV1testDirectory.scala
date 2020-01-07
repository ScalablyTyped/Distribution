package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Directory` represents a directory node in a file tree, containing zero
  * or more children FileNodes and DirectoryNodes. Each `Node` contains its
  * name in the directory, the digest of its content (either a file blob or a
  * `Directory` proto), as well as possibly some metadata about the file or
  * directory.  In order to ensure that two equivalent directory trees hash to
  * the same value, the following restrictions MUST be obeyed when constructing
  * a a `Directory`:   - Every child in the directory must have a path of
  * exactly one segment.     Multiple levels of directory hierarchy may not be
  * collapsed.   - Each child in the directory must have a unique path segment
  * (file name).   - The files and directories in the directory must each be
  * sorted in     lexicographical order by path. The path strings must be
  * sorted by code     point, equivalently, by UTF-8 bytes.  A `Directory` that
  * obeys the restrictions is said to be in canonical form.  As an example, the
  * following could be used for a file named `bar` and a directory named `foo`
  * with an executable file named `baz` (hashes shortened for readability):
  * ```json // (Directory proto) {   files: [     {       name:
  * &quot;bar&quot;,       digest: {         hash: &quot;4a73bc9d03...&quot;,
  * size: 65534       }     }   ],   directories: [     {       name:
  * &quot;foo&quot;,       digest: {         hash: &quot;4cf2eda940...&quot;,
  * size: 43       }     }   ] }  // (Directory proto with hash
  * &quot;4cf2eda940...&quot; and size 43) {   files: [     {       name:
  * &quot;baz&quot;,       digest: {         hash: &quot;b2c941073e...&quot;,
  * size: 1294,       },       is_executable: true     }   ] } ```
  */
@js.native
trait Schema$GoogleDevtoolsRemoteexecutionV1testDirectory extends js.Object {
  /**
    * The subdirectories in the directory.
    */
  var directories: js.UndefOr[js.Array[Schema$GoogleDevtoolsRemoteexecutionV1testDirectoryNode]] = js.native
  /**
    * The files in the directory.
    */
  var files: js.UndefOr[js.Array[Schema$GoogleDevtoolsRemoteexecutionV1testFileNode]] = js.native
}

object Schema$GoogleDevtoolsRemoteexecutionV1testDirectory {
  @scala.inline
  def apply(
    directories: js.Array[Schema$GoogleDevtoolsRemoteexecutionV1testDirectoryNode] = null,
    files: js.Array[Schema$GoogleDevtoolsRemoteexecutionV1testFileNode] = null
  ): Schema$GoogleDevtoolsRemoteexecutionV1testDirectory = {
    val __obj = js.Dynamic.literal()
    if (directories != null) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemoteexecutionV1testDirectory]
  }
}

