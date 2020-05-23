package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTIMAGE_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertImageCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Determines the position of the target image.
    */
  var align: String
  /**
    * Creates an alternate text for the target image.
    */
  var alt: String
  /**
    * Specifies the source of the target image.
    */
  var src: String
  /**
    * Contains the style settings specifying the appearance of the target image.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  /**
    * Determines if the target image is wrapped with text.
    */
  var useFloat: Boolean
}

object ASPxClientHtmlEditorInsertImageCommandArguments {
  @scala.inline
  def apply(
    align: String,
    alt: String,
    selectedElement: js.Any,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings,
    useFloat: Boolean
  ): ASPxClientHtmlEditorInsertImageCommandArguments = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], alt = alt.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any], useFloat = useFloat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertImageCommandArguments]
  }
}

