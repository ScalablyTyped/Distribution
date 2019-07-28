package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the INSERTVIDEO_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertVideoCommandArguments extends ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments {
  /**
    * Defines the URL of an image that is shown while the video file is downloading, or until an end-user clicks the play button.
    * Value: A string value that specifies the poster image URL.
    */
  var posterUrl: String
}

object ASPxClientHtmlEditorInsertVideoCommandArguments {
  @scala.inline
  def apply(
    GetCommandName: () => String,
    align: String,
    autoPlay: Boolean,
    id: String,
    loop: Boolean,
    posterUrl: String,
    preloadMode: String,
    selectedElement: js.Object,
    showPlayerControls: Boolean,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorInsertVideoCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = js.Any.fromFunction0(GetCommandName), align = align, autoPlay = autoPlay, id = id, loop = loop, posterUrl = posterUrl, preloadMode = preloadMode, selectedElement = selectedElement, showPlayerControls = showPlayerControls, src = src, styleSettings = styleSettings)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertVideoCommandArguments]
  }
}

