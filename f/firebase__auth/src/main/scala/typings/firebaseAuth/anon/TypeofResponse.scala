package typings.firebaseAuth.anon

import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofResponse extends StObject {
  
  /* standard dom */
  def error(): Response = js.native
  
  /* standard dom */
  def redirect(url: String): Response = js.native
  def redirect(url: String, status: Double): Response = js.native
  def redirect(url: URL): Response = js.native
  def redirect(url: URL, status: Double): Response = js.native
}
