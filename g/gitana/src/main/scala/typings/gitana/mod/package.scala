package typings.gitana

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type eachCB[T, U] = js.ThisFunction2[/* this */ T, /* docId */ java.lang.String, /* node */ U, scala.Unit]
  type gitanaCallback[T] = js.ThisFunction1[/* this */ T, /* error */ js.UndefOr[typings.std.Error], scala.Unit]
  type jobCallback[T] = js.ThisFunction1[/* this */ T, /* job */ typings.gitana.mod.Job, scala.Unit]
}
