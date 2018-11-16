package typings
package fingerprintjs2Lib.fingerprintjs2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fingerprintjs2", JSImport.Namespace)
@js.native
class namespaced () extends Fingerprint2 {
  def this(options: Fingerprint2Options) = this()
  /* CompleteClass */
  override def get(
    callback: js.Function2[
      /* result */ java.lang.String, 
      /* components */ js.Array[fingerprintjs2Lib.Anon_Key], 
      scala.Unit
    ]
  ): scala.Double = js.native
}

@JSImport("fingerprintjs2", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var VERSION: java.lang.String = js.native
}

