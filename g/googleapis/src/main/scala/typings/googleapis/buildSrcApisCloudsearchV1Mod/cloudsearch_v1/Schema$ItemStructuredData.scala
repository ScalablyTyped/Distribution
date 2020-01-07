package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available structured data fields for the item.
  */
@js.native
trait Schema$ItemStructuredData extends js.Object {
  /**
    * Hashing value provided by the API caller. This can be used with the
    * items.push method to calculate modified state. The maximum length is 2048
    * characters.
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * The structured data object that should conform to a registered object
    * definition in the schema for the data source.
    */
  var `object`: js.UndefOr[Schema$StructuredDataObject] = js.native
}

object Schema$ItemStructuredData {
  @scala.inline
  def apply(hash: String = null, `object`: Schema$StructuredDataObject = null): Schema$ItemStructuredData = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ItemStructuredData]
  }
}

