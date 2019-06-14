package typings
package fridaDashGumLib.ObjCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What kind of object an ObjC.Object represents.
  */
/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.instance
  - fridaDashGumLib.fridaDashGumLibStrings.`class`
  - fridaDashGumLib.fridaDashGumLibStrings.`meta-class`
*/
trait ObjectKind extends js.Object

object ObjectKind {
  @scala.inline
  def Class: fridaDashGumLib.fridaDashGumLibStrings.`class` = this.cast("class")
  @scala.inline
  def Instance: fridaDashGumLib.fridaDashGumLibStrings.instance = this.cast("instance")
  @scala.inline
  def MetaClass: fridaDashGumLib.fridaDashGumLibStrings.`meta-class` = this.cast("meta-class")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

