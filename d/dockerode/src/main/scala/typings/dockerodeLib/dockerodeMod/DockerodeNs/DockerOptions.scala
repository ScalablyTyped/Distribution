package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerOptions extends js.Object {
  var Promise: js.UndefOr[stdLib.PromiseConstructor] = js.undefined
  var ca: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer]
  ] = js.undefined
  var cert: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer]
  ] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer] | js.Array[KeyObject]
  ] = js.undefined
  var port: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var protocol: js.UndefOr[dockerodeLib.dockerodeLibStrings.https | dockerodeLib.dockerodeLibStrings.http] = js.undefined
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object DockerOptions {
  @scala.inline
  def apply(
    Promise: stdLib.PromiseConstructor = null,
    ca: java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer] = null,
    cert: java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer] = null,
    host: java.lang.String = null,
    key: java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer] | js.Array[KeyObject] = null,
    port: scala.Double | java.lang.String = null,
    protocol: dockerodeLib.dockerodeLibStrings.https | dockerodeLib.dockerodeLibStrings.http = null,
    socketPath: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    version: java.lang.String = null
  ): DockerOptions = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise)
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[DockerOptions]
  }
}

