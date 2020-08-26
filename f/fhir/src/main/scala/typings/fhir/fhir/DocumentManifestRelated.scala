package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Related things
  */
@js.native
trait DocumentManifestRelated extends BackboneElement {
  /**
    * Identifiers of things that are related
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Related Resource
    */
  var ref: js.UndefOr[Reference] = js.native
}

object DocumentManifestRelated {
  @scala.inline
  def apply(): DocumentManifestRelated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentManifestRelated]
  }
  @scala.inline
  implicit class DocumentManifestRelatedOps[Self <: DocumentManifestRelated] (val x: Self) extends AnyVal {
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
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setRef(value: Reference): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
  }
  
}

