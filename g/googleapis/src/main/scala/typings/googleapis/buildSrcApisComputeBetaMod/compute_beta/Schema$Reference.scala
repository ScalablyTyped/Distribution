package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a reference to a resource.
  */
@js.native
trait Schema$Reference extends js.Object {
  /**
    * [Output Only] Type of the resource. Always compute#reference for
    * references.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A description of the reference type with no implied semantics. Possible
    * values include:   - MEMBER_OF
    */
  var referenceType: js.UndefOr[String] = js.native
  /**
    * URL of the resource which refers to the target.
    */
  var referrer: js.UndefOr[String] = js.native
  /**
    * URL of the resource to which this reference points.
    */
  var target: js.UndefOr[String] = js.native
}

object Schema$Reference {
  @scala.inline
  def apply(kind: String = null, referenceType: String = null, referrer: String = null, target: String = null): Schema$Reference = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (referenceType != null) __obj.updateDynamic("referenceType")(referenceType.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Reference]
  }
}

