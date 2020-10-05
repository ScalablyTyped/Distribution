package typings.expoWebBrowser.webBrowserTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceActionResult extends js.Object {
  var servicePackage: js.UndefOr[String] = js.native
}

object ServiceActionResult {
  @scala.inline
  def apply(): ServiceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceActionResult]
  }
  @scala.inline
  implicit class ServiceActionResultOps[Self <: ServiceActionResult] (val x: Self) extends AnyVal {
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
    def setServicePackage(value: String): Self = this.set("servicePackage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServicePackage: Self = this.set("servicePackage", js.undefined)
  }
  
}

