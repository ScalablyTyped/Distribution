package typings.dumbPasswords

import typings.dumbPasswords.anon.Frequency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dumb-passwords", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def check(password: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(password.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def checkPassword(password: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPassword")(password.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def rateOfUsage(password: String): Frequency = ^.asInstanceOf[js.Dynamic].applyDynamic("rateOfUsage")(password.asInstanceOf[js.Any]).asInstanceOf[Frequency]
}
