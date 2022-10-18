package typings.egg.anon

import typings.urllib.srcEsmRequestMod.RequestOptions
import typings.urllib.srcEsmRequestMod.RequestURL
import typings.urllib.srcEsmResponseMod.HttpClientResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(url: RequestURL): js.Promise[HttpClientResponse] = js.native
  def apply(url: RequestURL, options: RequestOptions): js.Promise[HttpClientResponse] = js.native
}
