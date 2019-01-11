package typings
package gamedigLib.gamedigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gamedig", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def query(options: gamedigLib.gamedigMod.QueryOptions): js.Promise[gamedigLib.gamedigMod.QueryResult] = js.native
  def query(
    options: gamedigLib.gamedigMod.QueryOptions,
    callback: js.Function2[/* error */ js.Any, /* state */ gamedigLib.gamedigMod.QueryResult, scala.Unit]
  ): scala.Unit = js.native
}

