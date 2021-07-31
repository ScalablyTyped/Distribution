package typings.extjs.Ext.data

import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IReader
  extends StObject
     with IObservable {
  
  /** [Method] Takes a raw response object as passed to the read method and returns the useful data segment from it
    * @param response Object The response object
    * @returns Ext.data.ResultSet A ResultSet object
    */
  var getResponseData: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IResultSet]] = js.undefined
  
  /** [Config Option] (String) */
  var idProperty: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var implicitIncludes: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var messageProperty: js.UndefOr[String] = js.undefined
  
  /** [Property] (Object) */
  var metaData: js.UndefOr[js.Any] = js.undefined
  
  /** [Property] (Object) */
  var rawData: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Reads the given response object
    * @param response Object The response object. This may be either an XMLHttpRequest object or a plain JS object
    * @returns Ext.data.ResultSet The parsed or default ResultSet object
    */
  var read: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Any], IResultSet]] = js.undefined
  
  /** [Method] Abstracts common functionality used by all Reader subclasses
    * @param data Object The raw data object
    * @returns Ext.data.ResultSet A ResultSet object
    */
  var readRecords: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], IResultSet]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var readRecordsOnFailure: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var successProperty: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var totalProperty: js.UndefOr[String] = js.undefined
}
object IReader {
  
  @scala.inline
  def apply(): IReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReader]
  }
  
  @scala.inline
  implicit class IReaderMutableBuilder[Self <: IReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetResponseData(value: /* response */ js.UndefOr[js.Any] => IResultSet): Self = StObject.set(x, "getResponseData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetResponseDataUndefined: Self = StObject.set(x, "getResponseData", js.undefined)
    
    @scala.inline
    def setIdProperty(value: String): Self = StObject.set(x, "idProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdPropertyUndefined: Self = StObject.set(x, "idProperty", js.undefined)
    
    @scala.inline
    def setImplicitIncludes(value: Boolean): Self = StObject.set(x, "implicitIncludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitIncludesUndefined: Self = StObject.set(x, "implicitIncludes", js.undefined)
    
    @scala.inline
    def setMessageProperty(value: String): Self = StObject.set(x, "messageProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagePropertyUndefined: Self = StObject.set(x, "messageProperty", js.undefined)
    
    @scala.inline
    def setMetaData(value: js.Any): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaDataUndefined: Self = StObject.set(x, "metaData", js.undefined)
    
    @scala.inline
    def setRawData(value: js.Any): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawDataUndefined: Self = StObject.set(x, "rawData", js.undefined)
    
    @scala.inline
    def setRead(value: /* response */ js.UndefOr[js.Any] => IResultSet): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadRecords(value: /* data */ js.UndefOr[js.Any] => IResultSet): Self = StObject.set(x, "readRecords", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadRecordsOnFailure(value: Boolean): Self = StObject.set(x, "readRecordsOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadRecordsOnFailureUndefined: Self = StObject.set(x, "readRecordsOnFailure", js.undefined)
    
    @scala.inline
    def setReadRecordsUndefined: Self = StObject.set(x, "readRecords", js.undefined)
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSuccessProperty(value: String): Self = StObject.set(x, "successProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessPropertyUndefined: Self = StObject.set(x, "successProperty", js.undefined)
    
    @scala.inline
    def setTotalProperty(value: String): Self = StObject.set(x, "totalProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPropertyUndefined: Self = StObject.set(x, "totalProperty", js.undefined)
  }
}
