package typings.expressFlashNotification

import typings.express.mod.Application_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(app: Application_, options: Unit, args: Any*): Any = (^.asInstanceOf[js.Dynamic].apply((scala.List(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  inline def apply(app: Application_, options: efnOptions, args: Any*): Any = (^.asInstanceOf[js.Dynamic].apply((scala.List(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  @JSImport("express-flash-notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait efnOptions extends StObject {
    
    var afterAllRender: js.UndefOr[
        js.Function2[
          /* htmlFragments */ js.Array[String], 
          /* callback */ js.Function2[/* err */ Any, /* html */ String, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var beforeSingleRender: js.UndefOr[
        js.Function2[
          /* item */ Any, 
          /* callback */ js.Function2[/* err */ Any, /* item */ Any, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var localsName: js.UndefOr[String] = js.undefined
    
    var sessionName: js.UndefOr[String] = js.undefined
    
    var utilityName: js.UndefOr[String] = js.undefined
    
    var viewName: js.UndefOr[String] = js.undefined
  }
  object efnOptions {
    
    inline def apply(): efnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[efnOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: efnOptions] (val x: Self) extends AnyVal {
      
      inline def setAfterAllRender(
        value: (/* htmlFragments */ js.Array[String], /* callback */ js.Function2[/* err */ Any, /* html */ String, Unit]) => Unit
      ): Self = StObject.set(x, "afterAllRender", js.Any.fromFunction2(value))
      
      inline def setAfterAllRenderUndefined: Self = StObject.set(x, "afterAllRender", js.undefined)
      
      inline def setBeforeSingleRender(value: (/* item */ Any, /* callback */ js.Function2[/* err */ Any, /* item */ Any, Unit]) => Unit): Self = StObject.set(x, "beforeSingleRender", js.Any.fromFunction2(value))
      
      inline def setBeforeSingleRenderUndefined: Self = StObject.set(x, "beforeSingleRender", js.undefined)
      
      inline def setLocalsName(value: String): Self = StObject.set(x, "localsName", value.asInstanceOf[js.Any])
      
      inline def setLocalsNameUndefined: Self = StObject.set(x, "localsName", js.undefined)
      
      inline def setSessionName(value: String): Self = StObject.set(x, "sessionName", value.asInstanceOf[js.Any])
      
      inline def setSessionNameUndefined: Self = StObject.set(x, "sessionName", js.undefined)
      
      inline def setUtilityName(value: String): Self = StObject.set(x, "utilityName", value.asInstanceOf[js.Any])
      
      inline def setUtilityNameUndefined: Self = StObject.set(x, "utilityName", js.undefined)
      
      inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
      
      inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      trait FlashOptions extends StObject {
        
        var message: js.UndefOr[String] = js.undefined
        
        var redirect: js.UndefOr[Boolean] = js.undefined
        
        var `type`: js.UndefOr[String] = js.undefined
        
        var url: js.UndefOr[String] = js.undefined
      }
      object FlashOptions {
        
        inline def apply(): FlashOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[FlashOptions]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: FlashOptions] (val x: Self) extends AnyVal {
          
          inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
          
          inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
          
          inline def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
          
          inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
          
          inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        }
      }
      
      @js.native
      trait Request extends StObject {
        
        def flash(`object`: FlashOptions): Unit = js.native
        def flash(`type`: String): Unit = js.native
        def flash(`type`: String, message: String): Unit = js.native
        def flash(`type`: String, message: String, redirect: String): Unit = js.native
        def flash(`type`: String, message: String, redirect: Boolean): Unit = js.native
        def flash(`type`: String, message: Unit, redirect: String): Unit = js.native
        def flash(`type`: String, message: Unit, redirect: Boolean): Unit = js.native
      }
    }
  }
}
