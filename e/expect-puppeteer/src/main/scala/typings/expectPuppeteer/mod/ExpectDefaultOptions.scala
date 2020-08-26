package typings.expectPuppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default options that apply to all expectations and can be set globally
  */
@js.native
trait ExpectDefaultOptions extends js.Object {
  /**
    * An interval at which the pageFunction is executed. Defaults to "raf".
    */
  var polling: js.UndefOr[ExpectPolling] = js.native
  /**
    * Maximum time to wait for in milliseconds. Defaults to 500.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object ExpectDefaultOptions {
  @scala.inline
  def apply(): ExpectDefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpectDefaultOptions]
  }
  @scala.inline
  implicit class ExpectDefaultOptionsOps[Self <: ExpectDefaultOptions] (val x: Self) extends AnyVal {
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
    def setPolling(value: ExpectPolling): Self = this.set("polling", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolling: Self = this.set("polling", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

