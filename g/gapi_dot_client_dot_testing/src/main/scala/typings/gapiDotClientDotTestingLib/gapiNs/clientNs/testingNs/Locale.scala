package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Locale extends js.Object {
  /**
               * The id for this locale.
               * Example: "en_US"
               * @OutputOnly
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A human-friendly name for this language/locale.
               * Example: "English"
               * @OutputOnly
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A human-friendy string representing the region for this locale.
               * Example: "United States"
               * Not present for every locale.
               * @OutputOnly
               */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Tags for this dimension.
               * Examples: "default"
               */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

