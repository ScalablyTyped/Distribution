package typings.firebaseFunctionsTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HttpsCallable = js.Function1[
    /* data */ js.UndefOr[js.Object | scala.Null], 
    js.Promise[typings.firebaseFunctionsTypes.mod.HttpsCallableResult]
  ]
}
