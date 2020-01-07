package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message representing a single field of a struct.
  */
@js.native
trait Schema$Field extends js.Object {
  /**
    * The name of the field. For reads, this is the column name. For SQL
    * queries, it is the column alias (e.g., `&quot;Word&quot;` in the query
    * `&quot;SELECT &#39;hello&#39; AS Word&quot;`), or the column name (e.g.,
    * `&quot;ColName&quot;` in the query `&quot;SELECT ColName FROM
    * Table&quot;`). Some columns might have an empty name (e.g., !&quot;SELECT
    * UPPER(ColName)&quot;`). Note that a query result can contain multiple
    * fields with the same name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the field.
    */
  var `type`: js.UndefOr[Schema$Type] = js.native
}

object Schema$Field {
  @scala.inline
  def apply(name: String = null, `type`: Schema$Type = null): Schema$Field = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Field]
  }
}

