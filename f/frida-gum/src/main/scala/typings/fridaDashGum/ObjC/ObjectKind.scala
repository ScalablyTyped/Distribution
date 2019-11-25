package typings.fridaDashGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What kind of object an ObjC.Object represents.
  */
/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.instance
  - typings.fridaDashGum.fridaDashGumStrings.`class`
  - typings.fridaDashGum.fridaDashGumStrings.`meta-class`
*/
trait ObjectKind extends js.Object

object ObjectKind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `class`: typings.fridaDashGum.fridaDashGumStrings.`class` = this.cast("class")
  @scala.inline
  def instance: typings.fridaDashGum.fridaDashGumStrings.instance = this.cast("instance")
  @scala.inline
  def `meta-class`: typings.fridaDashGum.fridaDashGumStrings.`meta-class` = this.cast("meta-class")
}

