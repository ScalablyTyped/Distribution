package typings.devextreme.anon

import typings.devextreme.devextremeStrings.xmla
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined devextreme.devextreme.DevExpress.data.XmlaStoreOptions & {  type :'xmla'} */
trait XmlaStoreOptionstypexmla extends StObject {
  
  /**
    * Specifies a function that customizes the request before it is sent to the server.
    */
  var beforeSend: js.UndefOr[js.Function1[/* options */ DataType, Unit]] = js.undefined
  
  /**
    * Specifies the database (or initial catalog) that contains the OLAP cube to use.
    */
  var catalog: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the OLAP cube to use from the catalog.
    */
  var cube: js.UndefOr[String] = js.undefined
  
  var `type`: xmla
  
  /**
    * Specifies the OLAP server&apos;s URL.
    */
  var url: js.UndefOr[String] = js.undefined
}
object XmlaStoreOptionstypexmla {
  
  inline def apply(): XmlaStoreOptionstypexmla = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("xmla")
    __obj.asInstanceOf[XmlaStoreOptionstypexmla]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XmlaStoreOptionstypexmla] (val x: Self) extends AnyVal {
    
    inline def setBeforeSend(value: /* options */ DataType => Unit): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
    
    inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    inline def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
    
    inline def setCube(value: String): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    inline def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
    
    inline def setType(value: xmla): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
