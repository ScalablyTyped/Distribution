package typings.expressPaginate

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-paginate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getArrayPages(req: Request_[ParamsDictionary, js.Any, js.Any, Query]): js.Function3[
    /* limit */ Double, 
    /* pageCount */ Double, 
    /* currentPage */ Double, 
    js.Array[PageElement]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getArrayPages")(req.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* limit */ Double, 
    /* pageCount */ Double, 
    /* currentPage */ Double, 
    js.Array[PageElement]
  ]]
  
  @scala.inline
  def hasNextPages(req: Request_[ParamsDictionary, js.Any, js.Any, Query]): js.Function1[/* pageCount */ Double, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasNextPages")(req.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* pageCount */ Double, Boolean]]
  
  @scala.inline
  def href(req: Request_[ParamsDictionary, js.Any, js.Any, Query]): js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("href")(req.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String]]
  
  @scala.inline
  def middleware(): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")().asInstanceOf[js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ]]
  @scala.inline
  def middleware(limit: Double): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(limit.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ]]
  @scala.inline
  def middleware(limit: Double, maxLimit: Double): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(limit.asInstanceOf[js.Any], maxLimit.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ]]
  @scala.inline
  def middleware(limit: Unit, maxLimit: Double): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(limit.asInstanceOf[js.Any], maxLimit.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ]]
  
  trait PageElement extends StObject {
    
    var number: Double
    
    def url(req: Request_[ParamsDictionary, js.Any, js.Any, Query]): js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String]
    @JSName("url")
    var url_Original: js.Function1[
        /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
        js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String]
      ]
  }
  object PageElement {
    
    @scala.inline
    def apply(
      number: Double,
      url: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String]
    ): PageElement = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], url = js.Any.fromFunction1(url))
      __obj.asInstanceOf[PageElement]
    }
    
    @scala.inline
    implicit class PageElementMutableBuilder[Self <: PageElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(
        value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String]
      ): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
    }
  }
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        var offset: js.UndefOr[Double] = js.undefined
        
        var skip: js.UndefOr[Double] = js.undefined
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
