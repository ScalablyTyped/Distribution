package typings.fridaGum

import typings.fridaGum.fridaGumStrings.unix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnixConnectOptions extends SocketConnectOptions {
  /**
    * Address family.
    */
  var family: unix = js.native
  /**
    * Path to UNIX socket to connect to.
    */
  var path: String = js.native
  /**
    * Whether to create a TLS connection. Defaults to `false`.
    */
  var tls: js.UndefOr[Boolean] = js.native
  /**
    * Type of UNIX socket to connect to. Defaults to UnixSocketType.Path.
    */
  var `type`: js.UndefOr[UnixSocketType] = js.native
}

object UnixConnectOptions {
  @scala.inline
  def apply(family: unix, path: String): UnixConnectOptions = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixConnectOptions]
  }
  @scala.inline
  implicit class UnixConnectOptionsOps[Self <: UnixConnectOptions] (val x: Self) extends AnyVal {
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
    def setFamily(value: unix): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setTls(value: Boolean): Self = this.set("tls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTls: Self = this.set("tls", js.undefined)
    @scala.inline
    def setType(value: UnixSocketType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

