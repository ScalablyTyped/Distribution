package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  var acmSessionId: String = js.native
  
  var docRoot: Any = js.native
  
  def downloadAecModelData(): js.Promise[Any] = js.native
  def downloadAecModelData(onFinished: js.Function1[/* data */ Any, Unit]): js.Promise[Any] = js.native
  
  def getFullPath(urn: String): String = js.native
  
  def getItemById(id: String): js.Object = js.native
  
  def getMessages(itemId: String, excludeGlobal: Boolean): js.Object = js.native
  
  def getNumViews(item: js.Object): Double = js.native
  
  def getParentId(item: String): String = js.native
  
  def getPath(): String = js.native
  
  def getPropertyDbPath(): String = js.native
  
  def getRoot(): BubbleNode = js.native
  
  def getRootItem(): js.Object = js.native
  
  def getSubItemsWithProperties(item: js.Object, properties: js.Object, recursive: Boolean): js.Object = js.native
  
  def getThumbnailOptions(item: js.Object, width: Double, height: Double): ThumbnailOptions = js.native
  
  def getThumbnailPath(item: String, width: Double, height: Double): String = js.native
  
  def getViewGeometry(item: js.Object): js.Object = js.native
  
  def getViewableItems(document: Document): Unit = js.native
  
  def getViewablePath(item: js.Object): String = js.native
  def getViewablePath(item: js.Object, outLoadOptions: js.Object): String = js.native
  
  def load(documentId: String, onSuccessCallback: js.Function0[Unit], onErrorCallback: js.Function0[Unit]): Unit = js.native
  def load(
    documentId: String,
    onSuccessCallback: js.Function0[Unit],
    onErrorCallback: js.Function0[Unit],
    accessControlProperties: js.Object
  ): Unit = js.native
  def load(
    documentId: String,
    onSuccessCallback: js.Function0[Unit],
    onErrorCallback: js.Function0[Unit],
    accessControlProperties: js.Object,
    options: js.Object
  ): Unit = js.native
  def load(
    documentId: String,
    onSuccessCallback: js.Function0[Unit],
    onErrorCallback: js.Function0[Unit],
    accessControlProperties: Unit,
    options: js.Object
  ): Unit = js.native
  
  var myData: Any = js.native
  
  def requestThumbnailWithSecurity(data: String, onComplete: js.Function2[/* err */ js.Error, /* response */ Any, Unit]): Unit = js.native
}
