package typings.expressMongoSanitize

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ]]
  inline def apply(options: MongoSanitizeOptions): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ]]
  
  @JSImport("express-mongo-sanitize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def has(payload: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(payload.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def sanitize[T](payload: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(payload.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def sanitize[T](payload: T, options: MongoSanitizeOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(payload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait MongoSanitizeOptions extends StObject {
    
    var replaceWith: js.Any
  }
  object MongoSanitizeOptions {
    
    inline def apply(replaceWith: js.Any): MongoSanitizeOptions = {
      val __obj = js.Dynamic.literal(replaceWith = replaceWith.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongoSanitizeOptions]
    }
    
    extension [Self <: MongoSanitizeOptions](x: Self) {
      
      inline def setReplaceWith(value: js.Any): Self = StObject.set(x, "replaceWith", value.asInstanceOf[js.Any])
    }
  }
}
