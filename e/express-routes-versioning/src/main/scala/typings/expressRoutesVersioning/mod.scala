package typings.expressRoutesVersioning

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-routes-versioning", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): RoutesVersioningMiddleware = js.native
  
  type RoutesVersioningMiddleware = js.Function2[/* args */ VersionOptions, /* notFoundMiddleware */ js.UndefOr[Handler], Handler]
  
  type VersionOptions = StringDictionary[Handler]
}
