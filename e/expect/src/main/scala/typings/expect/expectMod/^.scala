package typings.expect.expectMod

import typings.expect.Anon_T
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](actual: T): Expectation[T] = js.native
  def any[T](ctor: Anon_T[T]): T = js.native
  def assert(condition: Boolean, messageFormat: String, extraArgs: js.Any*): Unit = js.native
  def createSpy(): Spy[_] = js.native
  def createSpy(fn: js.Function1[/* repeated */ js.Any, _]): Spy[_] = js.native
  def createSpy(fn: js.Function1[/* repeated */ js.Any, _], restore: js.Function1[/* repeated */ js.Any, _]): Spy[_] = js.native
  def extend(extension: Extension): Unit = js.native
  def isSpy(`object`: js.Object): Boolean = js.native
  def restoreSpies(): Unit = js.native
  def spyOn[T](`object`: T, methodName: String): Spy[T] = js.native
}

