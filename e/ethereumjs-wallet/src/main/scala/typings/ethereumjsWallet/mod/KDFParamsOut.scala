package typings.ethereumjsWallet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ethereumjsWallet.mod.ScryptKDFParamsOut
  - typings.ethereumjsWallet.mod.PBKDFParamsOut
*/
trait KDFParamsOut extends js.Object
object KDFParamsOut {
  
  @scala.inline
  def ScryptKDFParamsOut(dklen: Double, n: Double, p: Double, r: Double, salt: String): KDFParamsOut = {
    val __obj = js.Dynamic.literal(dklen = dklen.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[KDFParamsOut]
  }
  
  @scala.inline
  def PBKDFParamsOut(c: Double, dklen: Double, prf: String, salt: String): KDFParamsOut = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], dklen = dklen.asInstanceOf[js.Any], prf = prf.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[KDFParamsOut]
  }
}
