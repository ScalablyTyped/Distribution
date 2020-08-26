package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * External repository which contains detailed report related with observedSeq in this resource
  */
@js.native
trait SequenceRepository extends BackboneElement {
  /**
    * Contains extended information for property 'datasetId'.
    */
  var _datasetId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'readsetId'.
    */
  var _readsetId: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'variantsetId'.
    */
  var _variantsetId: js.UndefOr[Element] = js.native
  /**
    * Id of the dataset that used to call for dataset in repository
    */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * Repository's name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Id of the read
    */
  var readsetId: js.UndefOr[String] = js.native
  /**
    * directlink | openapi | login | oauth | other
    */
  var `type`: code = js.native
  /**
    * URI of the repository
    */
  var url: js.UndefOr[uri] = js.native
  /**
    * Id of the variantset that used to call for variantset in repository
    */
  var variantsetId: js.UndefOr[String] = js.native
}

object SequenceRepository {
  @scala.inline
  def apply(`type`: code): SequenceRepository = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceRepository]
  }
  @scala.inline
  implicit class SequenceRepositoryOps[Self <: SequenceRepository] (val x: Self) extends AnyVal {
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
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_datasetId(value: Element): Self = this.set("_datasetId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_datasetId: Self = this.set("_datasetId", js.undefined)
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    @scala.inline
    def set_readsetId(value: Element): Self = this.set("_readsetId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_readsetId: Self = this.set("_readsetId", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    @scala.inline
    def set_variantsetId(value: Element): Self = this.set("_variantsetId", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_variantsetId: Self = this.set("_variantsetId", js.undefined)
    @scala.inline
    def setDatasetId(value: String): Self = this.set("datasetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetId: Self = this.set("datasetId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReadsetId(value: String): Self = this.set("readsetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadsetId: Self = this.set("readsetId", js.undefined)
    @scala.inline
    def setUrl(value: uri): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVariantsetId(value: String): Self = this.set("variantsetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariantsetId: Self = this.set("variantsetId", js.undefined)
  }
  
}

