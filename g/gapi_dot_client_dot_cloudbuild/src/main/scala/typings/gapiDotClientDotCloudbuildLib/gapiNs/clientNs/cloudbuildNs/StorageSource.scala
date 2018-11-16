package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StorageSource extends js.Object {
  /**
               * Google Cloud Storage bucket containing source (see
               * [Bucket Name
               * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
               */
  var bucket: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Google Cloud Storage generation for the object. If the generation is
               * omitted, the latest generation will be used.
               */
  var generation: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Google Cloud Storage object containing source.
               *
               * This object must be a gzipped archive file (.tar.gz) containing source to
               * build.
               */
  var `object`: js.UndefOr[java.lang.String] = js.undefined
}

