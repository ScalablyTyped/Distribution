package typings.easyXapiSupertest.tlsMod

import typings.easyXapiSupertest.cryptoMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tls", "createSecurePair")
@js.native
object createSecurePair extends js.Object {
  
  def apply(): SecurePair = js.native
  def apply(
    credentials: js.UndefOr[scala.Nothing],
    isServer: js.UndefOr[scala.Nothing],
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  def apply(credentials: js.UndefOr[scala.Nothing], isServer: js.UndefOr[scala.Nothing], requestCert: Boolean): SecurePair = js.native
  def apply(
    credentials: js.UndefOr[scala.Nothing],
    isServer: js.UndefOr[scala.Nothing],
    requestCert: Boolean,
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  def apply(credentials: js.UndefOr[scala.Nothing], isServer: Boolean): SecurePair = js.native
  def apply(
    credentials: js.UndefOr[scala.Nothing],
    isServer: Boolean,
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  def apply(credentials: js.UndefOr[scala.Nothing], isServer: Boolean, requestCert: Boolean): SecurePair = js.native
  def apply(
    credentials: js.UndefOr[scala.Nothing],
    isServer: Boolean,
    requestCert: Boolean,
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  def apply(credentials: Credentials): SecurePair = js.native
  def apply(
    credentials: Credentials,
    isServer: js.UndefOr[scala.Nothing],
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  def apply(credentials: Credentials, isServer: js.UndefOr[scala.Nothing], requestCert: Boolean): SecurePair = js.native
  def apply(
    credentials: Credentials,
    isServer: js.UndefOr[scala.Nothing],
    requestCert: Boolean,
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  def apply(credentials: Credentials, isServer: Boolean): SecurePair = js.native
  def apply(
    credentials: Credentials,
    isServer: Boolean,
    requestCert: js.UndefOr[scala.Nothing],
    rejectUnauthorized: Boolean
  ): SecurePair = js.native
  def apply(credentials: Credentials, isServer: Boolean, requestCert: Boolean): SecurePair = js.native
  def apply(credentials: Credentials, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = js.native
}
