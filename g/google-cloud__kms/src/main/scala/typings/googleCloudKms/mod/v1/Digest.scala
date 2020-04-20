package typings.googleCloudKms.mod.v1

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Digest extends js.Object {
  var sha256: js.UndefOr[Buffer] = js.undefined
  var sha384: js.UndefOr[Buffer] = js.undefined
  var sha512: js.UndefOr[Buffer] = js.undefined
}

object Digest {
  @scala.inline
  def apply(sha256: Buffer = null, sha384: Buffer = null, sha512: Buffer = null): Digest = {
    val __obj = js.Dynamic.literal()
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    if (sha384 != null) __obj.updateDynamic("sha384")(sha384.asInstanceOf[js.Any])
    if (sha512 != null) __obj.updateDynamic("sha512")(sha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digest]
  }
}

