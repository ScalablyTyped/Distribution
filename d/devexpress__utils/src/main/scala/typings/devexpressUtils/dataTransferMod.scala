package typings.devexpressUtils

import typings.std.DataTransferItem
import typings.std.DataTransferItemList
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTransferMod {
  
  @JSImport("@devexpress/utils/lib/utils/data-transfer", "DataTransferUtils")
  @js.native
  open class DataTransferUtils () extends StObject
  /* static members */
  object DataTransferUtils {
    
    @JSImport("@devexpress/utils/lib/utils/data-transfer", "DataTransferUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getImageItem(items: DataTransferItemList): File | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageItem")(items.asInstanceOf[js.Any]).asInstanceOf[File | Null]
    
    inline def getPlainTextItem(items: DataTransferItemList): DataTransferItem | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlainTextItem")(items.asInstanceOf[js.Any]).asInstanceOf[DataTransferItem | Null]
    
    inline def getRtfTextItem(items: DataTransferItemList): DataTransferItem | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRtfTextItem")(items.asInstanceOf[js.Any]).asInstanceOf[DataTransferItem | Null]
    
    inline def getTransferItemByType(items: DataTransferItemList, `type`: String): DataTransferItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransferItemByType")(items.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[DataTransferItem | Null]
    
    @JSImport("@devexpress/utils/lib/utils/data-transfer", "DataTransferUtils.isBrowserSupportExtendedClientBuffer")
    @js.native
    def isBrowserSupportExtendedClientBuffer: Any = js.native
    inline def isBrowserSupportExtendedClientBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowserSupportExtendedClientBuffer")(x.asInstanceOf[js.Any])
  }
}
