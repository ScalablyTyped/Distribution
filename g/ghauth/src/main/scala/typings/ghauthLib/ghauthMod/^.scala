package typings
package ghauthLib.ghauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ghauth", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    authOptions: AuthOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* tokenData */ TokenData, scala.Unit]
  ): scala.Unit = js.native
}

