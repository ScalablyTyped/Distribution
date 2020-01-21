package typings.electronPublish.mod

import typings.builderUtil.archMod.Arch
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadTask extends js.Object {
  var arch: Arch | Null
  var file: String
  var fileContent: js.UndefOr[Buffer | Null] = js.undefined
  var safeArtifactName: js.UndefOr[String | Null] = js.undefined
}

object UploadTask {
  @scala.inline
  def apply(file: String, arch: Arch = null, fileContent: Buffer = null, safeArtifactName: String = null): UploadTask = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (arch != null) __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    if (fileContent != null) __obj.updateDynamic("fileContent")(fileContent.asInstanceOf[js.Any])
    if (safeArtifactName != null) __obj.updateDynamic("safeArtifactName")(safeArtifactName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadTask]
  }
}

