package typings.firebaseFirestore.renameInternalsMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SDKMinifierOptions extends js.Object {
  /**
    * A prefix to append to all identifiers that are not referencing the Public
    * API. Defauls to '_'.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /** List of identifiers that are not to be minified. */
  var publicIdentifiers: Set[String]
}

object SDKMinifierOptions {
  @scala.inline
  def apply(publicIdentifiers: Set[String], prefix: String = null): SDKMinifierOptions = {
    val __obj = js.Dynamic.literal(publicIdentifiers = publicIdentifiers.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDKMinifierOptions]
  }
}

