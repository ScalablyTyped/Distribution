package typings.fastMemoize.mod

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[F /* <: Func */] extends js.Object {
  var cache: js.UndefOr[Cache[String, ReturnType[F]]] = js.undefined
  var serializer: js.UndefOr[Serializer] = js.undefined
  var strategy: js.UndefOr[MemoizeFunc] = js.undefined
}

object Options {
  @scala.inline
  def apply[/* <: typings.fastMemoize.mod.Func */ F](
    cache: Cache[String, ReturnType[F]] = null,
    serializer: /* args */ js.Array[js.Any] => String = null,
    strategy: (/* fn */ Func, /* options */ js.UndefOr[Options[Func]]) => Func = null
  ): Options[F] = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(js.Any.fromFunction1(serializer))
    if (strategy != null) __obj.updateDynamic("strategy")(js.Any.fromFunction2(strategy))
    __obj.asInstanceOf[Options[F]]
  }
}

