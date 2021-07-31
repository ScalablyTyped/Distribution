package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type APICallback[T] = js.Function2[
/* err */ typings.googleGax.mod.GoogleError | scala.Null, 
/* response */ js.UndefOr[T], 
scala.Unit]

type APIPaginatedCallback[T, U, V] = js.Function4[
/* err */ typings.googleGax.mod.GoogleError | scala.Null, 
/* response */ js.UndefOr[T], 
/* next */ js.UndefOr[U | scala.Null], 
/* rawResponse */ js.UndefOr[V], 
scala.Unit]

type CreateNamedRequest[N /* <: java.lang.String */, T] = typings.googleCloudTasks.mod.ParentRequest & typings.googleCloudTasks.googleCloudTasksStrings.CreateNamedRequest & org.scalablytyped.runtime.TopLevel[js.Any]

type EnhancedPick[T, Req /* <: /* keyof T */ java.lang.String */, Opt /* <: /* keyof T */ java.lang.String */] = (typings.std.Required[typings.std.Pick[T, Req]]) & (typings.std.Partial[typings.std.Pick[T, Req]])

type Keys[T] = /* keyof T */ java.lang.String

type ProjectIdCallback = js.Function2[
/* err */ js.UndefOr[typings.std.Error | scala.Null], 
/* projectId */ js.UndefOr[java.lang.String | scala.Null], 
scala.Unit]

type UpdateNamedRequest[N /* <: java.lang.String */, T] = typings.googleCloudTasks.mod.ParentRequest & typings.googleCloudTasks.googleCloudTasksStrings.UpdateNamedRequest & org.scalablytyped.runtime.TopLevel[js.Any]
