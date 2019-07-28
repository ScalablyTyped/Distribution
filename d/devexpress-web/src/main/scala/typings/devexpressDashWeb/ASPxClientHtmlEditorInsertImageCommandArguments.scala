package typings.devexpressDashWeb

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
  var align: String
  /**
    * Creates an alternate text for the target image.
    * Value: A string that specifies an alternate text for the target image.
    */
  var alt: String
  /**
    * Specifies the source of the target image.
    * Value: A string specifying the source of the target image.
    */
  var src: String
  /**
    * Contains the style settings specifying the appearance of the target image.
    * Value: An <see cref="ASPxClientHtmlEditorCommandStyleSettings" /> object that contains the style settings specifying the appearance of the target image.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  /**
    * Determines if the target image is wrapped with text.
    * Value: true, if the target image is wrapped with text; otherwise, false.
    */
  var useFloat: Boolean
}

object ASPxClientHtmlEditorInsertImageCommandArguments {
  @scala.inline
  def apply(
    align: String,
    alt: String,
    selectedElement: js.Object,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    useFloat: Boolean
  ): ASPxClientHtmlEditorInsertImageCommandArguments = {
    val __obj = js.Dynamic.literal(align = align, alt = alt, selectedElement = selectedElement, src = src, styleSettings = styleSettings, useFloat = useFloat)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertImageCommandArguments]
  }
}

