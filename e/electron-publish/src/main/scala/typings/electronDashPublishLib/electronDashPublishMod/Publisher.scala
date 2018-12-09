package typings
package electronDashPublishLib.electronDashPublishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-publish", "Publisher")
@js.native
abstract class Publisher protected () extends js.Object {
  protected def this(context: PublishContext) = this()
  val context: PublishContext = js.native
  val providerName: java.lang.String = js.native
  /* protected */ def createProgressBar(fileName: java.lang.String, size: scala.Double): electronDashPublishLib.outProgressMod.ProgressBar | scala.Null = js.native
  /* protected */ def createReadStreamAndProgressBar(
    file: java.lang.String,
    fileStat: fsDashExtraDashPLib.fsDashExtraDashPMod.Stats,
    progressBar: electronDashPublishLib.outProgressMod.ProgressBar,
    reject: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): nodeLib.NodeJSNs.ReadableStream = js.native
  /* protected */ def createReadStreamAndProgressBar(
    file: java.lang.String,
    fileStat: fsDashExtraDashPLib.fsDashExtraDashPMod.Stats,
    progressBar: scala.Null,
    reject: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): nodeLib.NodeJSNs.ReadableStream = js.native
  def upload(task: UploadTask): js.Promise[_] = js.native
}

