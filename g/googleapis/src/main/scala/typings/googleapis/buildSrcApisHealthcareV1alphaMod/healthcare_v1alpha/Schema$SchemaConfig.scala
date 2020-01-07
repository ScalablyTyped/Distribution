package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for the FHIR BigQuery schema. Determines how the server
  * generates the schema.
  */
@js.native
trait Schema$SchemaConfig extends js.Object {
  /**
    * The depth for all recursive structures in the output analytics schema.
    * For example, concept in the CodeSystem resource is a recursive structure;
    * when the depth is 2, the CodeSystem table will have a column called
    * `concept.concept` but not `concept.concept.concept`. If not specified or
    * set to 0, the server will use the default value 2.
    */
  var recursiveStructureDepth: js.UndefOr[String] = js.native
  /**
    * Specifies the output schema type. If unspecified, the default is
    * `LOSSLESS`.
    */
  var schemaType: js.UndefOr[String] = js.native
}

object Schema$SchemaConfig {
  @scala.inline
  def apply(recursiveStructureDepth: String = null, schemaType: String = null): Schema$SchemaConfig = {
    val __obj = js.Dynamic.literal()
    if (recursiveStructureDepth != null) __obj.updateDynamic("recursiveStructureDepth")(recursiveStructureDepth.asInstanceOf[js.Any])
    if (schemaType != null) __obj.updateDynamic("schemaType")(schemaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SchemaConfig]
  }
}

