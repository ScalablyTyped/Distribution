package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeAccount extends js.Object {
  var includeAccount: js.UndefOr[Boolean] = js.undefined
  var includeBusinessLinkedNotebooks: js.UndefOr[Boolean] = js.undefined
  var includePersonalLinkedNotebooks: js.UndefOr[Boolean] = js.undefined
}

object IncludeAccount {
  @scala.inline
  def apply(
    includeAccount: js.UndefOr[Boolean] = js.undefined,
    includeBusinessLinkedNotebooks: js.UndefOr[Boolean] = js.undefined,
    includePersonalLinkedNotebooks: js.UndefOr[Boolean] = js.undefined
  ): IncludeAccount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAccount)) __obj.updateDynamic("includeAccount")(includeAccount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeBusinessLinkedNotebooks)) __obj.updateDynamic("includeBusinessLinkedNotebooks")(includeBusinessLinkedNotebooks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includePersonalLinkedNotebooks)) __obj.updateDynamic("includePersonalLinkedNotebooks")(includePersonalLinkedNotebooks.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeAccount]
  }
}

