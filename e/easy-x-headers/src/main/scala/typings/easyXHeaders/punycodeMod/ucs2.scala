package typings.easyXHeaders.punycodeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ucs2 extends js.Object {
  
  def decode(string: String): String = js.native
  
  def encode(codePoints: js.Array[Double]): String = js.native
}
@JSImport("punycode", "ucs2")
@js.native
object ucs2 extends TopLevel[ucs2]
