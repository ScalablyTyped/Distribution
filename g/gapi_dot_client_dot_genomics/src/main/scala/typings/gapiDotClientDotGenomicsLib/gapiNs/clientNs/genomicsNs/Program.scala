package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Program extends js.Object {
  /** The command line used to run this program. */
  var commandLine: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The user specified locally unique ID of the program. Used along with
               * `prevProgramId` to define an ordering between programs.
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The display name of the program. This is typically the colloquial name of
               * the tool used, for example 'bwa' or 'picard'.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the program run before this one. */
  var prevProgramId: js.UndefOr[java.lang.String] = js.undefined
  /** The version of the program run. */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

