package typings.extjs.Ext.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFeature extends js.Object {
  /** [Property] (String) */
  var abstractsummary: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var feature: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var grouping: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var groupingsummary: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var rowbody: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var summary: js.UndefOr[java.lang.String] = js.undefined
}

object IFeature {
  @scala.inline
  def apply(
    abstractsummary: java.lang.String = null,
    feature: java.lang.String = null,
    grouping: java.lang.String = null,
    groupingsummary: java.lang.String = null,
    rowbody: java.lang.String = null,
    summary: java.lang.String = null
  ): IFeature = {
    val __obj = js.Dynamic.literal()
    if (abstractsummary != null) __obj.updateDynamic("abstractsummary")(abstractsummary)
    if (feature != null) __obj.updateDynamic("feature")(feature)
    if (grouping != null) __obj.updateDynamic("grouping")(grouping)
    if (groupingsummary != null) __obj.updateDynamic("groupingsummary")(groupingsummary)
    if (rowbody != null) __obj.updateDynamic("rowbody")(rowbody)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[IFeature]
  }
}

