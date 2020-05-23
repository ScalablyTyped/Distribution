package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InMyList extends js.Object {
  var inMyList: js.UndefOr[Boolean] = js.undefined
  var reminderNotifyEmail: js.UndefOr[Boolean] = js.undefined
  var reminderNotifyInApp: js.UndefOr[Boolean] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
}

object InMyList {
  @scala.inline
  def apply(
    inMyList: js.UndefOr[Boolean] = js.undefined,
    reminderNotifyEmail: js.UndefOr[Boolean] = js.undefined,
    reminderNotifyInApp: js.UndefOr[Boolean] = js.undefined,
    stack: String = null
  ): InMyList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inMyList)) __obj.updateDynamic("inMyList")(inMyList.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reminderNotifyEmail)) __obj.updateDynamic("reminderNotifyEmail")(reminderNotifyEmail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reminderNotifyInApp)) __obj.updateDynamic("reminderNotifyInApp")(reminderNotifyInApp.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InMyList]
  }
}

