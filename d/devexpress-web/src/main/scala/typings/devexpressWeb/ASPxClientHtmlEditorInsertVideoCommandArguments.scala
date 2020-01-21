package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTVIDEO_COMMAND command parameter.
  */
@JSGlobal("ASPxClientHtmlEditorInsertVideoCommandArguments")
@js.native
class ASPxClientHtmlEditorInsertVideoCommandArguments protected () extends ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments {
  def this(htmlEditor: ASPxClientHtmlEditor) = this()
  def this(htmlEditor: ASPxClientHtmlEditor, elementToReplace: js.Any) = this()
  /**
    * Defines the URL of an image that is shown while the video file is downloading, or until an end-user clicks the play button.
    */
  var posterUrl: String = js.native
}

