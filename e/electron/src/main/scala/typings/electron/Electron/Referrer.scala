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
import scala.scalajs.js.annotation._

trait Referrer extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/referrer
  /**
    * Can be `default`, `unsafe-url`, `no-referrer-when-downgrade`, `no-referrer`,
    * `origin`, `strict-origin-when-cross-origin`, `same-origin` or `strict-origin`.
    * See the Referrer-Policy spec for more details on the meaning of these values.
    */
  var policy: default | `unsafe-url` | `no-referrer-when-downgrade` | `no-referrer` | origin | `strict-origin-when-cross-origin` | `same-origin` | `strict-origin`
  /**
    * HTTP Referrer URL.
    */
  var url: String
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
}

