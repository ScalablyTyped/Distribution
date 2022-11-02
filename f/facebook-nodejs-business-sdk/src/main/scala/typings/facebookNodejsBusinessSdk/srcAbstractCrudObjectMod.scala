package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAbstractCrudObjectMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/abstract-crud-object", JSImport.Default)
  @js.native
  open class default protected () extends AbstractCrudObject {
    def this(
      id: js.UndefOr[String | Double | Null],
      data: js.UndefOr[Record[String, Any]],
      parentId: js.UndefOr[String | Null],
      api: js.UndefOr[typings.facebookNodejsBusinessSdk.srcApiMod.default | Null]
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("facebook-nodejs-business-sdk/src/abstract-crud-object", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getByIds(
      ids: js.Array[Double],
      fields: js.Array[String],
      params: Unit,
      api: typings.facebookNodejsBusinessSdk.srcApiMod.default
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getByIds")(ids.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], params.asInstanceOf[js.Any], api.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def getByIds(
      ids: js.Array[Double],
      fields: js.Array[String],
      params: Record[String, Any],
      api: typings.facebookNodejsBusinessSdk.srcApiMod.default
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getByIds")(ids.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], params.asInstanceOf[js.Any], api.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  }
  
  @JSImport("facebook-nodejs-business-sdk/src/abstract-crud-object", "AbstractCrudObject")
  @js.native
  open class AbstractCrudObject protected ()
    extends typings.facebookNodejsBusinessSdk.srcAbstractObjectMod.default {
    def this(
      id: js.UndefOr[String | Double | Null],
      data: js.UndefOr[Record[String, Any]],
      parentId: js.UndefOr[String | Null],
      api: js.UndefOr[typings.facebookNodejsBusinessSdk.srcApiMod.default | Null]
    ) = this()
    
    var _api: typings.facebookNodejsBusinessSdk.srcApiMod.default = js.native
    
    var _changes: Record[String, Any] = js.native
    
    var _parentId: js.UndefOr[String | Null] = js.native
    
    def clearHistory(): Record[String, Any] = js.native
    
    def createEdge(endpoint: String, fields: js.Array[String]): js.Promise[Any] = js.native
    def createEdge(
      endpoint: String,
      fields: js.Array[String],
      params: Unit,
      targetClassConstructor: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = js.native
    def createEdge(
      endpoint: String,
      fields: js.Array[String],
      params: Unit,
      targetClassConstructor: js.Function1[/* repeated */ Any, Any],
      pathOverride: String
    ): js.Promise[Any] = js.native
    def createEdge(
      endpoint: String,
      fields: js.Array[String],
      params: Unit,
      targetClassConstructor: Unit,
      pathOverride: String
    ): js.Promise[Any] = js.native
    def createEdge(endpoint: String, fields: js.Array[String], params: Record[String, Any]): js.Promise[Any] = js.native
    def createEdge(
      endpoint: String,
      fields: js.Array[String],
      params: Record[String, Any],
      targetClassConstructor: js.Function1[/* repeated */ Any, Any]
    ): js.Promise[Any] = js.native
    def createEdge(
      endpoint: String,
      fields: js.Array[String],
      params: Record[String, Any],
      targetClassConstructor: js.Function1[/* repeated */ Any, Any],
      pathOverride: String
    ): js.Promise[Any] = js.native
    def createEdge(
      endpoint: String,
      fields: js.Array[String],
      params: Record[String, Any],
      targetClassConstructor: Unit,
      pathOverride: String
    ): js.Promise[Any] = js.native
    
    def delete(): js.Promise[Any] = js.native
    def delete(params: Record[String, Any]): js.Promise[Any] = js.native
    
    def deleteEdge(endpoint: String): js.Promise[Any] = js.native
    def deleteEdge(endpoint: String, params: Record[String, Any]): js.Promise[Any] = js.native
    
    def exportAllData(): Record[String, Any] = js.native
    
    def getApi(): typings.facebookNodejsBusinessSdk.srcApiMod.default = js.native
    
    def getEdge(targetClass: Record[String, Any], fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getEdge(targetClass: Record[String, Any], fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getEdge(
      targetClass: Record[String, Any],
      fields: js.Array[String],
      params: Unit,
      fetchFirstPage: Boolean,
      endpoint: String
    ): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getEdge(
      targetClass: Record[String, Any],
      fields: js.Array[String],
      params: Unit,
      fetchFirstPage: Unit,
      endpoint: String
    ): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getEdge(targetClass: Record[String, Any], fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getEdge(
      targetClass: Record[String, Any],
      fields: js.Array[String],
      params: Record[String, Any],
      fetchFirstPage: Boolean
    ): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getEdge(
      targetClass: Record[String, Any],
      fields: js.Array[String],
      params: Record[String, Any],
      fetchFirstPage: Boolean,
      endpoint: String
    ): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getEdge(
      targetClass: Record[String, Any],
      fields: js.Array[String],
      params: Record[String, Any],
      fetchFirstPage: Unit,
      endpoint: String
    ): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getId(): String = js.native
    
    def getNodePath(): String = js.native
    
    def getParentId(): String = js.native
    
    var id: String = js.native
    
    def read(fields: js.Array[String]): js.Promise[Any] = js.native
    def read(fields: js.Array[String], params: Record[String, Any]): js.Promise[Any] = js.native
    
    def update(): js.Promise[Any] = js.native
    def update(params: Record[String, Any]): js.Promise[Any] = js.native
  }
  /* static members */
  object AbstractCrudObject {
    
    @JSImport("facebook-nodejs-business-sdk/src/abstract-crud-object", "AbstractCrudObject")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getByIds(
      ids: js.Array[Double],
      fields: js.Array[String],
      params: Unit,
      api: typings.facebookNodejsBusinessSdk.srcApiMod.default
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getByIds")(ids.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], params.asInstanceOf[js.Any], api.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def getByIds(
      ids: js.Array[Double],
      fields: js.Array[String],
      params: Record[String, Any],
      api: typings.facebookNodejsBusinessSdk.srcApiMod.default
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getByIds")(ids.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], params.asInstanceOf[js.Any], api.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  }
}
