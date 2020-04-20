package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What kind of object an ObjC.Object represents.
  */
/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.instance
  - typings.fridaGum.fridaGumStrings.`class`
  - typings.fridaGum.fridaGumStrings.`meta-class`
*/
trait ObjectKind extends js.Object

object ObjectKind {
  @scala.inline
  def `class`: typings.fridaGum.fridaGumStrings.`class` = "class".asInstanceOf[typings.fridaGum.fridaGumStrings.`class`]
  @scala.inline
  def instance: typings.fridaGum.fridaGumStrings.instance = "instance".asInstanceOf[typings.fridaGum.fridaGumStrings.instance]
  @scala.inline
  def `meta-class`: typings.fridaGum.fridaGumStrings.`meta-class` = "meta-class".asInstanceOf[typings.fridaGum.fridaGumStrings.`meta-class`]
}

