package typings.dumbPasswords

import typings.dumbPasswords.anon.Frequency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dumb-passwords", "check")
  @js.native
  def check(password: String): Boolean = js.native
  
  @JSImport("dumb-passwords", "checkPassword")
  @js.native
  def checkPassword(password: String): Boolean = js.native
  
  @JSImport("dumb-passwords", "rateOfUsage")
  @js.native
  def rateOfUsage(password: String): Frequency = js.native
}
