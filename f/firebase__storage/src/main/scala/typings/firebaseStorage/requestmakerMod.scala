package typings.firebaseStorage

import typings.firebaseStorage.requestMod.Request
import typings.firebaseStorage.requestinfoMod.RequestInfo
import typings.firebaseStorage.xhriopoolMod.XhrIoPool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestmakerMod {
  
  type requestMaker = js.Function4[
    /* requestInfo */ RequestInfo[js.Any], 
    /* appId */ String | Null, 
    /* authToken */ String | Null, 
    /* pool */ XhrIoPool, 
    Request[js.Any]
  ]
}
