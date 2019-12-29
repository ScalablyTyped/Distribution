package typings.ejs

import typings.ejs.ejsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsyncClientFalse extends js.Object {
  var async: js.UndefOr[`false`] = js.undefined
  var client: js.UndefOr[`false`] = js.undefined
}

object Anon_AsyncClientFalse {
  @scala.inline
  def apply(async: `false` = null, client: `false` = null): Anon_AsyncClientFalse = {
    val __obj = js.Dynamic.literal()
    if (async != null) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsyncClientFalse]
  }
}

