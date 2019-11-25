package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesStrings.debug
  - typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesStrings.error
  - typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesStrings.error = this.cast("error")
  @scala.inline
  def silent: typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesStrings.silent = this.cast("silent")
}

