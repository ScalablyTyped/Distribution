package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.CustomButtonClick event.
  */
@JSGlobal("ASPxClientTreeListCustomButtonEventArgs")
@js.native
class ASPxClientTreeListCustomButtonEventArgs ()
  extends typings.devexpressWeb.ASPxClientTreeListCustomButtonEventArgs {
  /**
    * Gets the value which identifies the custom button.
    */
  /* CompleteClass */
  override var buttonID: String = js.native
  /**
    * Gets the button's index.
    */
  /* CompleteClass */
  override var buttonIndex: Double = js.native
  /**
    * Gets the key value of the node whose custom button has been clicked.
    */
  /* CompleteClass */
  override var nodeKey: String = js.native
}

