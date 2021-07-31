package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scryptMod {
  
  @JSImport("ethereum-cryptography/scrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def scrypt(password: Buffer, salt: Buffer, n: Double, p: Double, r: Double, dklen: Double): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], r.asInstanceOf[js.Any], dklen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @scala.inline
  def scryptSync(password: Buffer, salt: Buffer, n: Double, p: Double, r: Double, dklen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], n.asInstanceOf[js.Any], p.asInstanceOf[js.Any], r.asInstanceOf[js.Any], dklen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
