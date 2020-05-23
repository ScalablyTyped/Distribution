package typings.dotnetDepsParser.parsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceInclude extends js.Object {
  var Culture: js.UndefOr[String] = js.undefined
  var PublicKeyToken: js.UndefOr[String] = js.undefined
  var Version: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var processorArchitecture: js.UndefOr[String] = js.undefined
}

object ReferenceInclude {
  @scala.inline
  def apply(
    Culture: String = null,
    PublicKeyToken: String = null,
    Version: String = null,
    name: String = null,
    processorArchitecture: String = null
  ): ReferenceInclude = {
    val __obj = js.Dynamic.literal()
    if (Culture != null) __obj.updateDynamic("Culture")(Culture.asInstanceOf[js.Any])
    if (PublicKeyToken != null) __obj.updateDynamic("PublicKeyToken")(PublicKeyToken.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (processorArchitecture != null) __obj.updateDynamic("processorArchitecture")(processorArchitecture.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceInclude]
  }
}

