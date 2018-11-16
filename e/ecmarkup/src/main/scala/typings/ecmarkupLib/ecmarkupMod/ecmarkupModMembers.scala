package typings
package ecmarkupLib.ecmarkupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup", JSImport.Namespace)
@js.native
object ecmarkupModMembers extends js.Object {
  def build(
    path: java.lang.String,
    fetch: js.Function2[
      /* path */ java.lang.String, 
      /* token */ prexLib.prexMod.CancellationToken, 
      stdLib.PromiseLike[java.lang.String]
    ]
  ): stdLib.Promise[ecmarkupLib.libSpecMod.Spec] = js.native
  def build(
    path: java.lang.String,
    fetch: js.Function2[
      /* path */ java.lang.String, 
      /* token */ prexLib.prexMod.CancellationToken, 
      stdLib.PromiseLike[java.lang.String]
    ],
    opts: Options
  ): stdLib.Promise[ecmarkupLib.libSpecMod.Spec] = js.native
  def build(
    path: java.lang.String,
    fetch: js.Function2[
      /* path */ java.lang.String, 
      /* token */ prexLib.prexMod.CancellationToken, 
      stdLib.PromiseLike[java.lang.String]
    ],
    opts: Options,
    token: prexLib.prexMod.CancellationToken
  ): stdLib.Promise[ecmarkupLib.libSpecMod.Spec] = js.native
}

