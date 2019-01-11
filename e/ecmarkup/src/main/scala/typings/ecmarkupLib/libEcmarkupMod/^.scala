package typings
package ecmarkupLib.libEcmarkupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/ecmarkup", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def build(
    path: java.lang.String,
    fetch: js.Function2[
      /* path */ java.lang.String, 
      /* token */ prexLib.prexMod.CancellationToken, 
      js.Thenable[java.lang.String]
    ]
  ): js.Promise[ecmarkupLib.libSpecMod.Spec] = js.native
  def build(
    path: java.lang.String,
    fetch: js.Function2[
      /* path */ java.lang.String, 
      /* token */ prexLib.prexMod.CancellationToken, 
      js.Thenable[java.lang.String]
    ],
    opts: ecmarkupLib.libEcmarkupMod.Options
  ): js.Promise[ecmarkupLib.libSpecMod.Spec] = js.native
  def build(
    path: java.lang.String,
    fetch: js.Function2[
      /* path */ java.lang.String, 
      /* token */ prexLib.prexMod.CancellationToken, 
      js.Thenable[java.lang.String]
    ],
    opts: ecmarkupLib.libEcmarkupMod.Options,
    token: prexLib.prexMod.CancellationToken
  ): js.Promise[ecmarkupLib.libSpecMod.Spec] = js.native
}

