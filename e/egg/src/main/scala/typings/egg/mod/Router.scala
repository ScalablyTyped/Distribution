package typings.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router
  extends typings.koaRouter.mod.^[js.Any, Context] {
  
  /**
    * restful router api
    */
  def resources(name: String, prefix: String, middleware: js.Any*): Router = js.native
}
