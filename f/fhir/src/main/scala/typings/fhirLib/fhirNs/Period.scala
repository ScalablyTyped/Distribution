package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Time range defined by start and end date/time
     */

trait Period extends Element {
  /**
           * Contains extended information for property 'end'.
           */
  var _end: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'start'.
           */
  var _start: js.UndefOr[Element] = js.undefined
  /**
           * End time with inclusive boundary, if not ongoing
           */
  var end: js.UndefOr[dateTime] = js.undefined
  /**
           * Starting time with inclusive boundary
           */
  var start: js.UndefOr[dateTime] = js.undefined
}

