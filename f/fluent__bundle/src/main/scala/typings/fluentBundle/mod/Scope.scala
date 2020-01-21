package typings.fluentBundle.mod

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  def cloneForTermReference(args: js.Object): Scope
  def memoizeIntlObject[OptsType, ObjectType](
    ctor: Instantiable2[/* locales */ js.Array[String], /* opts */ OptsType, ObjectType],
    opts: OptsType
  ): ObjectType
  def reportError(error: String): Unit
}

object Scope {
  @scala.inline
  def apply(
    cloneForTermReference: js.Object => Scope,
    memoizeIntlObject: (Instantiable2[/* locales */ js.Array[String], js.Any, js.Any], js.Any) => js.Any,
    reportError: String => Unit
  ): Scope = {
    val __obj = js.Dynamic.literal(cloneForTermReference = js.Any.fromFunction1(cloneForTermReference), memoizeIntlObject = js.Any.fromFunction2(memoizeIntlObject), reportError = js.Any.fromFunction1(reportError))
  
    __obj.asInstanceOf[Scope]
  }
}

