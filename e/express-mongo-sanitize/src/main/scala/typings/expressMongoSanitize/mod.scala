package typings.expressMongoSanitize

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-mongo-sanitize", JSImport.Namespace)
  @js.native
  def apply(): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  @JSImport("express-mongo-sanitize", JSImport.Namespace)
  @js.native
  def apply(options: MongoSanitizeOptions): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  
  @JSImport("express-mongo-sanitize", "has")
  @js.native
  def has(payload: js.Any): Boolean = js.native
  
  @JSImport("express-mongo-sanitize", "sanitize")
  @js.native
  def sanitize[T](payload: T): T = js.native
  @JSImport("express-mongo-sanitize", "sanitize")
  @js.native
  def sanitize[T](payload: T, options: MongoSanitizeOptions): T = js.native
  
  @js.native
  trait MongoSanitizeOptions extends StObject {
    
    var replaceWith: js.Any = js.native
  }
  object MongoSanitizeOptions {
    
    @scala.inline
    def apply(replaceWith: js.Any): MongoSanitizeOptions = {
      val __obj = js.Dynamic.literal(replaceWith = replaceWith.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongoSanitizeOptions]
    }
    
    @scala.inline
    implicit class MongoSanitizeOptionsMutableBuilder[Self <: MongoSanitizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplaceWith(value: js.Any): Self = StObject.set(x, "replaceWith", value.asInstanceOf[js.Any])
    }
  }
}
