package typings.dexie.dexieMod.Dexie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletingHookContext[T, Key] extends js.Object {
  var onerror: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
  var onsuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object DeletingHookContext {
  @scala.inline
  def apply[T, Key](onerror: /* err */ js.Any => Unit = null, onsuccess: () => Unit = null): DeletingHookContext[T, Key] = {
    val __obj = js.Dynamic.literal()
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (onsuccess != null) __obj.updateDynamic("onsuccess")(js.Any.fromFunction0(onsuccess))
    __obj.asInstanceOf[DeletingHookContext[T, Key]]
  }
}

