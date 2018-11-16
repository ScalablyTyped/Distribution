package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the BeforeDock event.
 */

trait ASPxClientDockManagerProcessingModeCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
       * Gets the panel currently being processed.
       * Value: An ASPxClientDockPanel object that is the processed panel.
       */
  var panel: ASPxClientDockPanel
  /**
       * Gets the zone currently being processed.
       * Value: An ASPxClientDockZone object that is the processed zone.
       */
  var zone: ASPxClientDockZone
}

