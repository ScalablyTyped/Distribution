package typings.fingerprintjs

import org.scalablytyped.runtime.TopLevel
import typings.fingerprintjs.FingerprintJs.FingerprintOption
import typings.fingerprintjs.FingerprintJs.FingerprintStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Fingerprint ()
    extends typings.fingerprintjs.FingerprintJs.Fingerprint {
    /**
      * Create Fingerprint object.
      */
    def this(hasher: js.Function2[/* key */ String, /* seed */ Double, Double]) = this()
    def this(option: FingerprintOption) = this()
  }
  
  @js.native
  object Fingerprint extends TopLevel[FingerprintStatic]
  
}

