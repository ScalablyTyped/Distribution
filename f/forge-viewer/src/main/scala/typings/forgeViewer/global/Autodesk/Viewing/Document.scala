package typings.forgeViewer.global.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Autodesk.Viewing.Document")
@js.native
open class Document protected ()
  extends StObject
     with typings.forgeViewer.Autodesk.Viewing.Document {
  def this(dataJSON: js.Object, path: String, acmsession: String) = this()
}
object Document {
  
  @JSGlobal("Autodesk.Viewing.Document")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getAecModelData(node: typings.forgeViewer.Autodesk.Viewing.BubbleNode): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAecModelData")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* static member */
  inline def getSubItemsWithProperties(item: js.Object, properties: Properties, recursive: Boolean): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubItemsWithProperties")(item.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  
  /* static member */
  inline def load(
    documentId: String,
    successCallback: js.Function1[/* doc */ typings.forgeViewer.Autodesk.Viewing.Document, Unit],
    errorCallback: js.Function3[
      /* errorCode */ typings.forgeViewer.Autodesk.Viewing.ErrorCodes, 
      /* errorMsg */ String, 
      /* messages */ js.Array[Any], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(documentId.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def load(
    documentId: String,
    successCallback: js.Function1[/* doc */ typings.forgeViewer.Autodesk.Viewing.Document, Unit],
    errorCallback: js.Function3[
      /* errorCode */ typings.forgeViewer.Autodesk.Viewing.ErrorCodes, 
      /* errorMsg */ String, 
      /* messages */ js.Array[Any], 
      Unit
    ],
    accessControlProperties: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(documentId.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], accessControlProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
