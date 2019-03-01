package typings
package electronDashPublishLib.electronDashPublishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadTask extends js.Object {
  var arch: builderDashUtilLib.outArchMod.Arch | scala.Null
  var file: java.lang.String
  var fileContent: js.UndefOr[nodeLib.Buffer | scala.Null] = js.undefined
  var safeArtifactName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object UploadTask {
  @scala.inline
  def apply(
    file: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch = null,
    fileContent: nodeLib.Buffer = null,
    safeArtifactName: java.lang.String = null
  ): UploadTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    if (arch != null) __obj.updateDynamic("arch")(arch)
    if (fileContent != null) __obj.updateDynamic("fileContent")(fileContent)
    if (safeArtifactName != null) __obj.updateDynamic("safeArtifactName")(safeArtifactName)
    __obj.asInstanceOf[UploadTask]
  }
}

