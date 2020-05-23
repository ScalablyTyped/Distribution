package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.CustomButtonClick event.
  */
trait ASPxClientTreeListCustomButtonEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the value which identifies the custom button.
    */
  var buttonID: String
  /**
    * Gets the button's index.
    */
  var buttonIndex: Double
  /**
    * Gets the key value of the node whose custom button has been clicked.
    */
  var nodeKey: String
}

object ASPxClientTreeListCustomButtonEventArgs {
  @scala.inline
  def apply(buttonID: String, buttonIndex: Double, nodeKey: String): ASPxClientTreeListCustomButtonEventArgs = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], buttonIndex = buttonIndex.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListCustomButtonEventArgs]
  }
}

