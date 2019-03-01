package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the TABLEPROPERTIES_DIALOG_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorTablePropertiesCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Determines the position of the target table element.
    * Value: A string value indicating the position of the target table element.
    */
  var align: java.lang.String
  /**
    * Gets or sets a value that is the table caption.
    * Value: A string value that is the caption.
    */
  var caption: java.lang.String
  /**
    * Gets or sets a table cell padding.
    * Value: An integer value that is the cell padding.
    */
  var cellPadding: scala.Double
  /**
    * Gets or sets the table cell spacing.
    * Value: An integer value that is the table cell spacing.
    */
  var cellSpacing: scala.Double
  /**
    * Gets or sets a value indicating whether the first row/column serves as the table's header.
    * Value: A string value that specifies whether the first row/column serves as the table's header.
    */
  var headers: java.lang.String
  /**
    * Contains the style settings defining the appearance of the target table element.
    * Value: An <see cref="ASPxClientHtmlEditorCommandStyleSettings" /> object that contains the style settings defining the appearance of the target table element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  /**
    * Gets or sets the table's summary.
    * Value: A string value that is the table's summary.
    */
  var summary: java.lang.String
}

object ASPxClientHtmlEditorTablePropertiesCommandArguments {
  @scala.inline
  def apply(
    align: java.lang.String,
    caption: java.lang.String,
    cellPadding: scala.Double,
    cellSpacing: scala.Double,
    headers: java.lang.String,
    selectedElement: js.Object,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    summary: java.lang.String
  ): ASPxClientHtmlEditorTablePropertiesCommandArguments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("align")(align)
    __obj.updateDynamic("caption")(caption)
    __obj.updateDynamic("cellPadding")(cellPadding)
    __obj.updateDynamic("cellSpacing")(cellSpacing)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("selectedElement")(selectedElement)
    __obj.updateDynamic("styleSettings")(styleSettings)
    __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[ASPxClientHtmlEditorTablePropertiesCommandArguments]
  }
}

