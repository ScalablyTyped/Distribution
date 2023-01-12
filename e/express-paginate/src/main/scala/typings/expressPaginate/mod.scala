package typings.expressPaginate

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-paginate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getArrayPages(
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): js.Function3[
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
  
  inline def hasNextPages(
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): js.Function1[/* pageCount */ Double, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasNextPages")(req.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* pageCount */ Double, Boolean]]
  
  inline def href(
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("href")(req.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String]]
  
  inline def middleware(): js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")().asInstanceOf[js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ]]
  inline def middleware(limit: Double): js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(limit.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ]]
  inline def middleware(limit: Double, maxLimit: Double): js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(limit.asInstanceOf[js.Any], maxLimit.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ]]
  inline def middleware(limit: Unit, maxLimit: Double): js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("middleware")(limit.asInstanceOf[js.Any], maxLimit.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* next */ NextFunction, 
    Unit
  ]]
  
  trait PageElement extends StObject {
    
    var number: Double
    
    def url(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String]
    @JSName("url")
    var url_Original: js.Function1[
        /* req */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], 
        js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String]
      ]
  }
  object PageElement {
    
    inline def apply(
      number: Double,
      url: /* req */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ] => js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String]
    ): PageElement = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], url = js.Any.fromFunction1(url))
      __obj.asInstanceOf[PageElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageElement] (val x: Self) extends AnyVal {
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setUrl(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String]
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
        
        inline def apply(): Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
          
          inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
          
          inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
          
          inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
        }
      }
    }
  }
}
