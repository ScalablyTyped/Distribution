package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * External repository which contains detailed report related with observedSeq in this resource
  */
trait SequenceRepository extends BackboneElement {
  /**
    * Contains extended information for property 'datasetId'.
    */
  var _datasetId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'readsetId'.
    */
  var _readsetId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'variantsetId'.
    */
  var _variantsetId: js.UndefOr[Element] = js.undefined
  /**
    * Id of the dataset that used to call for dataset in repository
    */
  var datasetId: js.UndefOr[String] = js.undefined
  /**
    * Repository's name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Id of the read
    */
  var readsetId: js.UndefOr[String] = js.undefined
  /**
    * directlink | openapi | login | oauth | other
    */
  var `type`: code
  /**
    * URI of the repository
    */
  var url: js.UndefOr[uri] = js.undefined
  /**
    * Id of the variantset that used to call for variantset in repository
    */
  var variantsetId: js.UndefOr[String] = js.undefined
}

object SequenceRepository {
  @scala.inline
  def apply(
    `type`: code,
    _datasetId: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    _readsetId: Element = null,
    _type: Element = null,
    _url: Element = null,
    _variantsetId: Element = null,
    datasetId: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    readsetId: String = null,
    url: uri = null,
    variantsetId: String = null
  ): SequenceRepository = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (_datasetId != null) __obj.updateDynamic("_datasetId")(_datasetId)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_readsetId != null) __obj.updateDynamic("_readsetId")(_readsetId)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (_variantsetId != null) __obj.updateDynamic("_variantsetId")(_variantsetId)
    if (datasetId != null) __obj.updateDynamic("datasetId")(datasetId)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (readsetId != null) __obj.updateDynamic("readsetId")(readsetId)
    if (url != null) __obj.updateDynamic("url")(url)
    if (variantsetId != null) __obj.updateDynamic("variantsetId")(variantsetId)
    __obj.asInstanceOf[SequenceRepository]
  }
}

