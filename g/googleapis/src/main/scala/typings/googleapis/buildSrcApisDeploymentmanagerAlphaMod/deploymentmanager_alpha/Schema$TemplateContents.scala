package typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Files that make up the template contents of a template type.
  */
@js.native
trait Schema$TemplateContents extends js.Object {
  /**
    * Import files referenced by the main template.
    */
  var imports: js.UndefOr[js.Array[Schema$ImportFile]] = js.native
  /**
    * Which interpreter (python or jinja) should be used during expansion.
    */
  var interpreter: js.UndefOr[String] = js.native
  /**
    * The filename of the mainTemplate
    */
  var mainTemplate: js.UndefOr[String] = js.native
  /**
    * The contents of the template schema.
    */
  var schema: js.UndefOr[String] = js.native
  /**
    * The contents of the main template file.
    */
  var template: js.UndefOr[String] = js.native
}

object Schema$TemplateContents {
  @scala.inline
  def apply(
    imports: js.Array[Schema$ImportFile] = null,
    interpreter: String = null,
    mainTemplate: String = null,
    schema: String = null,
    template: String = null
  ): Schema$TemplateContents = {
    val __obj = js.Dynamic.literal()
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (interpreter != null) __obj.updateDynamic("interpreter")(interpreter.asInstanceOf[js.Any])
    if (mainTemplate != null) __obj.updateDynamic("mainTemplate")(mainTemplate.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TemplateContents]
  }
}

