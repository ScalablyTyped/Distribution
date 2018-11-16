package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BlockoutSettings extends js.Object {
  /** Binds the name of customStyle field in dataSource. It applies the custom CSS to the block intervals.
               * @Default {null}
               */
  var customStyle: js.UndefOr[java.lang.String] = js.undefined
  /** The dataSource option accepts either JSON object collection or DataManager (ej.DataManager) instance that contains Schedule block intervals.
               * @Default {[]}
               */
  var dataSource: js.UndefOr[js.Any | js.Array[_]] = js.undefined
  /** When set to true, enables the blockout option to be applied on the Scheduler cells.
               * @Default {false}
               */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Binds the name of endTime field in dataSource with the end time of block time interval. It indicates the date and time, when the block interval actually ends in the Scheduler.
               * @Default {null}
               */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Binds the name of groupId field in dataSource. Specifies the id of the resource group, to which the time intervals are needed to be blocked.
               * @Default {null}
               */
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  /** Binds the id field name in dataSource to the id of block time interval. It denotes the unique id assigned to each of the block records.
               * @Default {null}
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Binds the name of isAllDay field in dataSource. It indicates whether an entire day is blocked or not.
               * @Default {null}
               */
  var isAllDay: js.UndefOr[java.lang.String] = js.undefined
  /** Binds the name of isBlockAppointment field in dataSource. When set to true, disables the appointments that lies on the blocked area and restrict to perform CRUD operations in it.
               * @Default {null}
               */
  var isBlockAppointment: js.UndefOr[java.lang.String] = js.undefined
  /** It holds either the ej.Query() object or simply the query string that retrieves the specified records from the table.
               * @Default {null}
               */
  var query: js.UndefOr[java.lang.String] = js.undefined
  /** Binds the name of resourceId field in dataSource. Specifies the id of the resources, to which the time intervals are needed to be blocked.
               * @Default {null}
               */
  var resourceId: js.UndefOr[java.lang.String] = js.undefined
  /** Binds the name of startTime field in the dataSource with start time of block time interval. It indicates the date and time, when the block interval actually starts in the
               * Scheduler.
               * @Default {null}
               */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** Binds the name of subject field in the dataSource to block time Subject. Indicates the Subject or title that gets displayed on the Schedule block intervals.
               * @Default {null}
               */
  var subject: js.UndefOr[java.lang.String] = js.undefined
  /** Assign the table name from where the records are to be fetched for the Schedule.
               * @Default {null}
               */
  var tableName: js.UndefOr[java.lang.String] = js.undefined
  /** Template design that applies on the Schedule block intervals. All the field names that are mapped from dataSource to the appropriate field properties within the blockoutSettings
               * can be used within the template.
               * @Default {null}
               */
  var templateId: js.UndefOr[java.lang.String] = js.undefined
}

