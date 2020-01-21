package typings.firebaseStorage

import typings.firebaseStorage.requestMod.Request
import typings.firebaseStorage.requestinfoMod.RequestInfo
import typings.firebaseStorage.xhriopoolMod.XhrIoPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/requestmaker", JSImport.Namespace)
@js.native
object requestmakerMod extends js.Object {
  type requestMaker = js.Function3[
    /* requestInfo */ RequestInfo[js.Any], 
    /* authToken */ String | Null, 
    /* pool */ XhrIoPool, 
    Request[js.Any]
  ]
}

