package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Info extends js.Object {
  /**
    * Content Security Policy for the isolated world.
    */
  var csp: js.UndefOr[String] = js.native
  /**
    * Name for isolated world. Useful in devtools.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Security origin for the isolated world.
    */
  var securityOrigin: js.UndefOr[String] = js.native
}

object Info {
  @scala.inline
  def apply(): Info = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Info]
  }
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
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
    def setCsp(value: String): Self = this.set("csp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsp: Self = this.set("csp", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSecurityOrigin(value: String): Self = this.set("securityOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityOrigin: Self = this.set("securityOrigin", js.undefined)
  }
  
}

