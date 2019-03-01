package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Department extends js.Object {
  /** The department within the organization. Deprecated. */
  var department: js.UndefOr[java.lang.String] = js.undefined
  /** A short description of the person's role in this organization. Deprecated. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The date that the person left this organization. */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /** The location of this organization. Deprecated. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the organization. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** If "true", indicates this organization is the person's primary one, which is typically interpreted as the current one. */
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  /** The date that the person joined this organization. */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
  /** The person's job title or role within the organization. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of organization. Possible values include, but are not limited to, the following values:
    * - "work" - Work.
    * - "school" - School.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Department {
  @scala.inline
  def apply(
    department: java.lang.String = null,
    description: java.lang.String = null,
    endDate: java.lang.String = null,
    location: java.lang.String = null,
    name: java.lang.String = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    startDate: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_Department = {
    val __obj = js.Dynamic.literal()
    if (department != null) __obj.updateDynamic("department")(department)
    if (description != null) __obj.updateDynamic("description")(description)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Department]
  }
}

