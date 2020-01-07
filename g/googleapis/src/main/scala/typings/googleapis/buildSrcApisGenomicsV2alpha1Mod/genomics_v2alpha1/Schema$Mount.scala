package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Carries information about a particular disk mount inside a container.
  */
@js.native
trait Schema$Mount extends js.Object {
  /**
    * The name of the disk to mount, as specified in the resources section.
    */
  var disk: js.UndefOr[String] = js.native
  /**
    * The path to mount the disk inside the container.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * If true, the disk is mounted read-only inside the container.
    */
  var readOnly: js.UndefOr[Boolean] = js.native
}

object Schema$Mount {
  @scala.inline
  def apply(disk: String = null, path: String = null, readOnly: js.UndefOr[Boolean] = js.undefined): Schema$Mount = {
    val __obj = js.Dynamic.literal()
    if (disk != null) __obj.updateDynamic("disk")(disk.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Mount]
  }
}

