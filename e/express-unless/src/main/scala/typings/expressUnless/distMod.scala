package typings.expressUnless

import typings.express.mod.Request_
import typings.expressUnless.anon.Custom
import typings.expressUnless.anon.Method
import typings.expressUnless.anon.Unless
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("express-unless/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unless(options: Params): Unless = ^.asInstanceOf[js.Dynamic].applyDynamic("unless")(options.asInstanceOf[js.Any]).asInstanceOf[Unless]
  
  type Params = Custom | RequestChecker
  
  type Path = String | js.RegExp | Method
  
  type RequestChecker = js.Function1[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    Boolean
  ]
}
