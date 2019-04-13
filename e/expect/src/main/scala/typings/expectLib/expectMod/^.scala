package typings
package expectLib.expectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](actual: T): Expectation[T] = js.native
  def any[T](ctor: expectLib.Anon_T[T]): T = js.native
  def assert(condition: scala.Boolean, messageFormat: java.lang.String, extraArgs: js.Any*): scala.Unit = js.native
  def createSpy(): Spy[_] = js.native
  def createSpy(fn: js.Function1[/* repeated */ js.Any, _]): Spy[_] = js.native
  def createSpy(fn: js.Function1[/* repeated */ js.Any, _], restore: js.Function1[/* repeated */ js.Any, _]): Spy[_] = js.native
  def extend(extension: Extension): scala.Unit = js.native
  def isSpy(`object`: js.Object): scala.Boolean = js.native
  def restoreSpies(): scala.Unit = js.native
  def spyOn[T](`object`: T, methodName: java.lang.String): Spy[T] = js.native
}

