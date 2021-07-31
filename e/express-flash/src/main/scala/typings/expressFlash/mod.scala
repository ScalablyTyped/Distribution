package typings.expressFlash

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("express-flash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object global {
    
    object Express {
      
      @js.native
      trait Request extends StObject {
        
        def flash(): StringDictionary[js.Array[String]] = js.native
        def flash(event: String, message: String): js.Any = js.native
        def flash(event: String, message: js.Array[String]): js.Any = js.native
        def flash(message: String): StringDictionary[js.Array[String]] = js.native
      }
    }
  }
}
