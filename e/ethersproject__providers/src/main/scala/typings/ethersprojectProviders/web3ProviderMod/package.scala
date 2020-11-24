package typings.ethersprojectProviders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object web3ProviderMod {
  
  type JsonRpcFetchFunc = js.Function2[
    /* method */ java.lang.String, 
    /* params */ js.UndefOr[js.Array[js.Any]], 
    js.Promise[js.Any]
  ]
}
