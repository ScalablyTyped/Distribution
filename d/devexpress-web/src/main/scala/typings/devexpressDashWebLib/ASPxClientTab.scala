package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of a tab control's TabPage object.
  */
trait ASPxClientTab extends js.Object {
  /**
    * Gets the index of the current tab (tabbed page) within the control's collection of tabs (tabbed pages).
    * Value: An integer value representing the zero-based index of the current tab (tabbed page) within the TabPages) collection of the control to which the tab belongs.
    */
  var index: scala.Double
  /**
    * Gets the name that uniquely identifies the current tab.
    * Value: A string value that represents the value assigned to the tab's Name property.
    */
  var name: java.lang.String
  /**
    * Gets the tab control to which the current tab belongs.
    * Value: An ASPxClientTabControlBase object representing the control to which the tab belongs.
    */
  var tabControl: ASPxClientTabControlBase
  /**
    * Returns the URL pointing to the image displayed within the active tab.
    */
  def GetActiveImageUrl(): java.lang.String
  /**
    * Returns a value specifying whether a tab is enabled.
    */
  def GetEnabled(): scala.Boolean
  /**
    * Returns the URL pointing to the image displayed within the tab.
    */
  def GetImageUrl(): java.lang.String
  /**
    * Gets an URL which defines the navigation location for the tab.
    */
  def GetNavigateUrl(): java.lang.String
  /**
    * Returns text displayed within the tab.
    */
  def GetText(): java.lang.String
  /**
    * Returns a value specifying whether a tab is displayed.
    */
  def GetVisible(): scala.Boolean
  /**
    * Specifies the URL which points to the image displayed within the active tab.
    * @param value A string value that is the URL to the image displayed within the active tab.
    */
  def SetActiveImageUrl(value: java.lang.String): scala.Unit
  /**
    * Specifies whether the tab is enabled.
    * @param value true to enable the tab; otherwise, false.
    */
  def SetEnabled(value: scala.Boolean): scala.Unit
  /**
    * Specifies the URL which points to the image displayed within the tab.
    * @param value A string value that is the URL to the image displayed within the tab.
    */
  def SetImageUrl(value: java.lang.String): scala.Unit
  /**
    * Specifies a URL which defines the navigation location for the tab.
    * @param value A string value which is a URL to where the client web browser will navigate when the tab is clicked.
    */
  def SetNavigateUrl(value: java.lang.String): scala.Unit
  /**
    * Specifies the text displayed within the tab.
    * @param value A string value that is the text displayed within the tab.
    */
  def SetText(value: java.lang.String): scala.Unit
  /**
    * Specifies whether the tab is visible.
    * @param value true is the tab is visible; otherwise, false.
    */
  def SetVisible(value: scala.Boolean): scala.Unit
}

object ASPxClientTab {
  @scala.inline
  def apply(
    GetActiveImageUrl: js.Function0[java.lang.String],
    GetEnabled: js.Function0[scala.Boolean],
    GetImageUrl: js.Function0[java.lang.String],
    GetNavigateUrl: js.Function0[java.lang.String],
    GetText: js.Function0[java.lang.String],
    GetVisible: js.Function0[scala.Boolean],
    SetActiveImageUrl: js.Function1[java.lang.String, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetImageUrl: js.Function1[java.lang.String, scala.Unit],
    SetNavigateUrl: js.Function1[java.lang.String, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    index: scala.Double,
    name: java.lang.String,
    tabControl: ASPxClientTabControlBase
  ): ASPxClientTab = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetActiveImageUrl")(GetActiveImageUrl)
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetImageUrl")(GetImageUrl)
    __obj.updateDynamic("GetNavigateUrl")(GetNavigateUrl)
    __obj.updateDynamic("GetText")(GetText)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("SetActiveImageUrl")(SetActiveImageUrl)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetImageUrl")(SetImageUrl)
    __obj.updateDynamic("SetNavigateUrl")(SetNavigateUrl)
    __obj.updateDynamic("SetText")(SetText)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("tabControl")(tabControl)
    __obj.asInstanceOf[ASPxClientTab]
  }
}

