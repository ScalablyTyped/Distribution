package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results extends js.Object {
  /** List of build step digests, in order corresponding to build step indices. */
  var buildStepImages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Images that were built as a part of the build. */
  var images: js.UndefOr[js.Array[BuiltImage]] = js.undefined
}

