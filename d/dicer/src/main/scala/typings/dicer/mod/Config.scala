package typings.dicer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * This is the boundary used to detect the beginning of a new part.
    */
  var boundary: js.UndefOr[String] = js.native
  /**
    * If true, preamble header parsing will be performed first.
    */
  var headerFirst: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of header key=>value pairs to parse Default: 2000 (same as node's http).
    */
  var maxHeaderPairs: js.UndefOr[Double] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setBoundary(value: String): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    @scala.inline
    def setHeaderFirst(value: Boolean): Self = this.set("headerFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderFirst: Self = this.set("headerFirst", js.undefined)
    @scala.inline
    def setMaxHeaderPairs(value: Double): Self = this.set("maxHeaderPairs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeaderPairs: Self = this.set("maxHeaderPairs", js.undefined)
  }
  
}

