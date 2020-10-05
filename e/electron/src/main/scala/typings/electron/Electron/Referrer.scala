package typings.electron.Electron

import typings.electron.electronStrings.`no-referrer-when-downgrade`
import typings.electron.electronStrings.`no-referrer`
import typings.electron.electronStrings.`same-origin`
import typings.electron.electronStrings.`strict-origin-when-cross-origin`
import typings.electron.electronStrings.`strict-origin`
import typings.electron.electronStrings.`unsafe-url`
import typings.electron.electronStrings.default
import typings.electron.electronStrings.origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Referrer extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/referrer
  /**
    * Can be `default`, `unsafe-url`, `no-referrer-when-downgrade`, `no-referrer`,
    * `origin`, `strict-origin-when-cross-origin`, `same-origin` or `strict-origin`.
    * See the Referrer-Policy spec for more details on the meaning of these values.
    */
  var policy: default | `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `strict-origin-when-cross-origin` | `same-origin` | `strict-origin` = js.native
  /**
    * HTTP Referrer URL.
    */
  var url: String = js.native
}

object Referrer {
  @scala.inline
  def apply(
    policy: default | `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `strict-origin-when-cross-origin` | `same-origin` | `strict-origin`,
    url: String
  ): Referrer = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Referrer]
  }
  @scala.inline
  implicit class ReferrerOps[Self <: Referrer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPolicy(
      value: default | `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `strict-origin-when-cross-origin` | `same-origin` | `strict-origin`
    ): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

