package typings.formatjsIntlDatetimeformat

import typings.formatjsIntlDatetimeformat.typesMod.PackedData
import typings.formatjsIntlDatetimeformat.typesMod.UnpackedData
import typings.formatjsIntlDatetimeformat.typesMod.UnpackedZoneData
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-datetimeformat/src/packer", JSImport.Namespace)
@js.native
object packerMod extends js.Object {
  def pack(data: UnpackedData): PackedData = js.native
  def unpack(data: PackedData): Record[String, js.Array[UnpackedZoneData]] = js.native
}

