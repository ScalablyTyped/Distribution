package typings.expressFlash2

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Expose `flash()` function on responses.
    */
  inline def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("express-flash-2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object global {
    
    object Express {
      
      type Flash = StringDictionary[js.Array[js.Any]]
      
      trait Request extends StObject {
        
        var session: js.UndefOr[Session] = js.undefined
      }
      object Request {
        
        inline def apply(): Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Request]
        }
        
        extension [Self <: Request](x: Self) {
          
          inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
          
          inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
        }
      }
      
      @js.native
      trait Response extends StObject {
        
        /**
          * Queue flash `msg` of the given `type`.
          *
          * Examples:
          *
          *      req.flash('info', 'email sent');
          *      req.flash('error', 'email delivery failed');
          *      req.flash('info', 'email re-sent');
          *
          *
          * Formatting:
          *
          * Flash notifications also support arbitrary formatting support.
          * For example you may pass variable arguments to `req.flash()`
          * and use the %s specifier to be replaced by the associated argument:
          *
          *     req.flash('info', 'email has been sent to %s.', userName);
          *
          * Formatting uses `util.format()`, which is available on Node 0.6+.
          */
        def flash(`type`: String, msg: String): Unit = js.native
        def flash(`type`: String, msg: js.Array[js.Any]): Unit = js.native
        
        var locals: typings.expressFlash2.anon.Flash = js.native
      }
      
      trait Session extends StObject {
        
        var flash: Flash
      }
      object Session {
        
        inline def apply(flash: Flash): Session = {
          val __obj = js.Dynamic.literal(flash = flash.asInstanceOf[js.Any])
          __obj.asInstanceOf[Session]
        }
        
        extension [Self <: Session](x: Self) {
          
          inline def setFlash(value: Flash): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
