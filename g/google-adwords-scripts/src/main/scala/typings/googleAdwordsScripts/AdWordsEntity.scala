package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Generics
trait AdWordsEntity extends js.Object {
  var getEntityType: js.UndefOr[js.Function0[String]] = js.undefined
}

object AdWordsEntity {
  @scala.inline
  def apply(getEntityType: () => String = null): AdWordsEntity = {
    val __obj = js.Dynamic.literal()
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[AdWordsEntity]
  }
}

