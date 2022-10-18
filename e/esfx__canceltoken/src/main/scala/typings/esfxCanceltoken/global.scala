package typings.esfxCanceltoken

import typings.std.RequestInfo
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def fetch(input: RequestInfo): js.Promise[Response] = js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def fetch(input: RequestInfo, init: RequestInitWithCancelToken): js.Promise[Response] = (js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
}
