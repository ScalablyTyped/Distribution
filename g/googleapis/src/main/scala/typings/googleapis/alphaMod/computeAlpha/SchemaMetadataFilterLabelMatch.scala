package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MetadataFilter label name value pairs that are expected to match
  * corresponding labels presented as metadata to the loadbalancer.
  */
@js.native
trait SchemaMetadataFilterLabelMatch extends js.Object {
  /**
    * Name of metadata label. The name can have a maximum length of 1024
    * characters and must be at least 1 character long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the label must match the specified value. value can have a
    * maximum length of 1024 characters.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaMetadataFilterLabelMatch {
  @scala.inline
  def apply(name: String = null, value: String = null): SchemaMetadataFilterLabelMatch = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetadataFilterLabelMatch]
  }
}

