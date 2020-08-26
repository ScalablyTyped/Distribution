package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Profiles that apply globally
  */
@js.native
trait ImplementationGuideGlobal extends BackboneElement {
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Profile that all resources must conform to
    */
  var profile: Reference = js.native
  /**
    * Type this profiles applies to
    */
  var `type`: code = js.native
}

object ImplementationGuideGlobal {
  @scala.inline
  def apply(profile: Reference, `type`: code): ImplementationGuideGlobal = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuideGlobal]
  }
  @scala.inline
  implicit class ImplementationGuideGlobalOps[Self <: ImplementationGuideGlobal] (val x: Self) extends AnyVal {
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
    def setProfile(value: Reference): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
  }
  
}

