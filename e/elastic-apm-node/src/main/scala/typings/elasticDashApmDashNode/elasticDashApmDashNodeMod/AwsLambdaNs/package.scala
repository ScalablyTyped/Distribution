package typings.elasticDashApmDashNode.elasticDashApmDashNodeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AwsLambdaNs {
  type Callback[TResult] = js.Function2[
    /* error */ js.UndefOr[Error | Null | String], 
    /* result */ js.UndefOr[TResult], 
    Unit
  ]
  type Handler[TEvent, TResult] = js.Function3[
    /* event */ TEvent, 
    /* context */ Context, 
    /* callback */ Callback[TResult], 
    Unit | js.Promise[TResult]
  ]
}
