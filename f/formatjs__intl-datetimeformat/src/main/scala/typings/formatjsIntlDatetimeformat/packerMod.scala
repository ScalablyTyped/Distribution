package typings.formatjsIntlDatetimeformat

import typings.formatjsEcma402Abstract.typesDateTimeMod.UnpackedZoneData
import typings.formatjsIntlDatetimeformat.typesMod.PackedData
import typings.formatjsIntlDatetimeformat.typesMod.UnpackedData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packerMod {
  
  @JSImport("@formatjs/intl-datetimeformat/lib/src/packer", "pack")
  @js.native
  def pack(data: UnpackedData): PackedData = js.native
  
  @JSImport("@formatjs/intl-datetimeformat/lib/src/packer", "unpack")
  @js.native
  def unpack(data: PackedData): Record[String, js.Array[UnpackedZoneData]] = js.native
}
