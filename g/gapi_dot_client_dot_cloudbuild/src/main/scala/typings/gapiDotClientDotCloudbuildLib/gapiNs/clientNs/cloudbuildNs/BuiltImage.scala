package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltImage extends js.Object {
  /** Docker Registry 2.0 digest. */
  var digest: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name used to push the container image to Google Container Registry, as
    * presented to `docker push`.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object BuiltImage {
  @scala.inline
  def apply(digest: java.lang.String = null, name: java.lang.String = null): BuiltImage = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BuiltImage]
  }
}

