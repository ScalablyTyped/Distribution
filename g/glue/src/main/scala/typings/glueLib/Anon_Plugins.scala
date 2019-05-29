package typings
package glueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Plugins extends js.Object {
  var plugins: js.Array[glueLib.glueMod.Plugin | java.lang.String]
}

object Anon_Plugins {
  @scala.inline
  def apply(plugins: js.Array[glueLib.glueMod.Plugin | java.lang.String]): Anon_Plugins = {
    val __obj = js.Dynamic.literal(plugins = plugins)
  
    __obj.asInstanceOf[Anon_Plugins]
  }
}

