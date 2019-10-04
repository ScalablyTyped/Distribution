package typings.elasticlunr.elasticlunrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elasticlunr", "Configuration")
@js.native
class Configuration[T] protected () extends js.Object {
  def this(config: String, fields: js.Array[String]) = this()
  def addAllFields2UserConfig(bool: Bool, expand: Boolean, fields: js.Array[String]): Unit = js.native
  def buildDefaultConfig(fields: js.Array[String]): Unit = js.native
  def buildUserConfig(config: SearchConfig[T], fields: js.Array[String]): Unit = js.native
  def get(): SearchConfig[T] = js.native
  def reset(): Unit = js.native
}

