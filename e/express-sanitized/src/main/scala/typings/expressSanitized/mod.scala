package typings.expressSanitized

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("express-sanitized", JSImport.Namespace)
  @js.native
  val ^ : e = js.native
  
  type _To = e
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: e = ^
  
  type e = js.Function0[
    js.Function3[
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
    ]
  ]
}
