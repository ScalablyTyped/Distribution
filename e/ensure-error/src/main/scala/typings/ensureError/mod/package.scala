package typings.ensureError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorWithStack[T] = T with typings.ensureError.anon.Stack
  // IfAny<T, ThenType, ElseType> resolves to ThenType if T is `any` and resolves to ElseType otherwise
  // https://stackoverflow.com/a/49928360/4135063
  type IfAny[T, ThenType, ElseType] = ElseType | ThenType
}
