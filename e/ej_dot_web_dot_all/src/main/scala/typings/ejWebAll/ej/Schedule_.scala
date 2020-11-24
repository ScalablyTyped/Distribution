package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule_ extends Widget_ {
  
  /** It is used to add the resources dynamically in the scheduler. It renders the resource based on the index if it is available or else it renders this resource at end of all
    * resources.
    * @param {any} Resource object which can be defined with all the available options of resources.
    * @param {string} Defines the name of the resource collection to which this object needs to be added.
    * @param {number} It is optional. If it is available, this render the resource at the given specified index location. Else render at end of the all resources.
    * @returns {void}
    */
  def addResource(resourceObject: js.Any, name: String, index: Double): Unit = js.native
  
  var defaults: typings.ejWebAll.ej.Schedule.Model = js.native
  
  /** This method is used to delete the appointment based on the guid value or the appointment data passed to it.
    * @param {string|any} GUID value of an appointment element or an appointment object
    * @returns {void}
    */
  def deleteAppointment(data: String): Unit = js.native
  def deleteAppointment(data: js.Any): Unit = js.native
  
  /** Exports the appointments from the Schedule control.
    * @param {string} It refers the controller action name to redirect. (For MVC)
    * @param {string} It refers the server event name.(For ASP)
    * @param {string|number} Pass the id of an appointment, in case if a single appointment needs to be exported. Otherwise, it takes the null value.
    * @returns {void}
    */
  def exportSchedule(action: String, serverEvent: String, id: String): Unit = js.native
  def exportSchedule(action: String, serverEvent: String, id: Double): Unit = js.native
  
  /** Exports the appointments from the Schedule control and saves it in a Excel file.
    * @param {string} It refers the controller action name to redirect. (For MVC)
    * @param {string} It refers the server event name.(For ASP)
    * @param {boolean} Indicates whether to export all the appointments including or excluding the individual occurrences of the recurrence appointments.
    * @returns {void}
    */
  def exportToExcel(action: String, serverEvent: String, `type`: Boolean): Unit = js.native
  
  /** Searches and filters the appointments from appointment list of Schedule control.
    * @param {any[]} Holds array of one or more conditional objects for filtering the appointments based on it.
    * @returns {any[]}
    */
  def filterAppointments(filterConditions: js.Array[_]): js.Array[_] = js.native
  
  /** Gets the complete appointment list of Schedule control.
    * @returns {any[]}
    */
  def getAppointments(): js.Array[_] = js.native
  
  /** Generate the recurrence rule as a string, based on the repeat options selected.
    * @returns {string}
    */
  def getRecurrenceRule(): String = js.native
  
  /** Retrieves the time slot information (start/end time and resource details) of the given element. The parameter is optional - as when no element is passed to it, the currently
    * selected cell information will be retrieved. When multiple cells are selected in the Scheduler, it is not necessary to provide the parameter.
    * @param {any} TD element object rendered as Scheduler work cell
    * @returns {any}
    */
  def getSlotByElement(element: js.Any): js.Any = js.native
  
  @JSName("model")
  var model_Schedule_ : typings.ejWebAll.ej.Schedule.Model = js.native
  
  /** Passes the server-side action and data to the client-side for rendering the modified appointment list on the Schedule control.
    * @returns {void}
    */
  def notifyChanges(): Unit = js.native
  
  /** Prints the entire Scheduler or a single appointment based on the appointment data passed as an argument to it. Simply calling the print() method, without passing any argument will
    * print the entire Scheduler.
    * @param {any} Either accepts no arguments at all or else accepts an appointment object.
    * @returns {void}
    */
  def print(data: js.Any): Unit = js.native
  
  /** Refreshes the entire Schedule control.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** Refreshes only the appointment elements within the Schedule control.
    * @returns {void}
    */
  def refreshAppointments(): Unit = js.native
  
  /** Refreshes the Scroller of Scheduler while using it within some other controls or application.
    * @returns {void}
    */
  def refreshScroller(): Unit = js.native
  
  /** It is used to remove the resources dynamically from the scheduler. It removed the resource based on the resource id with the given resource collection name.
    * @param {string|number} Defines the Id of the resource.
    * @param {string} Defines the name of the resource collection which this resource id belongs.
    * @returns {void}
    */
  def removeResource(resourceId: String, name: String): Unit = js.native
  def removeResource(resourceId: Double, name: String): Unit = js.native
  
  /** It is used to save the appointment. The appointment object is based on the argument passed to this method.
    * @param {any} appointment object which includes appointment details
    * @returns {void}
    */
  def saveAppointment(appointmentObject: js.Any): Unit = js.native
  
  def searchAppointments(searchString: String, field: String, operator: String, ignoreCase: Boolean): js.Array[_] = js.native
  def searchAppointments(searchString: String, field: String, operator: FilterOperators, ignoreCase: Boolean): js.Array[_] = js.native
  def searchAppointments(searchString: js.Any, field: String, operator: String, ignoreCase: Boolean): js.Array[_] = js.native
  /** Searches the appointments from the appointment list of Schedule control based on the provided search string in its argument list.
    * @param {any|string} Defines the search word or the filter condition, based on which the appointments are filtered from the list.
    * @param {string} Defines the field name on which the search is to be made.
    * @param {ej.FilterOperators|string} Defines the filterOperator value for the search operation.
    * @param {boolean} Defines the ignoreCase value for performing the search operation.
    * @returns {any[]}
    */
  def searchAppointments(searchString: js.Any, field: String, operator: FilterOperators, ignoreCase: Boolean): js.Array[_] = js.native
}
