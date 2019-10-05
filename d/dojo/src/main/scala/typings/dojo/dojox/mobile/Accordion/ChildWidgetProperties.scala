package typings.dojo.dojox.mobile.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Accordion.ChildWidgetProperties.html
  *
  * These properties can be specified for the children of a dojox/mobile/Accordion.
  *
  */
trait ChildWidgetProperties extends js.Object {
  /**
    * The alternate text of the Accordion title.
    *
    */
  var alt: String
  /**
    * The unselected icon of the Accordion title.
    *
    */
  var icon1: String
  /**
    * The selected icon of the Accordion title.
    *
    */
  var icon2: String
  /**
    * The position ("top,left,width,height") of the unselected aggregated icon of the Accordion title.
    *
    */
  var iconPos1: String
  /**
    * The position ("top,left,width,height") of the selected aggregated icon of the Accordion title.
    *
    */
  var iconPos2: String
  /**
    * The label of the Accordion title.
    *
    */
  var label: String
  /**
    * Specifies that the Accordion child must be lazily loaded.
    *
    */
  var `lazy`: Boolean
  /**
    * The selected state of the Accordion title.
    *
    */
  var selected: Boolean
}

object ChildWidgetProperties {
  @scala.inline
  def apply(
    alt: String,
    icon1: String,
    icon2: String,
    iconPos1: String,
    iconPos2: String,
    label: String,
    `lazy`: Boolean,
    selected: Boolean
  ): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(alt = alt, icon1 = icon1, icon2 = icon2, iconPos1 = iconPos1, iconPos2 = iconPos2, label = label, selected = selected)
    __obj.updateDynamic("lazy")(`lazy`)
    __obj.asInstanceOf[ChildWidgetProperties]
  }
}

