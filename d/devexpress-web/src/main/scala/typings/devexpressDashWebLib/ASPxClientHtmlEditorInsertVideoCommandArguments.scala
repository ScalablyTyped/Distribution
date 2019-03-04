package typings
package devexpressDashWebLib

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
  var posterUrl: java.lang.String
}

object ASPxClientHtmlEditorInsertVideoCommandArguments {
  @scala.inline
  def apply(
    GetCommandName: js.Function0[java.lang.String],
    align: java.lang.String,
    autoPlay: scala.Boolean,
    id: java.lang.String,
    loop: scala.Boolean,
    posterUrl: java.lang.String,
    preloadMode: java.lang.String,
    selectedElement: js.Object,
    showPlayerControls: scala.Boolean,
    src: java.lang.String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorInsertVideoCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = GetCommandName, align = align, autoPlay = autoPlay, id = id, loop = loop, posterUrl = posterUrl, preloadMode = preloadMode, selectedElement = selectedElement, showPlayerControls = showPlayerControls, src = src, styleSettings = styleSettings)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertVideoCommandArguments]
  }
}

