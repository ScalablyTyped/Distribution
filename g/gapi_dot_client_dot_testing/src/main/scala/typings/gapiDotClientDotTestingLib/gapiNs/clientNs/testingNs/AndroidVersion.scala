package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AndroidVersion extends js.Object {
  /**
               * The API level for this Android version.
               * Examples: 18, 19
               * @OutputOnly
               */
  var apiLevel: js.UndefOr[scala.Double] = js.undefined
  /**
               * The code name for this Android version.
               * Examples: "JellyBean", "KitKat"
               * @OutputOnly
               */
  var codeName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Market share for this version.
               * @OutputOnly
               */
  var distribution: js.UndefOr[Distribution] = js.undefined
  /**
               * An opaque id for this Android version.
               * Use this id to invoke the TestExecutionService.
               * @OutputOnly
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The date this Android version became available in the market.
               * @OutputOnly
               */
  var releaseDate: js.UndefOr[Date] = js.undefined
  /**
               * Tags for this dimension.
               * Examples: "default", "preview", "deprecated"
               */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * A string representing this version of the Android OS.
               * Examples: "4.3", "4.4"
               * @OutputOnly
               */
  var versionString: js.UndefOr[java.lang.String] = js.undefined
}

