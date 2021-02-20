package typings.googleCloudCommon

import org.scalablytyped.runtime.Shortcut
import typings.googleCloudCommon.serviceMod.ServiceConfig
import typings.googleCloudCommon.serviceMod.ServiceOptions
import typings.googleCloudCommon.serviceObjectMod.ServiceObjectConfig
import typings.googleCloudCommon.utilMod.GoogleErrorBody
import typings.googleCloudCommon.utilMod.GoogleInnerError
import typings.googleCloudCommon.utilMod.Util_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@google-cloud/common", "ApiError")
  @js.native
  class ApiError protected ()
    extends typings.googleCloudCommon.utilMod.ApiError {
    def this(errorBody: GoogleErrorBody) = this()
    def this(errorMessage: String) = this()
  }
  /* static members */
  object ApiError {
    
    /**
      * Pieces together an error message by combining all unique error messages
      * returned from a single GoogleError
      *
      * @private
      *
      * @param {GoogleErrorBody} err The original error.
      * @param {GoogleInnerError[]} [errors] Inner errors, if any.
      * @returns {string}
      */
    @JSImport("@google-cloud/common", "ApiError.createMultiErrorMessage")
    @js.native
    def createMultiErrorMessage(err: GoogleErrorBody): String = js.native
    @JSImport("@google-cloud/common", "ApiError.createMultiErrorMessage")
    @js.native
    def createMultiErrorMessage(err: GoogleErrorBody, errors: js.Array[GoogleInnerError]): String = js.native
  }
  
  @JSImport("@google-cloud/common", "Operation")
  @js.native
  class Operation[T] protected ()
    extends typings.googleCloudCommon.operationMod.Operation[T] {
    /**
      * An Operation object allows you to interact with APIs that take longer to
      * process things.
      *
      * @constructor
      * @alias module:common/operation
      *
      * @param {object} config - Configuration object.
      * @param {module:common/service|module:common/serviceObject|module:common/grpcService|module:common/grpcServiceObject} config.parent - The parent object.
      */
    def this(config: ServiceObjectConfig) = this()
  }
  
  @JSImport("@google-cloud/common", "Service")
  @js.native
  class Service protected ()
    extends typings.googleCloudCommon.serviceMod.Service {
    /**
      * Service is a base class, meant to be inherited from by a "service," like
      * BigQuery or Storage.
      *
      * This handles making authenticated requests by exposing a `makeReq_`
      * function.
      *
      * @constructor
      * @alias module:common/service
      *
      * @param {object} config - Configuration object.
      * @param {string} config.baseUrl - The base URL to make API requests to.
      * @param {string[]} config.scopes - The scopes required for the request.
      * @param {object=} options - [Configuration object](#/docs).
      */
    def this(config: ServiceConfig) = this()
    def this(config: ServiceConfig, options: ServiceOptions) = this()
  }
  
  /**
    * ServiceObject is a base class, meant to be inherited from by a "service
    * object," like a BigQuery dataset or Storage bucket.
    *
    * Most of the time, these objects share common functionality; they can be
    * created or deleted, and you can get or set their metadata.
    *
    * By inheriting from this class, a service object will be extended with these
    * shared behaviors. Note that any method can be overridden when the service
    * object requires specific behavior.
    */
  @JSImport("@google-cloud/common", "ServiceObject")
  @js.native
  class ServiceObject[T] protected ()
    extends typings.googleCloudCommon.serviceObjectMod.ServiceObject[T] {
    def this(config: ServiceObjectConfig) = this()
  }
  
  object util extends Shortcut {
    
    @JSImport("@google-cloud/common", "util")
    @js.native
    val ^ : Util_ = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@google-cloud/common", "util.ApiError")
    @js.native
    class ApiErrorCls protected ()
      extends typings.googleCloudCommon.utilMod.ApiError {
      def this(errorMessage: String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@google-cloud/common", "util.PartialFailureError")
    @js.native
    class PartialFailureError protected ()
      extends typings.googleCloudCommon.utilMod.PartialFailureError {
      def this(b: GoogleErrorBody) = this()
    }
    
    type _To = Util_
    
    /* This means you don't have to write `^`, but can instead just say `util.foo` */
    override def _to: Util_ = ^
  }
}
