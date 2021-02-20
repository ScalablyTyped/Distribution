package typings.expressRoutesVersioning

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-routes-versioning", JSImport.Namespace)
  @js.native
  def apply(): RoutesVersioningMiddleware = js.native
  
  type RoutesVersioningMiddleware = js.Function2[/* args */ VersionOptions, /* notFoundMiddleware */ js.UndefOr[Handler], Handler]
  
  type VersionOptions = StringDictionary[Handler]
}
