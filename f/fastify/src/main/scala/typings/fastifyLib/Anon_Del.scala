package typings
package fastifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Del extends js.Object {
  def del(version: nodeLib.String): scala.Unit
  def empty(): scala.Unit
  def get(version: nodeLib.String): js.Function | scala.Null
  def set(version: nodeLib.String, store: js.Function): scala.Unit
}

object Anon_Del {
  @scala.inline
  def apply(
    del: js.Function1[nodeLib.String, scala.Unit],
    empty: js.Function0[scala.Unit],
    get: js.Function1[nodeLib.String, js.Function | scala.Null],
    set: js.Function2[nodeLib.String, js.Function, scala.Unit]
  ): Anon_Del = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("del")(del)
    __obj.updateDynamic("empty")(empty)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[Anon_Del]
  }
}

