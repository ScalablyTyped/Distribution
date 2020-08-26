package typings.dotenv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotenvConfigOptions extends js.Object {
  /**
    * You may turn on logging to help debug why certain keys or values are not being set as you expect.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * You may specify the encoding of your file containing environment variables.
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * You may specify a custom path if your file containing environment variables is located elsewhere.
    */
  var path: js.UndefOr[String] = js.native
}

object DotenvConfigOptions {
  @scala.inline
  def apply(): DotenvConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotenvConfigOptions]
  }
  @scala.inline
  implicit class DotenvConfigOptionsOps[Self <: DotenvConfigOptions] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

