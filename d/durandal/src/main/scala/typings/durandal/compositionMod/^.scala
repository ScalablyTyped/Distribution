package typings.durandal.compositionMod

import typings.durandal.DurandalPromise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("durandal/composition", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var current: CompositionTransation = js.native
  var defaultStrategy: js.Function1[/* context */ CompositionContext, DurandalPromise[HTMLElement]] = js.native
  var defaultTransitionName: String = js.native
}

