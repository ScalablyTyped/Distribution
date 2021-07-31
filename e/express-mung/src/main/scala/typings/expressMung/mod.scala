package typings.expressMung

import typings.express.mod.ErrorRequestHandler
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-mung", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def headers(fn: TransformHeader): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("headers")(fn.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def headersAsync(fn: TransformHeaderAsync): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("headersAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def json(fn: Transform): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(fn.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def json(fn: Transform, options: Options): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def jsonAsync(fn: TransformAsync): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def jsonAsync(fn: TransformAsync, options: Options): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonAsync")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("express-mung", "onError")
  @js.native
  def onError: ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query] = js.native
  @scala.inline
  def onError_=(x: ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def write(fn: TransformChunk): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(fn.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def write(fn: TransformChunk, options: Options): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  trait Options extends StObject {
    
    var mungError: Boolean
  }
  object Options {
    
    @scala.inline
    def apply(mungError: Boolean): Options = {
      val __obj = js.Dynamic.literal(mungError = mungError.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMungError(value: Boolean): Self = StObject.set(x, "mungError", value.asInstanceOf[js.Any])
    }
  }
  
  type Transform = js.Function3[
    /* body */ js.Object, 
    /* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* response */ Response_[js.Any], 
    js.Any
  ]
  
  type TransformAsync = js.Function3[
    /* body */ js.Object, 
    /* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* response */ Response_[js.Any], 
    js.Thenable[js.Any]
  ]
  
  type TransformChunk = js.Function4[
    /* chunk */ String | Buffer, 
    /* encoding */ String | Null, 
    /* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* response */ Response_[js.Any], 
    String | Buffer
  ]
  
  type TransformHeader = js.Function2[
    /* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* response */ Response_[js.Any], 
    js.Any
  ]
  
  type TransformHeaderAsync = js.Function2[
    /* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* response */ Response_[js.Any], 
    js.Thenable[js.Any]
  ]
}
