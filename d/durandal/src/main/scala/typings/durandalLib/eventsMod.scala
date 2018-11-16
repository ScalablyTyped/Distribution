package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Durandal events originate from backbone.js but also combine some ideas from signals.js as well as some additional improvements.
 * Events can be installed into any object and are installed into the `app` module by default for convenient app-wide eventing.
 * @requires system
 */
@JSImport("durandal/events", JSImport.Namespace)
@js.native
object eventsMod
  extends ScalablyTyped.runtime.TopLevel[DurandalEventModule]

