package typings.fineDashUploader

import typings.fineDashUploader.libCoreMod.PromiseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fineDashUploaderMod {
  type ShowConfirmFunction = js.Function1[/* message */ String, PromiseOptions | Unit]
  type ShowMessageFunction = js.Function1[/* message */ String, PromiseOptions | Unit]
  type ShowPromptFunction = js.Function2[/* message */ String, /* defaultValue */ String, PromiseOptions | Unit]
}
