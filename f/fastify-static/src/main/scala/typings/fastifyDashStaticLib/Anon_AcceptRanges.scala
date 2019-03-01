package typings
package fastifyDashStaticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptRanges extends js.Object {
  // Passed on to `send`
  var acceptRanges: js.UndefOr[scala.Boolean] = js.undefined
  var cacheControl: js.UndefOr[scala.Boolean] = js.undefined
  var decorateReply: js.UndefOr[scala.Boolean] = js.undefined
  var dotfiles: js.UndefOr[scala.Boolean] = js.undefined
  var etag: js.UndefOr[scala.Boolean] = js.undefined
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var immutable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var lastModified: js.UndefOr[scala.Boolean] = js.undefined
  var maxAge: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var redirect: js.UndefOr[scala.Boolean] = js.undefined
  var root: java.lang.String
  var schemaHide: js.UndefOr[scala.Boolean] = js.undefined
  var serve: js.UndefOr[scala.Boolean] = js.undefined
  var setHeaders: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var wildcard: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AcceptRanges {
  @scala.inline
  def apply(
    root: java.lang.String,
    acceptRanges: js.UndefOr[scala.Boolean] = js.undefined,
    cacheControl: js.UndefOr[scala.Boolean] = js.undefined,
    decorateReply: js.UndefOr[scala.Boolean] = js.undefined,
    dotfiles: js.UndefOr[scala.Boolean] = js.undefined,
    etag: js.UndefOr[scala.Boolean] = js.undefined,
    extensions: js.Array[java.lang.String] = null,
    immutable: js.UndefOr[scala.Boolean] = js.undefined,
    index: js.Array[java.lang.String] = null,
    lastModified: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: java.lang.String | scala.Double = null,
    prefix: java.lang.String = null,
    redirect: js.UndefOr[scala.Boolean] = js.undefined,
    schemaHide: js.UndefOr[scala.Boolean] = js.undefined,
    serve: js.UndefOr[scala.Boolean] = js.undefined,
    setHeaders: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    wildcard: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AcceptRanges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("root")(root)
    if (!js.isUndefined(acceptRanges)) __obj.updateDynamic("acceptRanges")(acceptRanges)
    if (!js.isUndefined(cacheControl)) __obj.updateDynamic("cacheControl")(cacheControl)
    if (!js.isUndefined(decorateReply)) __obj.updateDynamic("decorateReply")(decorateReply)
    if (!js.isUndefined(dotfiles)) __obj.updateDynamic("dotfiles")(dotfiles)
    if (!js.isUndefined(etag)) __obj.updateDynamic("etag")(etag)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable)
    if (index != null) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(lastModified)) __obj.updateDynamic("lastModified")(lastModified)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(redirect)) __obj.updateDynamic("redirect")(redirect)
    if (!js.isUndefined(schemaHide)) __obj.updateDynamic("schemaHide")(schemaHide)
    if (!js.isUndefined(serve)) __obj.updateDynamic("serve")(serve)
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(setHeaders)
    if (!js.isUndefined(wildcard)) __obj.updateDynamic("wildcard")(wildcard)
    __obj.asInstanceOf[Anon_AcceptRanges]
  }
}

