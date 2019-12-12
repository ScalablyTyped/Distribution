package typings.atFirebaseStorage

import typings.atFirebaseStorage.distSrcImplementationRequestMod.Request
import typings.atFirebaseStorage.distSrcImplementationRequestinfoMod.RequestInfo
import typings.atFirebaseStorage.distSrcImplementationXhriopoolMod.XhrIoPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/requestmaker", JSImport.Namespace)
@js.native
object distSrcImplementationRequestmakerMod extends js.Object {
  type requestMaker = js.Function3[
    /* requestInfo */ RequestInfo[js.Any], 
    /* authToken */ String | Null, 
    /* pool */ XhrIoPool, 
    Request[js.Any]
  ]
}

