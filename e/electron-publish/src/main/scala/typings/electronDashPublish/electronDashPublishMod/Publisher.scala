package typings.electronDashPublish.electronDashPublishMod

import typings.electronDashPublish.outProgressMod.ProgressBar
import typings.fsDashExtraDashP.fsDashExtraDashPMod.Stats
import typings.node.NodeJSNs.ReadableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-publish", "Publisher")
@js.native
abstract class Publisher protected () extends js.Object {
  protected def this(context: PublishContext) = this()
  val context: PublishContext = js.native
  val providerName: String = js.native
  /* protected */ def createProgressBar(fileName: String, size: Double): ProgressBar | Null = js.native
  /* protected */ def createReadStreamAndProgressBar(file: String, fileStat: Stats, progressBar: Null, reject: js.Function1[/* error */ Error, Unit]): ReadableStream = js.native
  /* protected */ def createReadStreamAndProgressBar(
    file: String,
    fileStat: Stats,
    progressBar: ProgressBar,
    reject: js.Function1[/* error */ Error, Unit]
  ): ReadableStream = js.native
  def upload(task: UploadTask): js.Promise[_] = js.native
}

