package typings.formatjsIntlDatetimeformat

import typings.formatjsEcma402Abstract.typesDateTimeMod.UnpackedZoneData
import typings.formatjsIntlDatetimeformat.typesMod.PackedData
import typings.formatjsIntlDatetimeformat.typesMod.UnpackedData
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl-datetimeformat/lib/src/packer", JSImport.Namespace)
@js.native
object packerMod extends js.Object {
  
  def pack(data: UnpackedData): PackedData = js.native
  
  def unpack(data: PackedData): Record[String, js.Array[UnpackedZoneData]] = js.native
}
