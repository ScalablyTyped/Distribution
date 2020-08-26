package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure Definition used by this map
  */
@js.native
trait StructureMapStructure extends BackboneElement {
  /**
    * Contains extended information for property 'alias'.
    */
  var _alias: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  /**
    * Name for type in this map
    */
  var alias: js.UndefOr[String] = js.native
  /**
    * Documentation on use of structure
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * source | queried | target | produced
    */
  var mode: code = js.native
  /**
    * Canonical URL for structure definition
    */
  var url: uri = js.native
}

object StructureMapStructure {
  @scala.inline
  def apply(mode: code, url: uri): StructureMapStructure = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapStructure]
  }
  @scala.inline
  implicit class StructureMapStructureOps[Self <: StructureMapStructure] (val x: Self) extends AnyVal {
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
    def setUrl(value: uri): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def set_alias(value: Element): Self = this.set("_alias", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_alias: Self = this.set("_alias", js.undefined)
    @scala.inline
    def set_documentation(value: Element): Self = this.set("_documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_documentation: Self = this.set("_documentation", js.undefined)
    @scala.inline
    def set_mode(value: Element): Self = this.set("_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_mode: Self = this.set("_mode", js.undefined)
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
  }
  
}

