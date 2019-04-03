package typings
package followDashRedirectsLib.followDashRedirectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectScheme[Options, Request /* <: WrappableRequest */, Response] extends js.Object {
  def get(options: (java.lang.String | Options) with FollowOptions): RedirectableRequest[Request, Response] = js.native
  def get(
    options: (java.lang.String | Options) with FollowOptions,
    callback: js.Function1[/* res */ Response with FollowResponse, scala.Unit]
  ): RedirectableRequest[Request, Response] = js.native
  def request(options: (java.lang.String | Options) with FollowOptions): RedirectableRequest[Request, Response] = js.native
  def request(
    options: (java.lang.String | Options) with FollowOptions,
    callback: js.Function1[/* res */ Response with FollowResponse, scala.Unit]
  ): RedirectableRequest[Request, Response] = js.native
}

