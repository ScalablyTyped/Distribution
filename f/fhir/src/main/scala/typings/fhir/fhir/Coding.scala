package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a code defined by a terminology system
  */
@js.native
trait Coding extends Element {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'userSelected'.
    */
  var _userSelected: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  /**
    * Symbol in syntax defined by the system
    */
  var code: js.UndefOr[typings.fhir.fhir.code] = js.native
  /**
    * Representation defined by the system
    */
  var display: js.UndefOr[String] = js.native
  /**
    * Identity of the terminology system
    */
  var system: js.UndefOr[uri] = js.native
  /**
    * If this coding was chosen directly by the user
    */
  var userSelected: js.UndefOr[Boolean] = js.native
  /**
    * Version of the system - if relevant
    */
  var version: js.UndefOr[String] = js.native
}

object Coding {
  @scala.inline
  def apply(): Coding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Coding]
  }
  @scala.inline
  implicit class CodingOps[Self <: Coding] (val x: Self) extends AnyVal {
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
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    @scala.inline
    def set_display(value: Element): Self = this.set("_display", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_display: Self = this.set("_display", js.undefined)
    @scala.inline
    def set_system(value: Element): Self = this.set("_system", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_system: Self = this.set("_system", js.undefined)
    @scala.inline
    def set_userSelected(value: Element): Self = this.set("_userSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_userSelected: Self = this.set("_userSelected", js.undefined)
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    @scala.inline
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setSystem(value: uri): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
    @scala.inline
    def setUserSelected(value: Boolean): Self = this.set("userSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserSelected: Self = this.set("userSelected", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

