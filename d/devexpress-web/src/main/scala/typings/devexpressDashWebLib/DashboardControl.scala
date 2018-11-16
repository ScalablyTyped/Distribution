package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A client-side part of the Web Dashboard.
 */
@js.native
trait DashboardControl extends js.Object {
  /**
       * Gets or sets knockout templates that you can use in the Web Dashboard.
       * Value: A <see cref="KnockoutObservableArray" /> object that is a knockout template collection.
       */
  var customTemplates: knockoutLib.KnockoutObservableArray[_] = js.native
  /**
       * Provides an access to the collection of registered dashboard extensions.
       * Value: An array of IExtension objects that are dashboard extensions.
       */
  var extensions: js.Array[IExtension] = js.native
  /**
       * Allows you to get access to the extension.
       * @param extensionName A string value that is the dashboard extension name.
       */
  def findExtension(extensionName: java.lang.String): IExtension = js.native
  /**
       * Initializes a new dashboard with the specified name and JSON model.
       * @param id A string value that is a unique name of the created dashboard.
       * @param dashboardJson A dashboard model encoded in the specified JSON string.
       */
  def initializeDashboard(id: java.lang.String, dashboardJson: java.lang.String): scala.Unit = js.native
  /**
       * Initializes a new dashboard with the specified name, JSON model and initial state.
       * @param id A string value that is a unique name of the created dashboard.
       * @param dashboardJson A dashboard model encoded in the specified JSON string.
       * @param initialState A JSON object that specifies the  dashboard state.
       */
  def initializeDashboard(id: java.lang.String, dashboardJson: java.lang.String, initialState: js.Object): scala.Unit = js.native
  /**
       * Allows you to register a dashboard extension to add its functionality to the Web Dashboard.
       * @param extension An IExtension object that is a dashboard extension.
       */
  def registerExtension(extension: IExtension): scala.Unit = js.native
  /**
       * Allows you to unregister a dashboard extension to disable its functionality in the Web Dashboard.
       * @param extensionName A string value that is a dashboard extension name.
       */
  def unregisterExtension(extensionName: java.lang.String): scala.Unit = js.native
}

