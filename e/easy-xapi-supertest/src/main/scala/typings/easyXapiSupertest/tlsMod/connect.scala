package typings.easyXapiSupertest.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tls", "connect")
@js.native
object connect extends js.Object {
  def apply(options: TlsOptions): ClearTextStream = js.native
  def apply(options: TlsOptions, secureConnectionListener: js.Function0[Unit]): ClearTextStream = js.native
  def apply(port: Double): ClearTextStream = js.native
  def apply(
    port: Double,
    host: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    secureConnectListener: js.Function0[Unit]
  ): ClearTextStream = js.native
  def apply(port: Double, host: js.UndefOr[scala.Nothing], options: ConnectionOptions): ClearTextStream = js.native
  def apply(
    port: Double,
    host: js.UndefOr[scala.Nothing],
    options: ConnectionOptions,
    secureConnectListener: js.Function0[Unit]
  ): ClearTextStream = js.native
  def apply(port: Double, host: String): ClearTextStream = js.native
  def apply(
    port: Double,
    host: String,
    options: js.UndefOr[scala.Nothing],
    secureConnectListener: js.Function0[Unit]
  ): ClearTextStream = js.native
  def apply(port: Double, host: String, options: ConnectionOptions): ClearTextStream = js.native
  def apply(port: Double, host: String, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): ClearTextStream = js.native
  def apply(port: Double, options: js.UndefOr[scala.Nothing], secureConnectListener: js.Function0[Unit]): ClearTextStream = js.native
  def apply(port: Double, options: ConnectionOptions): ClearTextStream = js.native
  def apply(port: Double, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): ClearTextStream = js.native
}

