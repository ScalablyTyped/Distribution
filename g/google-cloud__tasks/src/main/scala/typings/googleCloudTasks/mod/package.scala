package typings.googleCloudTasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type APICallback[T] = js.Function2[
    /* err */ typings.googleCloudTasks.mod.GoogleError | scala.Null, 
    /* response */ js.UndefOr[T], 
    scala.Unit
  ]
  type APIPaginatedCallback[T, U, V] = js.Function4[
    /* err */ typings.googleCloudTasks.mod.GoogleError | scala.Null, 
    /* response */ js.UndefOr[T], 
    /* next */ js.UndefOr[U | scala.Null], 
    /* rawResponse */ js.UndefOr[V], 
    scala.Unit
  ]
  type CallOptions = js.Any
  type CreateNamedRequest[N /* <: java.lang.String */, T] = typings.googleCloudTasks.mod.ParentRequest with typings.googleCloudTasks.googleCloudTasksStrings.CreateNamedRequest with org.scalablytyped.runtime.TopLevel[js.Any]
  type EnhancedPick[T, Req /* <: /* keyof T */ java.lang.String */, Opt /* <: /* keyof T */ java.lang.String */] = (typings.std.Required[typings.std.Pick[T, Req]]) with (typings.std.Partial[typings.std.Pick[T, Req]])
  type GoogleAuth = js.Any
  type GoogleAuthOptions = js.Any
  type GoogleError = js.Any
  type Keys[T] = /* keyof T */ java.lang.String
  type ProjectIdCallback = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* projectId */ js.UndefOr[java.lang.String | scala.Null], 
    scala.Unit
  ]
  type UpdateNamedRequest[N /* <: java.lang.String */, T] = typings.googleCloudTasks.mod.ParentRequest with typings.googleCloudTasks.googleCloudTasksStrings.UpdateNamedRequest with org.scalablytyped.runtime.TopLevel[js.Any]
}
