package typings.gapiDotClientDotPeople.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tagline extends js.Object {
  /** Metadata about the tagline. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The tagline. */
  var value: js.UndefOr[String] = js.undefined
}

object Tagline {
  @scala.inline
  def apply(metadata: FieldMetadata = null, value: String = null): Tagline = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Tagline]
  }
}

