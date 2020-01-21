package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.CustomButtonClick event.
  */
@JSGlobal("ASPxClientTreeListCustomButtonEventArgs")
@js.native
class ASPxClientTreeListCustomButtonEventArgs () extends ASPxClientEventArgs {
  /**
    * Gets the value which identifies the custom button.
    */
  var buttonID: String = js.native
  /**
    * Gets the button's index.
    */
  var buttonIndex: Double = js.native
  /**
    * Gets the key value of the node whose custom button has been clicked.
    */
  var nodeKey: String = js.native
}

