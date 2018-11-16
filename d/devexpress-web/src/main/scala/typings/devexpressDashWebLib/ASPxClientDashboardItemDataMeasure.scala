package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Contains the measure metadata.
 */

trait ASPxClientDashboardItemDataMeasure extends js.Object {
  /**
       * Gets the data member that identifies the data source list used to provide data for the current measure.
       * Value: A string value that identifies the data source list used to provide data for the current measure.
       */
  var DataMember: java.lang.String
  /**
       * Gets the measure identifier.
       * Value: A string value that is the measure identifier.
       */
  var Id: java.lang.String
  /**
       * Gets the name of the measure.
       * Value: A string value that is the name of the measure.
       */
  var Name: java.lang.String
  /**
       * Gets the type of summary function calculated against the current measure.
       * Value: A string value that identifies the type of summary function calculated against the current measure.
       */
  var SummaryType: java.lang.String
  /**
       * Formats the specified value using format settings of the current measure.
       * @param value A value to be formatted.
       */
  def Format(value: js.Object): java.lang.String
}

