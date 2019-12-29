package typings.djv.djvMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DjvStatic
  extends Instantiable0[djv]
     with Instantiable1[/* options */ DjvConfig, djv] {
  def apply(): djv = js.native
  def apply(options: DjvConfig): djv = js.native
  def expression(strings: js.Array[String], keys: String*): js.Function1[/* repeated */ String, String] = js.native
}

