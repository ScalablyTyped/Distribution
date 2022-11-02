package typings.facebookNodejsBusinessSdk

import typings.std.Array
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCursorMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/cursor", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Cursor {
    def this(sourceObject: Record[String, Any], targetClass: Record[String, Any], params: Record[String, Any]) = this()
    def this(
      sourceObject: Record[String, Any],
      targetClass: Record[String, Any],
      params: Record[String, Any],
      endpoint: String
    ) = this()
  }
  
  @js.native
  trait Cursor
    extends StObject
       with Array[Record[String, Any]] {
    
    var _api: typings.facebookNodejsBusinessSdk.srcApiMod.default = js.native
    
    def _buildObjectsFromResponse(response: Record[String, Any]): js.Array[Record[String, Any]] = js.native
    
    def _loadPage(path: String): js.Promise[Any] = js.native
    
    var _targetClass: Record[String, Any] = js.native
    
    def clear(): Unit = js.native
    
    def hasNext(): Boolean = js.native
    
    def hasPrevious(): Boolean = js.native
    
    def next(): js.Promise[Any] = js.native
    
    var paging: Any = js.native
    
    def previous(): js.Promise[Any] = js.native
    
    def set(array: js.Array[Record[String, Any]]): Unit = js.native
    
    var sourceObject: Record[String, Any] = js.native
    
    var summary: Any = js.native
  }
}
