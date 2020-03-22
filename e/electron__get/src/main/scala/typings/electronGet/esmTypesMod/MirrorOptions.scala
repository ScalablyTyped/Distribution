package typings.electronGet.esmTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MirrorOptions extends js.Object {
  var customDir: js.UndefOr[String] = js.undefined
  var customFilename: js.UndefOr[String] = js.undefined
  var mirror: js.UndefOr[String] = js.undefined
  /**
    * The Electron nightly-specific mirror URL.
    */
  var nightly_mirror: js.UndefOr[String] = js.undefined
}

object MirrorOptions {
  @scala.inline
  def apply(
    customDir: String = null,
    customFilename: String = null,
    mirror: String = null,
    nightly_mirror: String = null
  ): MirrorOptions = {
    val __obj = js.Dynamic.literal()
    if (customDir != null) __obj.updateDynamic("customDir")(customDir.asInstanceOf[js.Any])
    if (customFilename != null) __obj.updateDynamic("customFilename")(customFilename.asInstanceOf[js.Any])
    if (mirror != null) __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    if (nightly_mirror != null) __obj.updateDynamic("nightly_mirror")(nightly_mirror.asInstanceOf[js.Any])
    __obj.asInstanceOf[MirrorOptions]
  }
}

