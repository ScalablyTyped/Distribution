package typings.electronDashPublish.electronDashPublishMod

import typings.builderDashUtil.outArchMod.Arch
import typings.node.httpMod.ClientRequest
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-publish", "HttpPublisher")
@js.native
abstract class HttpPublisher protected () extends Publisher {
  def this(context: PublishContext) = this()
  def this(context: PublishContext, useSafeArtifactName: Boolean) = this()
  val useSafeArtifactName: js.Any = js.native
  /* protected */ def doUpload(
    fileName: String,
    arch: Arch,
    dataLength: Double,
    requestProcessor: js.Function2[
      /* request */ ClientRequest, 
      /* reject */ js.Function1[/* error */ Error, Unit], 
      Unit
    ]
  ): js.Promise[_] = js.native
  /* protected */ def doUpload(
    fileName: String,
    arch: Arch,
    dataLength: Double,
    requestProcessor: js.Function2[
      /* request */ ClientRequest, 
      /* reject */ js.Function1[/* error */ Error, Unit], 
      Unit
    ],
    file: String
  ): js.Promise[_] = js.native
}

