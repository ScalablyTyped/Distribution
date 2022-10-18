package typings.googleCloudStorage

import org.scalablytyped.runtime.Shortcut
import typings.googleCloudStorage.buildSrcNodejsCommonServiceMod.ServiceConfig
import typings.googleCloudStorage.buildSrcNodejsCommonServiceMod.ServiceOptions
import typings.googleCloudStorage.buildSrcNodejsCommonServiceObjectMod.ServiceObjectConfig
import typings.googleCloudStorage.buildSrcNodejsCommonUtilMod.GoogleErrorBody
import typings.googleCloudStorage.buildSrcNodejsCommonUtilMod.GoogleInnerError
import typings.googleCloudStorage.buildSrcNodejsCommonUtilMod.Util_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNodejsCommonMod {
  
  @JSImport("@google-cloud/storage/build/src/nodejs-common", "ApiError")
  @js.native
  open class ApiError protected ()
    extends typings.googleCloudStorage.buildSrcNodejsCommonUtilMod.ApiError {
    def this(errorBody: GoogleErrorBody) = this()
    def this(errorMessage: String) = this()
  }
  /* static members */
  object ApiError {
    
    @JSImport("@google-cloud/storage/build/src/nodejs-common", "ApiError")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def createMultiErrorMessage(err: GoogleErrorBody): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createMultiErrorMessage")(err.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def createMultiErrorMessage(err: GoogleErrorBody, errors: js.Array[GoogleInnerError]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultiErrorMessage")(err.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("@google-cloud/storage/build/src/nodejs-common", "Service")
  @js.native
  open class Service protected ()
    extends typings.googleCloudStorage.buildSrcNodejsCommonServiceMod.Service {
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
  @JSImport("@google-cloud/storage/build/src/nodejs-common", "ServiceObject")
  @js.native
  open class ServiceObject[T] protected ()
    extends typings.googleCloudStorage.buildSrcNodejsCommonServiceObjectMod.ServiceObject[T] {
    def this(config: ServiceObjectConfig) = this()
  }
  
  object util extends Shortcut {
    
    @JSImport("@google-cloud/storage/build/src/nodejs-common", "util")
    @js.native
    val ^ : Util_ = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@google-cloud/storage/build/src/nodejs-common", "util.ApiError")
    @js.native
    open class ApiErrorCls protected ()
      extends typings.googleCloudStorage.buildSrcNodejsCommonUtilMod.ApiError {
      def this(errorMessage: String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@google-cloud/storage/build/src/nodejs-common", "util.PartialFailureError")
    @js.native
    open class PartialFailureError protected ()
      extends typings.googleCloudStorage.buildSrcNodejsCommonUtilMod.PartialFailureError {
      def this(b: GoogleErrorBody) = this()
    }
    
    type _To = Util_
    
    /* This means you don't have to write `^`, but can instead just say `util.foo` */
    override def _to: Util_ = ^
  }
}
