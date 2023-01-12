package typings.expressUnless

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressUnless.mod.Params
import typings.expressUnless.mod.Path
import typings.expressUnless.mod.RequestChecker
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      next: NextFunction
    ): js.Promise[Unit] = js.native
  }
  
  trait Custom extends StObject {
    
    var custom: js.UndefOr[RequestChecker] = js.undefined
    
    var ext: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var method: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var path: js.UndefOr[Path | js.Array[Path]] = js.undefined
    
    var useOriginalUrl: js.UndefOr[Boolean] = js.undefined
  }
  object Custom {
    
    inline def apply(): Custom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Custom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
      
      inline def setCustom(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => Boolean
      ): Self = StObject.set(x, "custom", js.Any.fromFunction1(value))
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setExt(value: String | js.Array[String]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value*))
      
      inline def setMethod(value: String | js.Array[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMethodVarargs(value: String*): Self = StObject.set(x, "method", js.Array(value*))
      
      inline def setPath(value: Path | js.Array[Path]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: Path*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setUseOriginalUrl(value: Boolean): Self = StObject.set(x, "useOriginalUrl", value.asInstanceOf[js.Any])
      
      inline def setUseOriginalUrlUndefined: Self = StObject.set(x, "useOriginalUrl", js.undefined)
    }
  }
  
  trait Method extends StObject {
    
    var method: js.UndefOr[String] = js.undefined
    
    var methods: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var url: String | js.RegExp
  }
  object Method {
    
    inline def apply(url: String | js.RegExp): Method = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMethods(value: String | js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setUrl(value: String | js.RegExp): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Unless extends StObject {
    
    def apply(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      next: NextFunction
    ): js.Promise[Unit] = js.native
    
    def unless(options: Params): Call = js.native
    @JSName("unless")
    var unless_Original: js.Function1[/* options */ Params, Call] = js.native
  }
}
