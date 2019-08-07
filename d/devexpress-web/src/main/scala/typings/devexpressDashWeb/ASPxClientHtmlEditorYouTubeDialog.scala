package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the YouTube Video dialog within the ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorYouTubeDialog")
@js.native
class ASPxClientHtmlEditorYouTubeDialog () extends ASPxClientHtmlEditorEditElementDialog {
  /**
    * Provides access to the client object of the "Allow fullscreen" check box in the Html Editor's "Insert YouTube Video" dialog.
    */
  def GetAllowFullscreenCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Enable privacy-enhanced mode" check box in the Html Editor's YouTube Video dialog.
    */
  def GetConfidentModeCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Show player controls" check box in the Html Editor's YouTube Video dialog.
    */
  def GetShowPlayerControlsCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Show suggested videos when the video finishes" check box in the Html Editor's YouTube Video dialog.
    */
  def GetShowSameVideosCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Show video title and player actions" check box in the Html Editor's YouTube Video dialog.
    */
  def GetShowVideoNameCheckBox(): ASPxClientCheckBox = js.native
}

