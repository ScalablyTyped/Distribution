package typings
package ghauthLib.ghauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ghauth", JSImport.Namespace)
@js.native
object ghauthModMembers extends js.Object {
  def apply(
    authOptions: ghauthLib.ghauthMod.ghauthNs.AuthOptions,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* tokenData */ ghauthLib.ghauthMod.ghauthNs.TokenData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

