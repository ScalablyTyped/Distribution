package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.anon.AttachedFiles
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcApiBatchMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/api-batch", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with FacebookAdsApiBatch {
    def this(api: typings.facebookNodejsBusinessSdk.srcApiMod.default) = this()
    def this(
      api: typings.facebookNodejsBusinessSdk.srcApiMod.default,
      successCallback: js.Function1[/* repeated */ Any, Any]
    ) = this()
    def this(
      api: typings.facebookNodejsBusinessSdk.srcApiMod.default,
      successCallback: js.Function1[/* repeated */ Any, Any],
      failureCallback: js.Function1[/* repeated */ Any, Any]
    ) = this()
    def this(
      api: typings.facebookNodejsBusinessSdk.srcApiMod.default,
      successCallback: Unit,
      failureCallback: js.Function1[/* repeated */ Any, Any]
    ) = this()
  }
  
  @js.native
  trait FacebookAdsApiBatch extends StObject {
    
    var _api: typings.facebookNodejsBusinessSdk.srcApiMod.default = js.native
    
    var _batch: js.Array[Record[String, Any]] = js.native
    
    var _failureCallbacks: js.Array[js.Function1[/* repeated */ Any, Any]] = js.native
    
    var _files: js.Array[Record[String, Any]] = js.native
    
    var _requests: js.Array[typings.facebookNodejsBusinessSdk.srcApiRequestMod.default] = js.native
    
    var _successCallbacks: js.Array[js.Function1[/* repeated */ Any, Any]] = js.native
    
    def add(
      method: String,
      relativePath: js.Array[String] | String,
      params: js.UndefOr[Record[String, Any]],
      files: js.UndefOr[Record[String, Any]],
      successCallback: js.UndefOr[js.Function1[/* repeated */ Any, Any]],
      failureCallback: js.UndefOr[js.Function1[/* repeated */ Any, Any]],
      request: js.UndefOr[typings.facebookNodejsBusinessSdk.srcApiRequestMod.default]
    ): AttachedFiles = js.native
    
    def addRequest(request: typings.facebookNodejsBusinessSdk.srcApiRequestMod.default): AttachedFiles = js.native
    def addRequest(
      request: typings.facebookNodejsBusinessSdk.srcApiRequestMod.default,
      successCallback: js.Function1[/* repeated */ Any, Any]
    ): AttachedFiles = js.native
    def addRequest(
      request: typings.facebookNodejsBusinessSdk.srcApiRequestMod.default,
      successCallback: js.Function1[/* repeated */ Any, Any],
      failureCallback: js.Function1[/* repeated */ Any, Any]
    ): AttachedFiles = js.native
    def addRequest(
      request: typings.facebookNodejsBusinessSdk.srcApiRequestMod.default,
      successCallback: Unit,
      failureCallback: js.Function1[/* repeated */ Any, Any]
    ): AttachedFiles = js.native
    
    def execute(): js.Promise[Any] = js.native
  }
}
