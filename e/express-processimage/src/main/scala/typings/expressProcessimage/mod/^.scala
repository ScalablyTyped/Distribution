package typings.expressProcessimage.mod

import typings.express.mod.NextFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-processimage", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Middleware that processes images according to the query string.
    * It is intended to be used in a development setting with the static middleware,
    * but should play well with any middleware further down the stack,even an http proxy, via hijackresponse.
    */
  def apply(): NextFunction = js.native
  def apply(options: Options): NextFunction = js.native
}
