package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Name of a human - parts and usage
     */

trait HumanName extends Element {
  /**
           * Contains extended information for property 'family'.
           */
  var _family: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'given'.
           */
  var _given: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'prefix'.
           */
  var _prefix: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'suffix'.
           */
  var _suffix: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'text'.
           */
  var _text: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'use'.
           */
  var _use: js.UndefOr[Element] = js.undefined
  /**
           * Family name (often called 'Surname')
           */
  var family: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Given names (not always 'first'). Includes middle names
           */
  var given: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Time period when name was/is in use
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Parts that come before the name
           */
  var prefix: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Parts that come after the name
           */
  var suffix: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Text representation of the full name
           */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
           * usual | official | temp | nickname | anonymous | old | maiden
           */
  var use: js.UndefOr[code] = js.undefined
}

