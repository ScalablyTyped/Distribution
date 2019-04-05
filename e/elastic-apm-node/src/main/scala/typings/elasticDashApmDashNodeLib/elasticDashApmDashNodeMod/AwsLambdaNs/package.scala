package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AwsLambdaNs {
  type Callback[TResult] = js.Function2[
    /* error */ js.UndefOr[stdLib.Error | scala.Null | java.lang.String], 
    /* result */ js.UndefOr[TResult], 
    scala.Unit
  ]
  type Handler[TEvent, TResult] = js.Function3[
    /* event */ TEvent, 
    /* context */ Context, 
    /* callback */ Callback[TResult], 
    scala.Unit | js.Promise[TResult]
  ]
}
