package typings.googleP12Pem

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("google-p12-pem", "getPem")
  @js.native
  def getPem(filename: String): js.Promise[String] = js.native
  @JSImport("google-p12-pem", "getPem")
  @js.native
  def getPem(filename: String, callback: js.Function2[/* err */ Error | Null, /* pem */ String | Null, Unit]): Unit = js.native
}
