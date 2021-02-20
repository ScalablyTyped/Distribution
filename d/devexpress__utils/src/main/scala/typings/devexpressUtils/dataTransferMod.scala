package typings.devexpressUtils

import typings.std.DataTransferItem
import typings.std.DataTransferItemList
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTransferMod {
  
  @JSImport("@devexpress/utils/lib/utils/data-transfer", "DataTransferUtils")
  @js.native
  class DataTransferUtils () extends StObject
  /* static members */
  object DataTransferUtils {
    
    @JSImport("@devexpress/utils/lib/utils/data-transfer", "DataTransferUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/data-transfer", "DataTransferUtils.getImageItem")
    @js.native
    def getImageItem(items: DataTransferItemList): File | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/data-transfer", "DataTransferUtils.getPlainTextItem")
    @js.native
    def getPlainTextItem(items: DataTransferItemList): DataTransferItem | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/data-transfer", "DataTransferUtils.getRtfTextItem")
    @js.native
    def getRtfTextItem(items: DataTransferItemList): DataTransferItem | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/data-transfer", "DataTransferUtils.getTransferItemByType")
    @js.native
    def getTransferItemByType(items: DataTransferItemList, `type`: String): DataTransferItem | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/data-transfer", "DataTransferUtils.isBrowserSupportExtendedClientBuffer")
    @js.native
    def isBrowserSupportExtendedClientBuffer: js.Any = js.native
    @scala.inline
    def isBrowserSupportExtendedClientBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowserSupportExtendedClientBuffer")(x.asInstanceOf[js.Any])
  }
}
