package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigtableOptions extends StObject {
  
  var columnFamilies: js.UndefOr[js.Array[BigtableColumnFamily]] = js.undefined
  
  var ignoreUnspecifiedColumnFamilies: js.UndefOr[Boolean] = js.undefined
  
  var readRowkeyAsString: js.UndefOr[Boolean] = js.undefined
}
object BigtableOptions {
  
  @scala.inline
  def apply(): BigtableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableOptions]
  }
  
  @scala.inline
  implicit class BigtableOptionsMutableBuilder[Self <: BigtableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnFamilies(value: js.Array[BigtableColumnFamily]): Self = StObject.set(x, "columnFamilies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnFamiliesUndefined: Self = StObject.set(x, "columnFamilies", js.undefined)
    
    @scala.inline
    def setColumnFamiliesVarargs(value: BigtableColumnFamily*): Self = StObject.set(x, "columnFamilies", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreUnspecifiedColumnFamilies(value: Boolean): Self = StObject.set(x, "ignoreUnspecifiedColumnFamilies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUnspecifiedColumnFamiliesUndefined: Self = StObject.set(x, "ignoreUnspecifiedColumnFamilies", js.undefined)
    
    @scala.inline
    def setReadRowkeyAsString(value: Boolean): Self = StObject.set(x, "readRowkeyAsString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadRowkeyAsStringUndefined: Self = StObject.set(x, "readRowkeyAsString", js.undefined)
  }
}
