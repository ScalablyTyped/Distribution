package typings.esfxCanceltoken

import typings.std.RequestInfo
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowOrWorkerGlobalScope extends StObject {
  
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInitWithCancelToken): js.Promise[Response] = js.native
}
