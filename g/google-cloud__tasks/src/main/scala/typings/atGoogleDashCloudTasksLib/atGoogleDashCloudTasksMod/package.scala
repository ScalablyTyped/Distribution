package typings
package atGoogleDashCloudTasksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atGoogleDashCloudTasksMod {
  type APICallback[T] = js.Function2[/* err */ GoogleError | scala.Null, /* response */ js.UndefOr[T], scala.Unit]
  type APIPaginatedCallback[T, U, V] = js.Function4[
    /* err */ GoogleError | scala.Null, 
    /* response */ js.UndefOr[T], 
    /* next */ js.UndefOr[U | scala.Null], 
    /* rawResponse */ js.UndefOr[V], 
    scala.Unit
  ]
  type CallOptions = js.Any
  type CreateNamedRequest[N /* <: java.lang.String */, T] = ParentRequest with atGoogleDashCloudTasksLib.atGoogleDashCloudTasksLibStrings.CreateNamedRequest with js.Any
  type EnhancedPick[T, Req /* <: java.lang.String */, Opt /* <: java.lang.String */] = (stdLib.Required[stdLib.Pick[T, Req]]) with (stdLib.Partial[stdLib.Pick[T, Req]])
  type GoogleAuth = js.Any
  type GoogleAuthOptions = js.Any
  type GoogleError = js.Any
  type Keys[T] = java.lang.String
  type ProjectIdCallback = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* projectId */ js.UndefOr[java.lang.String | scala.Null], 
    scala.Unit
  ]
  type UpdateNamedRequest[N /* <: java.lang.String */, T] = ParentRequest with atGoogleDashCloudTasksLib.atGoogleDashCloudTasksLibStrings.UpdateNamedRequest with js.Any
}
