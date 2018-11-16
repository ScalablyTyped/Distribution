package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Sentiment extends js.Object {
  /**
               * A non-negative number in the [0, +inf) range, which represents
               * the absolute magnitude of sentiment regardless of score (positive or
               * negative).
               */
  var magnitude: js.UndefOr[scala.Double] = js.undefined
  /**
               * Sentiment score between -1.0 (negative sentiment) and 1.0
               * (positive sentiment).
               */
  var score: js.UndefOr[scala.Double] = js.undefined
}

