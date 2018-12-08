package typings
package ghauthLib.ghauthMod.ghauthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AuthOptions extends js.Object {
  /**
           * @default "https://api.github.com/authorizations"
           */
  var authUrl: js.UndefOr[java.lang.String] = js.undefined
  var configName: java.lang.String
  /**
           * @default false
           */
  var noSave: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * @default "Node.js command-line app with ghauth"
           */
  var note: js.UndefOr[java.lang.String] = js.undefined
  /**
           * @default "GitHub"
           */
  var promptName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * @default []
           */
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * @default "Magic Node.js application that does magic things with ghauth"
           */
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
}

