package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Java {
  type Env = js.Any
  type Members[T] = typings.std.Record[
    /* keyof T */ java.lang.String, 
    typings.fridaGum.Java.MethodDispatcher[js.Object] | (typings.fridaGum.Java.Field[js.Any, js.Object])
  ]
  type MethodImplementation[This /* <: typings.fridaGum.Java.Members[This] */] = js.ThisFunction1[/* this */ typings.fridaGum.Java.Wrapper[This], /* repeated */ js.Any, js.Any]
}
