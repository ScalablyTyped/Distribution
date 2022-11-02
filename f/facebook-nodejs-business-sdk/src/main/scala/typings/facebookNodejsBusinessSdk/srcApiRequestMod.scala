package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcApiRequestMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/api-request", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with APIRequest {
    def this(nodeId: String, method: String, endpoint: String) = this()
  }
  
  @js.native
  trait APIRequest extends StObject {
    
    var _endpoint: String = js.native
    
    var _fields: js.Array[String] = js.native
    
    var _fileCounter: Double = js.native
    
    var _fileParams: Record[String, Any] = js.native
    
    var _method: String = js.native
    
    var _nodeId: String = js.native
    
    var _params: Record[String, Any] = js.native
    
    var _path: js.Array[String] = js.native
    
    def addField(field: String): APIRequest = js.native
    
    def addFields(fields: js.Array[String]): APIRequest = js.native
    
    def addFile(filePath: String): APIRequest = js.native
    
    def addFiles(filePaths: js.Array[String]): APIRequest = js.native
    
    def addParam(key: String, value: Any): APIRequest = js.native
    
    def addParams(params: Record[String, Any]): APIRequest = js.native
    
    def endpoint: String = js.native
    
    def fields: js.Array[String] = js.native
    
    def fileParams: Record[String, Any] = js.native
    
    def method: String = js.native
    
    def nodeId: String = js.native
    
    def params: Record[String, Any] = js.native
    
    def path: js.Array[String] = js.native
  }
}
