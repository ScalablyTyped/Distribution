package typings.formatjsIntlDatetimeformat

import typings.formatjsEcma402Abstract.typesDateTimeMod.UnpackedZoneData
import typings.formatjsIntlDatetimeformat.srcTypesMod.PackedData
import typings.formatjsIntlDatetimeformat.srcTypesMod.UnpackedData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPackerMod {
  
  @JSImport("@formatjs/intl-datetimeformat/src/packer", "pack")
  @js.native
  def pack(data: UnpackedData): PackedData = js.native
  
  @JSImport("@formatjs/intl-datetimeformat/src/packer", "unpack")
  @js.native
  def unpack(data: PackedData): Record[String, js.Array[UnpackedZoneData]] = js.native
}
