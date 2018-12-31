package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for parameters related to inserting or changing media elements in the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorChangeMediaElementCommandArguments extends ASPxClientHtmlEditorCommandArguments {
  /**
    * Determines the position of the target media element.
    * Value: A string value indicating the position of the target media element.
    */
  var align: java.lang.String
  /**
    * Defines the <a href="http://www.w3schools.com/tags/att_global_id.asp">HTML "id"</a> attribute of the target media element.
    * Value: A string value which is a unique identifier for the element.
    */
  var id: java.lang.String
  /**
    * Defines the source of the target media element.
    * Value: A string defining the source of the target media element.
    */
  var src: java.lang.String
  /**
    * Contains the style settings defining the appearance of the target media element.
    * Value: An <see cref="ASPxClientHtmlEditorCommandStyleSettings" /> object that contains the style settings defining the appearance of the target media element.
    */
  var styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  /**
    * Returns the name of the client-side command corresponding to the parameter.
    */
  def GetCommandName(): java.lang.String
}

