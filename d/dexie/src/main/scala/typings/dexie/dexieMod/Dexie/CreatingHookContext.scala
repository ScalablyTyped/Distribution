package typings.dexie.dexieMod.Dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatingHookContext[T, Key] extends js.Object {
  var onerror: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
  var onsuccess: js.UndefOr[js.Function1[/* primKey */ Key, Unit]] = js.undefined
}

object CreatingHookContext {
  @scala.inline
  def apply[T, Key](onerror: /* err */ js.Any => Unit = null, onsuccess: /* primKey */ Key => Unit = null): CreatingHookContext[T, Key] = {
    val __obj = js.Dynamic.literal()
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (onsuccess != null) __obj.updateDynamic("onsuccess")(js.Any.fromFunction1(onsuccess))
    __obj.asInstanceOf[CreatingHookContext[T, Key]]
  }
}

