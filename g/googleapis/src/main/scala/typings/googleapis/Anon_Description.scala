package typings.googleapis

import typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Schema$QueryParameterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Description extends js.Object {
  var description: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[Schema$QueryParameterType] = js.native
}

object Anon_Description {
  @scala.inline
  def apply(description: String = null, name: String = null, `type`: Schema$QueryParameterType = null): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Description]
  }
}

