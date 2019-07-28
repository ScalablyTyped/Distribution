package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeAccount extends js.Object {
  var includeAccount: js.UndefOr[Boolean] = js.undefined
  var includeBusinessLinkedNotebooks: js.UndefOr[Boolean] = js.undefined
  var includePersonalLinkedNotebooks: js.UndefOr[Boolean] = js.undefined
}

object Anon_IncludeAccount {
  @scala.inline
  def apply(
    includeAccount: js.UndefOr[Boolean] = js.undefined,
    includeBusinessLinkedNotebooks: js.UndefOr[Boolean] = js.undefined,
    includePersonalLinkedNotebooks: js.UndefOr[Boolean] = js.undefined
  ): Anon_IncludeAccount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAccount)) __obj.updateDynamic("includeAccount")(includeAccount)
    if (!js.isUndefined(includeBusinessLinkedNotebooks)) __obj.updateDynamic("includeBusinessLinkedNotebooks")(includeBusinessLinkedNotebooks)
    if (!js.isUndefined(includePersonalLinkedNotebooks)) __obj.updateDynamic("includePersonalLinkedNotebooks")(includePersonalLinkedNotebooks)
    __obj.asInstanceOf[Anon_IncludeAccount]
  }
}

