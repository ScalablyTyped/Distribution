package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the navbar's NavBarItem object.
  */
@JSGlobal("ASPxClientNavBarItem")
@js.native
class ASPxClientNavBarItem ()
  extends typings.devexpressWeb.ASPxClientNavBarItem {
  /**
    * Gets the group to which the current item belongs.
    */
  /* CompleteClass */
  override var group: typings.devexpressWeb.ASPxClientNavBarGroup = js.native
  /**
    * Gets the item's index within a collection of a group's items.
    */
  /* CompleteClass */
  override var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the item.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Gets the navbar to which the current item belongs.
    */
  /* CompleteClass */
  override var navBar: typings.devexpressWeb.ASPxClientNavBar = js.native
  /**
    * Returns a value indicating whether an item is enabled.
    */
  /* CompleteClass */
  override def GetEnabled(): Boolean = js.native
  /**
    * Returns the URL which points to the image displayed within the item.
    */
  /* CompleteClass */
  override def GetImageUrl(): String = js.native
  /**
    * Gets an URL which defines the item's navigation location.
    */
  /* CompleteClass */
  override def GetNavigateUrl(): String = js.native
  /**
    * Returns text displayed within the item.
    */
  /* CompleteClass */
  override def GetText(): String = js.native
  /**
    * Returns a value specifying whether an item is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  /**
    * Specifies whether the item is enabled.
    * @param value true if the item is enabled; otherwise, false.
    */
  /* CompleteClass */
  override def SetEnabled(value: Boolean): Unit = js.native
  /**
    * Specifies the URL which points to the image displayed within the item.
    * @param value A string value that specifies the URL to the image displayed within the item.
    */
  /* CompleteClass */
  override def SetImageUrl(value: String): Unit = js.native
  /**
    * Specifies a URL which defines the item's navigation location.
    * @param value A string value which represents the URL to where the client web browser will navigate when the item is clicked.
    */
  /* CompleteClass */
  override def SetNavigateUrl(value: String): Unit = js.native
  /**
    * Specifies the text displayed within the item.
    * @param value A string value that represents the text displayed within the item.
    */
  /* CompleteClass */
  override def SetText(value: String): Unit = js.native
  /**
    * Specifies whether the item is visible.
    * @param value true is the item is visible; otherwise, false.
    */
  /* CompleteClass */
  override def SetVisible(value: Boolean): Unit = js.native
}

