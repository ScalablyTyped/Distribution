package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource with narrative, extensions, and contained resources
  */
@js.native
trait DomainResource
  extends ResourceBase
     with Resource {
  /**
    * Contained, inline Resources
    */
  var contained: js.UndefOr[js.Array[Resource]] = js.native
  /**
    * Additional Content defined by implementations
    */
  var extension: js.UndefOr[js.Array[Extension]] = js.native
  /**
    * Extensions that cannot be ignored
    */
  var modifierExtension: js.UndefOr[js.Array[Extension]] = js.native
  /**
    * Text summary of the resource, for human interpretation
    */
  var text: js.UndefOr[Narrative] = js.native
}

object DomainResource {
  @scala.inline
  def apply(): DomainResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainResource]
  }
  @scala.inline
  implicit class DomainResourceOps[Self <: DomainResource] (val x: Self) extends AnyVal {
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
    def setContainedVarargs(value: Resource*): Self = this.set("contained", js.Array(value :_*))
    @scala.inline
    def setContained(value: js.Array[Resource]): Self = this.set("contained", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContained: Self = this.set("contained", js.undefined)
    @scala.inline
    def setExtensionVarargs(value: Extension*): Self = this.set("extension", js.Array(value :_*))
    @scala.inline
    def setExtension(value: js.Array[Extension]): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setModifierExtensionVarargs(value: Extension*): Self = this.set("modifierExtension", js.Array(value :_*))
    @scala.inline
    def setModifierExtension(value: js.Array[Extension]): Self = this.set("modifierExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifierExtension: Self = this.set("modifierExtension", js.undefined)
    @scala.inline
    def setText(value: Narrative): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

