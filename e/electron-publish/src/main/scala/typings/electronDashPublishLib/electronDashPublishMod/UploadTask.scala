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

