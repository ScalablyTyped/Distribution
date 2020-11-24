package typings.easyXHeaders.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Verify extends js.Object {
  
  def update(data: js.Any): Unit = js.native
  
  def verify(`object`: String, signature: String): Boolean = js.native
  def verify(`object`: String, signature: String, signature_format: String): Boolean = js.native
}
