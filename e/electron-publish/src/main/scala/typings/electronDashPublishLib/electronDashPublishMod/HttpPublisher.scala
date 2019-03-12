package typings
package electronDashPublishLib.electronDashPublishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-publish", "HttpPublisher")
@js.native
abstract class HttpPublisher protected () extends Publisher {
  def this(context: PublishContext) = this()
  def this(context: PublishContext, useSafeArtifactName: scala.Boolean) = this()
  val useSafeArtifactName: js.Any = js.native
  /* protected */ def doUpload(
    fileName: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    dataLength: scala.Double,
    requestProcessor: js.Function2[
      /* request */ nodeLib.httpMod.ClientRequest, 
      /* reject */ js.Function1[/* error */ stdLib.Error, scala.Unit], 
      scala.Unit
    ]
  ): js.Promise[_] = js.native
  /* protected */ def doUpload(
    fileName: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    dataLength: scala.Double,
    requestProcessor: js.Function2[
      /* request */ nodeLib.httpMod.ClientRequest, 
      /* reject */ js.Function1[/* error */ stdLib.Error, scala.Unit], 
      scala.Unit
    ],
    file: java.lang.String
  ): js.Promise[_] = js.native
}

