package typings.forkDashTsDashCheckerDashWebpackDashPlugin.libIncrementalCheckerInterfaceMod

import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libCancellationTokenMod.CancellationToken
import typings.forkDashTsDashCheckerDashWebpackDashPlugin.libNormalizedMessageMod.NormalizedMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncrementalCheckerInterface extends js.Object {
  def getDiagnostics(cancellationToken: CancellationToken): js.Promise[js.Array[NormalizedMessage]]
  def getEsLints(cancellationToken: CancellationToken): js.Array[NormalizedMessage]
  def getLints(cancellationToken: CancellationToken): js.Array[NormalizedMessage]
  def hasEsLinter(): Boolean
  def hasLinter(): Boolean
  def nextIteration(): Unit
}

object IncrementalCheckerInterface {
  @scala.inline
  def apply(
    getDiagnostics: CancellationToken => js.Promise[js.Array[NormalizedMessage]],
    getEsLints: CancellationToken => js.Array[NormalizedMessage],
    getLints: CancellationToken => js.Array[NormalizedMessage],
    hasEsLinter: () => Boolean,
    hasLinter: () => Boolean,
    nextIteration: () => Unit
  ): IncrementalCheckerInterface = {
    val __obj = js.Dynamic.literal(getDiagnostics = js.Any.fromFunction1(getDiagnostics), getEsLints = js.Any.fromFunction1(getEsLints), getLints = js.Any.fromFunction1(getLints), hasEsLinter = js.Any.fromFunction0(hasEsLinter), hasLinter = js.Any.fromFunction0(hasLinter), nextIteration = js.Any.fromFunction0(nextIteration))
  
    __obj.asInstanceOf[IncrementalCheckerInterface]
  }
}

