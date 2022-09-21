package typings.googleCloudStorage.utilMod

import typings.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BodyResponseCallback = js.Function3[
/* err */ js.Error | ApiError | Null, 
/* body */ js.UndefOr[ResponseBody], 
/* res */ js.UndefOr[Response[Any]], 
Unit]

type OnAuthenticatedCallback = js.Function2[/* err */ js.Error | Null, /* reqOpts */ js.UndefOr[DecorateRequestOptions], Unit]

type ResponseBody = Any
