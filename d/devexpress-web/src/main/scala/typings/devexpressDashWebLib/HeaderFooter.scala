package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Contains settings defining a header or footer in a document.
 */

trait HeaderFooter extends js.Object {
  /**
       * Provides access to an object implementing the basic document functionality that is common to the header, footer and the main document body.
       * Value: A <see cref="SubDocument" /> object exposing the basic document functionality.
       */
  var subDocument: SubDocument
  /**
       * Gets the type of the header (footer).
       * Value: One of the <see cref="HeaderFooterType" /> values.
       */
  var `type`: js.Any
}

