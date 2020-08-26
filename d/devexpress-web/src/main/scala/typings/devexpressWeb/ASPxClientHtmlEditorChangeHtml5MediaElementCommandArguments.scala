package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for parameters related to inserting or changing HTML5 media elements (Audio and Video) in the ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments extends ASPxClientHtmlEditorChangeMediaElementCommandArguments {
  /**
    * Determines if a media file will start playing automatically.
    */
  var autoPlay: Boolean = js.native
  /**
    * Determines if a media file repeats indefinitely, or stops when it reaches the last frame.
    */
  var loop: Boolean = js.native
  /**
    * Determines how a media file should be loaded when the page loads.
    */
  var preloadMode: String = js.native
  /**
    * Determines if the media player controls should be displayed.
    */
  var showPlayerControls: Boolean = js.native
}

object ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments {
  @scala.inline
  def apply(
    GetCommandName: () => String,
    align: String,
    autoPlay: Boolean,
    id: String,
    loop: Boolean,
    preloadMode: String,
    selectedElement: js.Any,
    showPlayerControls: Boolean,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = js.Any.fromFunction0(GetCommandName), align = align.asInstanceOf[js.Any], autoPlay = autoPlay.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], preloadMode = preloadMode.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], showPlayerControls = showPlayerControls.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorChangeHtml5MediaElementCommandArgumentsOps[Self <: ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreloadMode(value: String): Self = this.set("preloadMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowPlayerControls(value: Boolean): Self = this.set("showPlayerControls", value.asInstanceOf[js.Any])
  }
  
}

