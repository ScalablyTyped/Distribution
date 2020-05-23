package typings.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.Utilities")
@js.native
object Utilities extends js.Object {
  /**
    * A typesafe enum for character sets.
    */
  @js.native
  object Charset extends js.Object {
    /* 0 */ val US_ASCII: typings.googleAppsScript.GoogleAppsScript.Utilities.Charset.US_ASCII with Double = js.native
    /* 1 */ val UTF_8: typings.googleAppsScript.GoogleAppsScript.Utilities.Charset.UTF_8 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Utilities.Charset with Double] = js.native
  }
  
  /**
    * Selector of Digest algorithm.
    */
  @js.native
  object DigestAlgorithm extends js.Object {
    /* 0 */ val MD2: typings.googleAppsScript.GoogleAppsScript.Utilities.DigestAlgorithm.MD2 with Double = js.native
    /* 1 */ val MD5: typings.googleAppsScript.GoogleAppsScript.Utilities.DigestAlgorithm.MD5 with Double = js.native
    /* 2 */ val SHA_1: typings.googleAppsScript.GoogleAppsScript.Utilities.DigestAlgorithm.SHA_1 with Double = js.native
    /* 3 */ val SHA_256: typings.googleAppsScript.GoogleAppsScript.Utilities.DigestAlgorithm.SHA_256 with Double = js.native
    /* 4 */ val SHA_384: typings.googleAppsScript.GoogleAppsScript.Utilities.DigestAlgorithm.SHA_384 with Double = js.native
    /* 5 */ val SHA_512: typings.googleAppsScript.GoogleAppsScript.Utilities.DigestAlgorithm.SHA_512 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Utilities.DigestAlgorithm with Double] = js.native
  }
  
  /**
    * Selector of MAC algorithm
    */
  @js.native
  object MacAlgorithm extends js.Object {
    /* 0 */ val HMAC_MD5: typings.googleAppsScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_MD5 with Double = js.native
    /* 1 */ val HMAC_SHA_1: typings.googleAppsScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_SHA_1 with Double = js.native
    /* 2 */ val HMAC_SHA_256: typings.googleAppsScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_SHA_256 with Double = js.native
    /* 3 */ val HMAC_SHA_384: typings.googleAppsScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_SHA_384 with Double = js.native
    /* 4 */ val HMAC_SHA_512: typings.googleAppsScript.GoogleAppsScript.Utilities.MacAlgorithm.HMAC_SHA_512 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Utilities.MacAlgorithm with Double] = js.native
  }
  
  /**
    * Selector of RSA algorithm
    */
  @js.native
  object RsaAlgorithm extends js.Object {
    /* 0 */ val RSA_SHA_1: typings.googleAppsScript.GoogleAppsScript.Utilities.RsaAlgorithm.RSA_SHA_1 with Double = js.native
    /* 1 */ val RSA_SHA_256: typings.googleAppsScript.GoogleAppsScript.Utilities.RsaAlgorithm.RSA_SHA_256 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Utilities.RsaAlgorithm with Double] = js.native
  }
  
}

