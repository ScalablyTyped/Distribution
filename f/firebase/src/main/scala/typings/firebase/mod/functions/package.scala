package typings.firebase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object functions {
  type HttpsCallable = js.Function1[
    /* data */ js.UndefOr[js.Any], 
    js.Promise[typings.firebase.mod.functions.HttpsCallableResult]
  ]
}
