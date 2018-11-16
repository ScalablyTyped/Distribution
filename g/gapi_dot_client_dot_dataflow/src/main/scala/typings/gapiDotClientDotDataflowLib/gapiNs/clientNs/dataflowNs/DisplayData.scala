package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DisplayData extends js.Object {
  /** Contains value if the data is of a boolean type. */
  var boolValue: js.UndefOr[scala.Boolean] = js.undefined
  /** Contains value if the data is of duration type. */
  var durationValue: js.UndefOr[java.lang.String] = js.undefined
  /** Contains value if the data is of float type. */
  var floatValue: js.UndefOr[scala.Double] = js.undefined
  /** Contains value if the data is of int64 type. */
  var int64Value: js.UndefOr[java.lang.String] = js.undefined
  /** Contains value if the data is of java class type. */
  var javaClassValue: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The key identifying the display data.
               * This is intended to be used as a label for the display data
               * when viewed in a dax monitoring system.
               */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** An optional label to display in a dax UI for the element. */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The namespace for the key. This is usually a class name or programming
               * language namespace (i.e. python module) which defines the display data.
               * This allows a dax monitoring system to specially handle the data
               * and perform custom rendering.
               */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A possible additional shorter value to display.
               * For example a java_class_name_value of com.mypackage.MyDoFn
               * will be stored with MyDoFn as the short_str_value and
               * com.mypackage.MyDoFn as the java_class_name value.
               * short_str_value can be displayed and java_class_name_value
               * will be displayed as a tooltip.
               */
  var shortStrValue: js.UndefOr[java.lang.String] = js.undefined
  /** Contains value if the data is of string type. */
  var strValue: js.UndefOr[java.lang.String] = js.undefined
  /** Contains value if the data is of timestamp type. */
  var timestampValue: js.UndefOr[java.lang.String] = js.undefined
  /** An optional full URL. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

