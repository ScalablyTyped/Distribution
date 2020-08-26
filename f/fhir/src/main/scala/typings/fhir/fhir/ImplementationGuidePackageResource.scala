package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource in the implementation guide
  */
@js.native
trait ImplementationGuidePackageResource extends BackboneElement {
  /**
    * Contains extended information for property 'acronym'.
    */
  var _acronym: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'example'.
    */
  var _example: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sourceUri'.
    */
  var _sourceUri: js.UndefOr[Element] = js.native
  /**
    * Short code to identify the resource
    */
  var acronym: js.UndefOr[String] = js.native
  /**
    * Reason why included in guide
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If not an example, has its normal meaning
    */
  var example: Boolean = js.native
  /**
    * Resource this is an example of (if applicable)
    */
  var exampleFor: js.UndefOr[Reference] = js.native
  /**
    * Human Name for the resource
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Location of the resource
    */
  var sourceReference: js.UndefOr[Reference] = js.native
  /**
    * Location of the resource
    */
  var sourceUri: js.UndefOr[uri] = js.native
}

object ImplementationGuidePackageResource {
  @scala.inline
  def apply(example: Boolean): ImplementationGuidePackageResource = {
    val __obj = js.Dynamic.literal(example = example.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuidePackageResource]
  }
  @scala.inline
  implicit class ImplementationGuidePackageResourceOps[Self <: ImplementationGuidePackageResource] (val x: Self) extends AnyVal {
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
    def setExample(value: Boolean): Self = this.set("example", value.asInstanceOf[js.Any])
    @scala.inline
    def set_acronym(value: Element): Self = this.set("_acronym", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_acronym: Self = this.set("_acronym", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_example(value: Element): Self = this.set("_example", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_example: Self = this.set("_example", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_sourceUri(value: Element): Self = this.set("_sourceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sourceUri: Self = this.set("_sourceUri", js.undefined)
    @scala.inline
    def setAcronym(value: String): Self = this.set("acronym", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcronym: Self = this.set("acronym", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExampleFor(value: Reference): Self = this.set("exampleFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExampleFor: Self = this.set("exampleFor", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSourceReference(value: Reference): Self = this.set("sourceReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceReference: Self = this.set("sourceReference", js.undefined)
    @scala.inline
    def setSourceUri(value: uri): Self = this.set("sourceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceUri: Self = this.set("sourceUri", js.undefined)
  }
  
}

