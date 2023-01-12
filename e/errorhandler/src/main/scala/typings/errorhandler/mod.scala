package typings.errorhandler

import typings.express.mod.ErrorRequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create new middleware to handle errors and respond with content negotiation.
    */
  inline def apply(): ErrorRequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ErrorRequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(options: Options): ErrorRequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ErrorRequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("errorhandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Template title, framework authors may override this value.
    */
  @JSImport("errorhandler", "title")
  @js.native
  val title: String = js.native
  
  type LoggingCallback = js.Function4[
    /* err */ js.Error, 
    /* str */ String, 
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    Unit
  ]
  
  trait Options extends StObject {
    
    /**
      * Provide a function to be called with the error and a string representation of the erro
      * Defaults to true.
      *
      * Possible values:
      *   true       : Log errors using console.error(str).
      *   false      : Only send the error back in the response.
      *   A function : pass the error to a function for handling.
      */
    var log: Boolean | LoggingCallback
  }
  object Options {
    
    inline def apply(log: Boolean | LoggingCallback): Options = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLog(value: Boolean | LoggingCallback): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogFunction4(
        value: (/* err */ js.Error, /* str */ String, /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]]) => Unit
      ): Self = StObject.set(x, "log", js.Any.fromFunction4(value))
    }
  }
}
