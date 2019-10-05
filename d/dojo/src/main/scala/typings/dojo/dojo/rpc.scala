package typings.dojo.dojo

import typings.dojo.dojo._base.array
import typings.dojo.dojo.rpc.RpcService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojo.rpc")
@js.native
object rpc extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/rpc/JsonService.html
    *
    * TODOC
    *
    * @param args Takes a number of properties as kwArgs for defining the service.  It alsoaccepts a string.  When passed a string, it is treated as a url fromwhich it should synchronously retrieve an smd file.  Otherwise it is a kwArgsobject.  It accepts serviceUrl, to manually define a url for the rpc serviceallowing the rpc system to be used without an smd definition. strictArgChecksforces the system to verify that the # of arguments provided in a callmatches those defined in the smd.  smdString allows a developer to passa jsonString directly, which will be converted into an object or alternativelysmdObject is accepts an smdObject directly.
    */
  @js.native
  class JsonService protected () extends RpcService {
    def this(args: js.Object) = this()
    /**
      *
      */
    var bustCache: Boolean = js.native
    /**
      *
      */
    var contentType: String = js.native
    /**
      *
      */
    var lastSubmissionId: Double = js.native
    /**
      * JSON-RPC bind method. Takes remote method, parameters,
      * deferred, and a url, calls createRequest to make a JSON-RPC
      * envelope and passes that off with bind.
      *
      * @param method The name of the method we are calling
      * @param parameters The parameters we are passing off to the method
      * @param deferredRequestHandler The Deferred object for this particular request
      * @param url
      */
    def bind(method: String, parameters: js.Array[_], deferredRequestHandler: Deferred, url: js.Any): Unit = js.native
    /**
      * call an arbitrary remote method without requiring it to be
      * predefined with SMD
      *
      * @param method the name of the remote method you want to call.
      * @param params array of parameters to pass to method
      */
    def callRemote(method: String, params: js.Array[_]): js.Any = js.native
    /**
      * create a JSON-RPC envelope for the request
      *
      * @param method The name of the method we are creating the request for
      * @param params The array of parameters for this request;
      */
    def createRequest(method: String, params: array): js.Any = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/rpc/JsonpService.html
    *
    * Generic JSONP service.  Minimally extends RpcService to allow
    * easy definition of nearly any JSONP style service. Example
    * SMD files exist in dojox.data
    *
    * @param args
    * @param requiredArgs
    */
  @js.native
  class JsonpService protected () extends RpcService {
    def this(args: js.Any, requiredArgs: js.Any) = this()
    /**
      * JSONP bind method. Takes remote method, parameters,
      * deferred, and a url, calls createRequest to make a JSON-RPC
      * envelope and passes that off with bind.
      *
      * @param method The name of the method we are calling
      * @param parameters The parameters we are passing off to the method
      * @param deferredRequestHandler The Deferred object for this particular request
      * @param url
      */
    def bind(method: String, parameters: array, deferredRequestHandler: Deferred, url: js.Any): Unit = js.native
    /**
      * create a JSONP req
      *
      * @param parameters
      */
    def createRequest(parameters: js.Any): js.Object = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/rpc/RpcService.html
    *
    * TODOC
    *
    * @param args Takes a number of properties as kwArgs for defining the service.  It alsoaccepts a string.  When passed a string, it is treated as a url fromwhich it should synchronously retrieve an smd file.  Otherwise it is a kwArgsobject.  It accepts serviceUrl, to manually define a url for the rpc serviceallowing the rpc system to be used without an smd definition. strictArgChecksforces the system to verify that the # of arguments provided in a callmatches those defined in the smd.  smdString allows a developer to passa jsonString directly, which will be converted into an object or alternativelysmdObject is accepts an smdObject directly.
    */
  @js.native
  class RpcService protected () extends js.Object {
    def this(args: js.Object) = this()
    /**
      *
      */
    var serviceUrl: String = js.native
    /**
      *
      */
    var strictArgChecks: Boolean = js.native
    /**
      * create callback that calls the Deferred errback method
      *
      * @param deferredRequestHandler The deferred object handling a request.
      */
    def errorCallback(deferredRequestHandler: typings.dojo.dojo._base.Deferred): js.Function = js.native
    /**
      * generate the local bind methods for the remote object
      *
      * @param method The name of the method we are generating
      * @param parameters the array of parameters for this call.
      * @param url the service url for this call
      */
    def generateMethod(method: String, parameters: array, url: String): js.Any = js.native
    /**
      * parse the results coming back from an rpc request.  this
      * base implementation, just returns the full object
      * subclasses should parse and only return the actual results
      *
      * @param obj Object that is the return results from an rpc request
      */
    def parseResults(obj: js.Object): js.Object = js.native
    /**
      * callback method for receipt of a smd object.  Parse the smd
      * and generate functions based on the description
      *
      * @param object smd object defining this service.
      */
    def processSmd(`object`: js.Any): Unit = js.native
    /**
      * create callback that calls the Deferred's callback method
      *
      * @param deferredRequestHandler The deferred object handling a request.
      */
    def resultCallback(deferredRequestHandler: typings.dojo.dojo._base.Deferred): js.Any = js.native
  }
  
}

