package typings.dynogels.mod

import org.scalablytyped.runtime.StringDictionary
import typings.joi.mod.AnySchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaType extends /* key */ StringDictionary[AnySchema | SchemaType]

object SchemaType {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[AnySchema | SchemaType] = null): SchemaType = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SchemaType]
  }
}

