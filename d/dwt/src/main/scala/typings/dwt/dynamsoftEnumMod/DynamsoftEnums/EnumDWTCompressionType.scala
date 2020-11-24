package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCompressionType extends js.Object
/**
  * TWAIN compression types.
  */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CompressionType")
@js.native
object EnumDWTCompressionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCompressionType with Double] = js.native
  
  @js.native
  sealed trait TWCP_BITFIELDS extends EnumDWTCompressionType
  /* 12 */ @js.native
  object TWCP_BITFIELDS extends TopLevel[TWCP_BITFIELDS with Double]
  
  @js.native
  sealed trait TWCP_GROUP31D extends EnumDWTCompressionType
  /* 2 */ @js.native
  object TWCP_GROUP31D extends TopLevel[TWCP_GROUP31D with Double]
  
  @js.native
  sealed trait TWCP_GROUP31DEOL extends EnumDWTCompressionType
  /* 3 */ @js.native
  object TWCP_GROUP31DEOL extends TopLevel[TWCP_GROUP31DEOL with Double]
  
  @js.native
  sealed trait TWCP_GROUP32D extends EnumDWTCompressionType
  /* 4 */ @js.native
  object TWCP_GROUP32D extends TopLevel[TWCP_GROUP32D with Double]
  
  @js.native
  sealed trait TWCP_GROUP4 extends EnumDWTCompressionType
  /* 5 */ @js.native
  object TWCP_GROUP4 extends TopLevel[TWCP_GROUP4 with Double]
  
  @js.native
  sealed trait TWCP_JBIG extends EnumDWTCompressionType
  /* 8 */ @js.native
  object TWCP_JBIG extends TopLevel[TWCP_JBIG with Double]
  
  @js.native
  sealed trait TWCP_JPEG extends EnumDWTCompressionType
  /* 6 */ @js.native
  object TWCP_JPEG extends TopLevel[TWCP_JPEG with Double]
  
  @js.native
  sealed trait TWCP_JPEG2000 extends EnumDWTCompressionType
  /* 14 */ @js.native
  object TWCP_JPEG2000 extends TopLevel[TWCP_JPEG2000 with Double]
  
  @js.native
  sealed trait TWCP_LZW extends EnumDWTCompressionType
  /* 7 */ @js.native
  object TWCP_LZW extends TopLevel[TWCP_LZW with Double]
  
  @js.native
  sealed trait TWCP_NONE extends EnumDWTCompressionType
  /* 0 */ @js.native
  object TWCP_NONE extends TopLevel[TWCP_NONE with Double]
  
  @js.native
  sealed trait TWCP_PACKBITS extends EnumDWTCompressionType
  /* 1 */ @js.native
  object TWCP_PACKBITS extends TopLevel[TWCP_PACKBITS with Double]
  
  @js.native
  sealed trait TWCP_PNG extends EnumDWTCompressionType
  /* 9 */ @js.native
  object TWCP_PNG extends TopLevel[TWCP_PNG with Double]
  
  @js.native
  sealed trait TWCP_RLE4 extends EnumDWTCompressionType
  /* 10 */ @js.native
  object TWCP_RLE4 extends TopLevel[TWCP_RLE4 with Double]
  
  @js.native
  sealed trait TWCP_RLE8 extends EnumDWTCompressionType
  /* 11 */ @js.native
  object TWCP_RLE8 extends TopLevel[TWCP_RLE8 with Double]
  
  @js.native
  sealed trait TWCP_ZIP extends EnumDWTCompressionType
  /* 13 */ @js.native
  object TWCP_ZIP extends TopLevel[TWCP_ZIP with Double]
}
