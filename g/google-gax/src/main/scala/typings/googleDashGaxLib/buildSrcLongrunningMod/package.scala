package typings
package googleDashGaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcLongrunningMod {
  type AnyDecoder = js.Function1[/* message */ js.Object, googleDashGaxLib.buildSrcGrpcMod.Metadata]
  type GetOperationCallback = js.Function4[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* result */ js.UndefOr[js.Object], 
    /* metadata */ js.UndefOr[js.Object], 
    /* rawResponse */ js.UndefOr[Operation], 
    scala.Unit
  ]
}
