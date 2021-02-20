package typings.expressPaginate

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
  
  @JSImport("express-paginate", "getArrayPages")
  @js.native
  def getArrayPages(req: Request_[ParamsDictionary, _, _, Query]): js.Function3[
    /* limit */ Double, 
    /* pageCount */ Double, 
    /* currentPage */ Double, 
    js.Array[PageElement]
  ] = js.native
  
  @JSImport("express-paginate", "hasNextPages")
  @js.native
  def hasNextPages(req: Request_[ParamsDictionary, _, _, Query]): js.Function1[/* pageCount */ Double, Boolean] = js.native
  
  @JSImport("express-paginate", "href")
  @js.native
  def href(req: Request_[ParamsDictionary, _, _, Query]): js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String] = js.native
  
  @JSImport("express-paginate", "middleware")
  @js.native
  def middleware(): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  @JSImport("express-paginate", "middleware")
  @js.native
  def middleware(limit: js.UndefOr[scala.Nothing], maxLimit: Double): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  @JSImport("express-paginate", "middleware")
  @js.native
  def middleware(limit: Double): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  @JSImport("express-paginate", "middleware")
  @js.native
  def middleware(limit: Double, maxLimit: Double): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  
  @js.native
  trait PageElement extends StObject {
    
    var number: Double = js.native
    
    def url(req: Request_[ParamsDictionary, _, _, Query]): js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String] = js.native
    @JSName("url")
    var url_Original: js.Function1[
        /* req */ Request_[ParamsDictionary, _, _, Query], 
        js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String]
      ] = js.native
  }
  
  object global {
    
    object Express {
      
      @js.native
      trait Request extends StObject {
        
        var offset: js.UndefOr[Double] = js.native
        
        var skip: js.UndefOr[Double] = js.native
      }
      object Request {
        
        @scala.inline
        def apply(): Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
          
          @scala.inline
          def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
        }
      }
    }
  }
}
