package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Connects the history module's url and history tracking support to Durandal's activation and composition engine allowing you to easily build navigation-style applications.
 * @requires system
 * @requires app
 * @requires activator
 * @requires events
 * @requires composition
 * @requires history
 * @requires knockout
 * @requires jquery
 */
@JSImport("plugins/router", JSImport.Namespace)
@js.native
object routerMod
  extends ScalablyTyped.runtime.TopLevel[DurandalRootRouter]

