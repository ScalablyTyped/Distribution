package typings.formatjsIntlDatetimeformat

import typings.formatjsEcma402Abstract.typesDateTimeMod.UnpackedZoneData
import typings.formatjsIntlDatetimeformat.typesMod.PackedData
import typings.formatjsIntlDatetimeformat.typesMod.UnpackedData
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packerMod {
  
  @JSImport("@formatjs/intl-datetimeformat/lib/src/packer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pack(data: UnpackedData): PackedData = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(data.asInstanceOf[js.Any]).asInstanceOf[PackedData]
  
  @scala.inline
  def unpack(data: PackedData): Record[String, js.Array[UnpackedZoneData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(data.asInstanceOf[js.Any]).asInstanceOf[Record[String, js.Array[UnpackedZoneData]]]
}
