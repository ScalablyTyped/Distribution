package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Transaction holds a list of ChangedEvents collected during a transaction,
  * as the value of the read-only .changes property.
  */
@JSImport("go", "UndoManager")
@js.native
/**
  * The constructor produces an empty UndoManager with no transaction history.
  */
class UndoManager ()
  extends goLib.goMod.goNs.UndoManager

