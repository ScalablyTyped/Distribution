package typings.detectosJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detectos.js", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DetectOS {
    
    /* CompleteClass */
    var OS: String | Null = js.native
    
    /* CompleteClass */
    var browser: String | Null = js.native
    
    /* CompleteClass */
    override def dataBrowser(): js.Array[PropertyData] = js.native
    
    /* CompleteClass */
    override def dataOS(): js.Array[PropertyData] = js.native
    
    /* CompleteClass */
    override def searchString(data: js.Array[PropertyData]): String | Null = js.native
    
    /* CompleteClass */
    override def searchVersion(dataString: String): Double | Null = js.native
    
    /* CompleteClass */
    var version: String | Null = js.native
  }
  
  trait DetectOS extends StObject {
    
    var OS: String | Null
    
    var browser: String | Null
    
    def dataBrowser(): js.Array[PropertyData]
    
    def dataOS(): js.Array[PropertyData]
    
    def searchString(data: js.Array[PropertyData]): String | Null
    
    def searchVersion(dataString: String): Double | Null
    
    var version: String | Null
  }
  object DetectOS {
    
    inline def apply(
      dataBrowser: () => js.Array[PropertyData],
      dataOS: () => js.Array[PropertyData],
      searchString: js.Array[PropertyData] => String | Null,
      searchVersion: String => Double | Null
    ): DetectOS = {
      val __obj = js.Dynamic.literal(dataBrowser = js.Any.fromFunction0(dataBrowser), dataOS = js.Any.fromFunction0(dataOS), searchString = js.Any.fromFunction1(searchString), searchVersion = js.Any.fromFunction1(searchVersion), OS = null, browser = null, version = null)
      __obj.asInstanceOf[DetectOS]
    }
    
    extension [Self <: DetectOS](x: Self) {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserNull: Self = StObject.set(x, "browser", null)
      
      inline def setDataBrowser(value: () => js.Array[PropertyData]): Self = StObject.set(x, "dataBrowser", js.Any.fromFunction0(value))
      
      inline def setDataOS(value: () => js.Array[PropertyData]): Self = StObject.set(x, "dataOS", js.Any.fromFunction0(value))
      
      inline def setOS(value: String): Self = StObject.set(x, "OS", value.asInstanceOf[js.Any])
      
      inline def setOSNull: Self = StObject.set(x, "OS", null)
      
      inline def setSearchString(value: js.Array[PropertyData] => String | Null): Self = StObject.set(x, "searchString", js.Any.fromFunction1(value))
      
      inline def setSearchVersion(value: String => Double | Null): Self = StObject.set(x, "searchVersion", js.Any.fromFunction1(value))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
    }
  }
  
  trait PropertyData extends StObject {
    
    var identity: String
    
    var prop: js.UndefOr[String] = js.undefined
    
    var string: js.UndefOr[String] = js.undefined
    
    var subString: String
    
    var versionSearch: js.UndefOr[String] = js.undefined
  }
  object PropertyData {
    
    inline def apply(identity: String, subString: String): PropertyData = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], subString = subString.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyData]
    }
    
    extension [Self <: PropertyData](x: Self) {
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setSubString(value: String): Self = StObject.set(x, "subString", value.asInstanceOf[js.Any])
      
      inline def setVersionSearch(value: String): Self = StObject.set(x, "versionSearch", value.asInstanceOf[js.Any])
      
      inline def setVersionSearchUndefined: Self = StObject.set(x, "versionSearch", js.undefined)
    }
  }
}
