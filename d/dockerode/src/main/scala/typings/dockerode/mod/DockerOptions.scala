package typings.dockerode.mod

import org.scalablytyped.runtime.Instantiable1
import typings.dockerode.dockerodeStrings.http
import typings.dockerode.dockerodeStrings.https
import typings.dockerode.dockerodeStrings.ssh
import typings.node.Buffer
import typings.std.PromiseConstructor
import typings.std.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerOptions extends js.Object {
  var Promise: js.UndefOr[
    PromiseConstructor with (Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[
          /* value */ js.UndefOr[
            (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any])
          ], 
          Unit
        ], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      typings.std.global.Promise[js.Object]
    ])
  ] = js.undefined
  var ca: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
  var cert: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String | (js.Array[Buffer | KeyObject | String]) | Buffer] = js.undefined
  var port: js.UndefOr[Double | String] = js.undefined
  var protocol: js.UndefOr[https | http | ssh] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
  var sshAuthAgent: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object DockerOptions {
  @scala.inline
  def apply(
    Promise: PromiseConstructor with (Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[
          /* value */ js.UndefOr[
            (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any])
          ], 
          Unit
        ], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      Promise[js.Object]
    ]) = null,
    ca: String | (js.Array[Buffer | String]) | Buffer = null,
    cert: String | (js.Array[Buffer | String]) | Buffer = null,
    host: String = null,
    key: String | (js.Array[Buffer | KeyObject | String]) | Buffer = null,
    port: Double | String = null,
    protocol: https | http | ssh = null,
    socketPath: String = null,
    sshAuthAgent: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    username: String = null,
    version: String = null
  ): DockerOptions = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (sshAuthAgent != null) __obj.updateDynamic("sshAuthAgent")(sshAuthAgent.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerOptions]
  }
}

