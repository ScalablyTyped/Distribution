package typings
package expressDashOpenapiLib.expressDashOpenapiMod.OpenApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagObject extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  var name: java.lang.String
}

object TagObject {
  @scala.inline
  def apply(
    name: java.lang.String,
    description: java.lang.String = null,
    externalDocs: ExternalDocumentationObject = null
  ): TagObject = {
    val __obj = js.Dynamic.literal(name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs)
    __obj.asInstanceOf[TagObject]
  }
}

