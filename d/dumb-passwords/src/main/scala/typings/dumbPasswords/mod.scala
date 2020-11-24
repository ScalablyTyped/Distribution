package typings.dumbPasswords

import typings.dumbPasswords.anon.Frequency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dumb-passwords", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def check(password: String): Boolean = js.native
  
  def checkPassword(password: String): Boolean = js.native
  
  def rateOfUsage(password: String): Frequency = js.native
}
