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

@js.native
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
  ] = js.native
  var ca: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.native
  var cert: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.native
  var host: js.UndefOr[String] = js.native
  var key: js.UndefOr[String | (js.Array[Buffer | KeyObject | String]) | Buffer] = js.native
  var port: js.UndefOr[Double | String] = js.native
  var protocol: js.UndefOr[https | http | ssh] = js.native
  var socketPath: js.UndefOr[String] = js.native
  var sshAuthAgent: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var username: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object DockerOptions {
  @scala.inline
  def apply(): DockerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DockerOptions]
  }
  @scala.inline
  implicit class DockerOptionsOps[Self <: DockerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPromise(
      value: PromiseConstructor with (Instantiable1[
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
        ])
    ): Self = this.set("Promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("Promise", js.undefined)
    @scala.inline
    def setCaVarargs(value: (Buffer | String)*): Self = this.set("ca", js.Array(value :_*))
    @scala.inline
    def setCa(value: String | (js.Array[Buffer | String]) | Buffer): Self = this.set("ca", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    @scala.inline
    def setCertVarargs(value: (Buffer | String)*): Self = this.set("cert", js.Array(value :_*))
    @scala.inline
    def setCert(value: String | (js.Array[Buffer | String]) | Buffer): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setKeyVarargs(value: (Buffer | KeyObject | String)*): Self = this.set("key", js.Array(value :_*))
    @scala.inline
    def setKey(value: String | (js.Array[Buffer | KeyObject | String]) | Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setPort(value: Double | String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProtocol(value: https | http | ssh): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    @scala.inline
    def setSshAuthAgent(value: String): Self = this.set("sshAuthAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshAuthAgent: Self = this.set("sshAuthAgent", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

