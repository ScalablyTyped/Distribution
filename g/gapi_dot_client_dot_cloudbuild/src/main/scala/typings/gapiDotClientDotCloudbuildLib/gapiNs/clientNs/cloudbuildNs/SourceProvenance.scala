package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceProvenance extends js.Object {
  /**
    * Hash(es) of the build source, which can be used to verify that the original
    * source integrity was maintained in the build. Note that FileHashes will
    * only be populated if BuildOptions has requested a SourceProvenanceHash.
    *
    * The keys to this map are file paths used as build source and the values
    * contain the hash values for those files.
    *
    * If the build source came in a single package such as a gzipped tarfile
    * (.tar.gz), the FileHash will be for the single path to that file.
    * @OutputOnly
    */
  var fileHashes: js.UndefOr[stdLib.Record[java.lang.String, FileHashes]] = js.undefined
  /**
    * A copy of the build's source.repo_source, if exists, with any
    * revisions resolved.
    */
  var resolvedRepoSource: js.UndefOr[RepoSource] = js.undefined
  /**
    * A copy of the build's source.storage_source, if exists, with any
    * generations resolved.
    */
  var resolvedStorageSource: js.UndefOr[StorageSource] = js.undefined
}

