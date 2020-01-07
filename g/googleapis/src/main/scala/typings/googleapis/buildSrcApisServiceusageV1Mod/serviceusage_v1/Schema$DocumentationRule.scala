package typings.googleapis.buildSrcApisServiceusageV1Mod.serviceusage_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A documentation rule provides information about individual API elements.
  */
@js.native
trait Schema$DocumentationRule extends js.Object {
  /**
    * Deprecation description of the selected element(s). It can be provided if
    * an element is marked as `deprecated`.
    */
  var deprecationDescription: js.UndefOr[String] = js.native
  /**
    * Description of the selected API(s).
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The selector is a comma-separated list of patterns. Each pattern is a
    * qualified name of the element which may end in &quot;*&quot;, indicating
    * a wildcard. Wildcards are only allowed at the end and for a whole
    * component of the qualified name, i.e. &quot;foo.*&quot; is ok, but not
    * &quot;foo.b*&quot; or &quot;foo.*.bar&quot;. A wildcard will match one or
    * more components. To specify a default for all applicable elements, the
    * whole pattern &quot;*&quot; is used.
    */
  var selector: js.UndefOr[String] = js.native
}

object Schema$DocumentationRule {
  @scala.inline
  def apply(deprecationDescription: String = null, description: String = null, selector: String = null): Schema$DocumentationRule = {
    val __obj = js.Dynamic.literal()
    if (deprecationDescription != null) __obj.updateDynamic("deprecationDescription")(deprecationDescription.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DocumentationRule]
  }
}

