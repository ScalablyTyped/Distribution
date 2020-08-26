package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract server representing a client or sender in a message exchange
  */
@js.native
trait TestScriptOrigin extends BackboneElement {
  /**
    * Contains extended information for property 'index'.
    */
  var _index: js.UndefOr[Element] = js.native
  /**
    * The index of the abstract origin server starting at 1
    */
  var index: integer = js.native
  /**
    * FHIR-Client | FHIR-SDC-FormFiller
    */
  var profile: Coding = js.native
}

object TestScriptOrigin {
  @scala.inline
  def apply(index: integer, profile: Coding): TestScriptOrigin = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptOrigin]
  }
  @scala.inline
  implicit class TestScriptOriginOps[Self <: TestScriptOrigin] (val x: Self) extends AnyVal {
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
    def setIndex(value: integer): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfile(value: Coding): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def set_index(value: Element): Self = this.set("_index", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_index: Self = this.set("_index", js.undefined)
  }
  
}

