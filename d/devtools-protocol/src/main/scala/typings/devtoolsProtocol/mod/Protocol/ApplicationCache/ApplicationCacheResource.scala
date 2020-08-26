package typings.devtoolsProtocol.mod.Protocol.ApplicationCache

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationCacheResource extends js.Object {
  /**
    * Resource size.
    */
  var size: integer = js.native
  /**
    * Resource type.
    */
  var `type`: String = js.native
  /**
    * Resource url.
    */
  var url: String = js.native
}

object ApplicationCacheResource {
  @scala.inline
  def apply(size: integer, `type`: String, url: String): ApplicationCacheResource = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCacheResource]
  }
  @scala.inline
  implicit class ApplicationCacheResourceOps[Self <: ApplicationCacheResource] (val x: Self) extends AnyVal {
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
    def setSize(value: integer): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

