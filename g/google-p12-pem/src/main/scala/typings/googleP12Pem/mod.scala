package typings.googleP12Pem

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-p12-pem", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getPem(filename: String): js.Promise[String] = js.native
  def getPem(filename: String, callback: js.Function2[/* err */ Error | Null, /* pem */ String | Null, Unit]): Unit = js.native
}

