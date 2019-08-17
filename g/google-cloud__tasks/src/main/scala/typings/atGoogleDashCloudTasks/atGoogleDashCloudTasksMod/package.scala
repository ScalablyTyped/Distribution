package typings.atGoogleDashCloudTasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atGoogleDashCloudTasksMod {
  import typings.std.Error
  import typings.std.Partial
  import typings.std.Pick
  import typings.std.Required

  type APICallback[T] = js.Function2[/* err */ GoogleError | Null, /* response */ js.UndefOr[T], Unit]
  type APIPaginatedCallback[T, U, V] = js.Function4[
    /* err */ GoogleError | Null, 
    /* response */ js.UndefOr[T], 
    /* next */ js.UndefOr[U | Null], 
    /* rawResponse */ js.UndefOr[V], 
    Unit
  ]
  type CallOptions = js.Any
  type CreateNamedRequest[N /* <: String */, T] = ParentRequest with typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksStrings.CreateNamedRequest with js.Any
  type EnhancedPick[T, Req /* <: String */, Opt /* <: String */] = (Required[Pick[T, Req]]) with (Partial[Pick[T, Req]])
  type GoogleAuth = js.Any
  type GoogleAuthOptions = js.Any
  type GoogleError = js.Any
  type Keys[T] = String
  type ProjectIdCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* projectId */ js.UndefOr[String | Null], Unit]
  type UpdateNamedRequest[N /* <: String */, T] = ParentRequest with typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksStrings.UpdateNamedRequest with js.Any
}
