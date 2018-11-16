package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Setting extends js.Object {
  /**
               * The setting's ID. The following IDs are valid:
               * - locale - The key to the user’s language/locale (BCP 47 identifier) that Glassware should use to render localized content.
               * - timezone - The key to the user’s current time zone region as defined in the tz database. Example: America/Los_Angeles.
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The type of resource. This is always mirror#setting. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The setting value, as a string. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

