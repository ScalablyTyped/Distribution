package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fix use of a code system to a particular version
  */
@js.native
trait ExpansionProfileFixedVersion extends BackboneElement {
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  /**
    * default | check | override
    */
  var mode: code = js.native
  /**
    * System to have its version fixed
    */
  var system: uri = js.native
  /**
    * Specific version of the code system referred to
    */
  var version: String = js.native
}

object ExpansionProfileFixedVersion {
  @scala.inline
  def apply(mode: code, system: uri, version: String): ExpansionProfileFixedVersion = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpansionProfileFixedVersion]
  }
  @scala.inline
  implicit class ExpansionProfileFixedVersionOps[Self <: ExpansionProfileFixedVersion] (val x: Self) extends AnyVal {
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
    def setMode(value: code): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystem(value: uri): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def set_mode(value: Element): Self = this.set("_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_mode: Self = this.set("_mode", js.undefined)
    @scala.inline
    def set_system(value: Element): Self = this.set("_system", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_system: Self = this.set("_system", js.undefined)
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
  }
  
}

