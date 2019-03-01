package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the INSERTIMAGE_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertImageCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Determines the position of the target image.
    * Value: A string value defining the position of the target image.
    */
  var align: java.lang.String
  /**
    * Creates an alternate text for the target image.
    * Value: A string that specifies an alternate text for the target image.
    */
  var alt: java.lang.String
  /**
    * Specifies the source of the target image.
    * Value: A string specifying the source of the target image.
    */
  var src: java.lang.String
  /**
    * Contains the style settings specifying the appearance of the target image.
    * Value: An <see cref="ASPxClientHtmlEditorCommandStyleSettings" /> object that contains the style settings specifying the appearance of the target image.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  /**
    * Determines if the target image is wrapped with text.
    * Value: true, if the target image is wrapped with text; otherwise, false.
    */
  var useFloat: scala.Boolean
}

object ASPxClientHtmlEditorInsertImageCommandArguments {
  @scala.inline
  def apply(
    align: java.lang.String,
    alt: java.lang.String,
    selectedElement: js.Object,
    src: java.lang.String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    useFloat: scala.Boolean
  ): ASPxClientHtmlEditorInsertImageCommandArguments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("align")(align)
    __obj.updateDynamic("alt")(alt)
    __obj.updateDynamic("selectedElement")(selectedElement)
    __obj.updateDynamic("src")(src)
    __obj.updateDynamic("styleSettings")(styleSettings)
    __obj.updateDynamic("useFloat")(useFloat)
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertImageCommandArguments]
  }
}

