package typings.devexpressUtils

import typings.std.DataTransferItem
import typings.std.DataTransferItemList
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/data-transfer", JSImport.Namespace)
@js.native
object dataTransferMod extends js.Object {
  
  @js.native
  class DataTransferUtils () extends js.Object
  /* static members */
  @js.native
  object DataTransferUtils extends js.Object {
    
    def getImageItem(items: DataTransferItemList): File | Null = js.native
    
    def getPlainTextItem(items: DataTransferItemList): DataTransferItem | Null = js.native
    
    def getRtfTextItem(items: DataTransferItemList): DataTransferItem | Null = js.native
    
    def getTransferItemByType(items: DataTransferItemList, `type`: String): DataTransferItem | Null = js.native
    
    var isBrowserSupportExtendedClientBuffer: js.Any = js.native
  }
}
