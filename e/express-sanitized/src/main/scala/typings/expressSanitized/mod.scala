package typings.expressSanitized

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* res */ Response_[js.Any], 
      /* next */ NextFunction, 
      Unit
    ]
  ]
}
