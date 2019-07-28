package typings.factoryDashGirl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object factoryDashGirlMod {
  type Attributes[T] = Definition[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: factory-girl.factory-girl.Definition<T[P]>}
    */ typings.factoryDashGirl.factoryDashGirlStrings.Attributes with T
  ]
  type Definition[T] = T | Generator[T]
  type Generator[T] = js.Function0[T]
  type Hook[T] = js.Function3[/* model */ js.Any, /* attrs */ js.Array[T], /* options */ js.Any, Unit]
}
